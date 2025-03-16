package ru.specialist;

import java.util.Arrays;

public class Scene{


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
	
}
