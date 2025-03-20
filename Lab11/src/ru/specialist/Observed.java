package ru.specialist;

public interface Observed {
	
	public void addObserver(Observer observer);
	
	public void notifyObservers();

}
