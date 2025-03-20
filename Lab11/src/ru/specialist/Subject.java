package ru.specialist;

public interface Subject {
	
	void registerObserver(Observer observer);
	
	void registerCloneObserver(Observer observer);
	
	void registerEqualsObserver(Observer observer);

}
