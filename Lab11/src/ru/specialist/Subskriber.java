package ru.specialist;

import java.util.List;

public class Subskriber implements Observer{

	String name;
	
	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void handleEvent(List<String> figures) {
		System.out.printf("Hello, %-10s The %s is build!\n",name, figures);
	}

}
