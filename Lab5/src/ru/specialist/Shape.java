package ru.specialist;

abstract class Shape implements Comparable<Shape>{

	private String color;

	public Shape(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	abstract public void draw();
	
	abstract public int getX();
	abstract public int getY();
	

	public double distance() {
		return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
	};
	
	@Override
	public int compareTo(Shape o) {
		return (int) (this.distance() - o.distance());
	}
	
}
