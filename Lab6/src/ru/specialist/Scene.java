package ru.specialist;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Arrays;

public class Scene implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 6;
	
	
	
	private int shapeCounter = 0;
	public static final int MAX_LENGTH = 10;
	
	private Shape[] shapeMass = new Shape[MAX_LENGTH];
	
	public void add(Shape sh) {
		if (shapeCounter < MAX_LENGTH)
		shapeMass[shapeCounter++] = sh;
		else
			System.out.println("Превышено допустимое число рамзера массива");
	}
	
	public void draw() {
		for(int i = 0; i < shapeCounter; i++) {
			shapeMass[i].draw();
		}
	}
	
	public void sort() {
		Arrays.sort(shapeMass, 0, shapeCounter);
	}
	
	public void save(String filename) throws IOException {
		try (var oos = new FileOutputStream(filename); var writer = new PrintWriter(oos)){
			
			writer.println('[');
			for(int i = 0; i < shapeCounter; i++) {
				writer.println("\t{");
				if(shapeMass[i] instanceof Point p) {
					writer.println("\t\t type : Point,");
					writer.printf("\t\t x : %d,\n", p.getX());
					writer.printf("\t\t y : %d,\n", p.getY());
					writer.printf("\t\t color : %s\n", p.getColor());
				}
				if(shapeMass[i] instanceof Cirlce c) {
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
	
}
