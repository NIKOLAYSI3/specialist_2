package ru.specialist;

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


}
