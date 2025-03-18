package ru.specialist;

import java.util.Objects;

public class Point extends Shape{

	private int x;
	private int y;
	
	
	public int getX() {
		return x;
	}




	public void setX(int x) {
		this.x = x;
	}




	public int getY() {
		return y;
	}




	public void setY(int y) {
		this.y = y;
	}

	
	public Point(int x, int y, String color) {
		super(color);
		setX(x);
		setY(y);
		
	};

	@Override
	public void draw() {
		System.out.printf("Point.draw x: %d y: %d color: %s\n", getX(), getY(), getColor());
	}

	@Override
	public double distance() {
		return super.distance();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Point(getX(), getY(), getColor());
	}


	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)return true;
		if (obj == null)return false;
		if (getClass() != obj.getClass())return false;
		
		Point other = (Point) obj;
		
		return this.getX() == other.getX() && 
				this.getY() == other.getY() && 
				this.getColor().equals(other.getColor());
	}

}
