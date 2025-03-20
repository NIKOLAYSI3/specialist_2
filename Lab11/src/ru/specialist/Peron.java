package ru.specialist;

import java.util.ArrayList;

public class Peron implements Observer{

	ArrayList<String> person = new ArrayList<String>();
	
	
	
	protected void setPerson(ArrayList<String> person) {
		this.person = person;
	}

	@Override
	public void update(Scene scene) { // не знаю что сюда вписать
		
	}
	
}
