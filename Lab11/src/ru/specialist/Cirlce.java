package ru.specialist;

import java.util.Objects;

public class Cirlce extends Shape{

	private int x;
	private int y;
	private int r;
	
	
	
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

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public Cirlce(int x, int y, int r, String color) {
		super(color);
		setR(r);
		setX(x);
		setY(y);
	}
	
	@Override
	public void draw() {
		System.out.printf("Circle.draw x: %d y: %d r: %d color: %s\n", getX(), getY(), getR(), getColor());
	}
	
	@Override
	public double distance() {
		return super.distance();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Cirlce(getX(), getY(), getR(), getColor());
	}

	@Override
	public int hashCode() {
		return Objects.hash(r, x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)return true;
		if (obj == null)return false;
		if (getClass() != obj.getClass()) return false;
		
		Cirlce other = (Cirlce) obj;
		
		return  this.getX() == other.getX() && 
				this.getY() == other.getY() && 
				this.getR() == other.getR() &&
				this.getColor().equals(other.getColor());
	}

	@Override
	public String toString() {
		return "Circle";
	}
	
	
}
