package ru.specialist;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) throws CloneNotSupportedException, IOException {
		// Лабораторная работа №11
		
		Subskriber firstsubskriber = new Subskriber();
		Subskriber secondsubskriber = new Subskriber();
		firstsubskriber.name = "Nikolay";
		secondsubskriber.name = "Sergey";
		

		Scene sc = Scene.getInstance();
		
		sc.addObserver(firstsubskriber);
		sc.addObserver(secondsubskriber);
		
		sc.add(new Point(12, 20, "Grey"));
		sc.add(new Cirlce(13, 30, 33, "Red"));
		sc.add(new Point(2, 8, "Orange"));
		
		
		Point p1 = new Point(2, 4, "Yellow");
		Point p2 = new Point(2, 4, "Purple");
		Point p3 = new Point(2, 5, "Yellow");
		Point p4 = new Point(2, 4, "Yellow");
		
		Cirlce c1 = new Cirlce(2, 4, 5, "Yellow");
		Cirlce c2 = new Cirlce(2, 4, 0, "Purple");
		
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p4));
		
		System.out.println();
		
		System.out.println(p1.equals(c1));
		System.out.println(p1.equals(c2));
		
		System.out.println();
		
		System.out.println(c1.clone().equals(c1));
		System.out.println(c1.clone().equals(c2));
		
		System.out.println();
		
		sc.sort();
		sc.draw();
		
	//	sc.save("../testLab8.json");
		
	}

}
