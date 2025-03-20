package ru.specialist;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Scene implements Serializable, Observed {

	// описание паттерна singleton
	  private static final Scene INSTANCE = new Scene();
	  
	  private Scene() {}
	  
	  public static Scene getInstance(){
	    return INSTANCE;
	  }
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6;


	private ArrayList<Shape> shapeMass = new ArrayList<Shape>();

	
	  public void add(Shape sh) { 
		shapeMass.add(sh); 
		notifyObservers();
		  }
	 

	public void draw() {
		for (Shape sh : shapeMass)
			sh.draw();
	}

	
	  public void sort() { 
		Collections.sort(shapeMass);
	  }
	 

	public void save(String filename) throws IOException {
		try (var oos = new FileOutputStream(filename); var writer = new PrintWriter(oos)) {

			writer.println('[');
			for (Shape sh : shapeMass) {
				writer.println("\t{");
				if (sh instanceof Point p) {
					writer.println("\t\t type : Point,");
					writer.printf("\t\t x : %d,\n", p.getX());
					writer.printf("\t\t y : %d,\n", p.getY());
					writer.printf("\t\t color : %s\n", p.getColor());
				}
				if (sh instanceof Cirlce c) {
					writer.println("\t\t type : Cirlce,");
					writer.printf("\t\t x : %d,\n", c.getX());
					writer.printf("\t\t y : %d,\n", c.getY());
					writer.printf("\t\t r : %d,\n", c.getR());
					writer.printf("\t\t color : %s\n", c.getColor());
				}
				writer.println("\t}");
			}

			writer.println(']');

		}
	}

	
	ArrayList<Observer> subskribers = new ArrayList<Observer>();
	
	@Override
	public void addObserver(Observer observer) {
		this.subskribers.add(observer);		
	}

	
	@Override
	public void notifyObservers() {
		for(Observer obs : subskribers)
			obs.handleEvent(shapeMass.toString().lines().toList());
	}

}
