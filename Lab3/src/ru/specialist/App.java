package ru.specialist;

public class App {

	public static void main(String[] args) {
		// Лабораторная работа №3
		// Выводим в консоль что за объект

		Scene sc = new Scene();
		
		sc.add(new Point(12, 20, "Grey"));
		sc.add(new Cirlce(13, 30, 33, "Red"));
		sc.add(new Point(2, 8, "Orange"));
		
		sc.draw();
		
	}

}
