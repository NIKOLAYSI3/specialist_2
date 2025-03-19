package ru.specialist.game;

import java.time.LocalTime;
import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;

public class GameApp {

	public static void main(String[] args) {
		// Lab 7
		
			
		System.out.println("Выбери свой язык ru or us\nChoose your language ru or us");
		Scanner newLanguage = new Scanner(System.in);
		String newLang = newLanguage.nextLine();
		
		var text = ResourceBundle.getBundle("ru.specialist.game.text");
		
		switch(newLang) {
		case "ru":
			Locale.setDefault(Locale.of("RU"));
			text = ResourceBundle.getBundle("ru.specialist.game.text");
			break;
		case "us":
			Locale.setDefault(Locale.of("US"));
			text = ResourceBundle.getBundle("ru.specialist.game.text");
			break;
		}

		
		int rand = new Random().nextInt(100)+1;
		// ПРОВЕРКА РАНДОМА!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		System.out.printf("random number is: %d\n", rand);
		
		int count = 1;
		System.out.println(text.getString("prestart"));
		Scanner scan = new Scanner(System.in);
		
		int chanceCount = scan.nextInt();
		
		
		
		System.out.println(text.getString("start"));
		
		long time = System.currentTimeMillis();
		
		int number = scan.nextInt();
	
		 do {
			
			if(count == chanceCount) {
				System.out.println(text.getString("notyet1"));
				break;
			} else
			
			if(number == 0) {
				System.out.println(text.getString("surrender"));
				break;
			}
			if(number > rand) {
				count++;
				System.out.println(text.getString("findnumberless"));
			}
			else  {
				count++;
				System.out.println(text.getString("findnumbermore"));
			} 
			number = scan.nextInt();
			if(number == rand) {
				System.out.println(text.getString("findnumber"));
				break;
			}
			
		} while((System.currentTimeMillis() - time) < 30000);
		System.out.println(text.getString("endtimegame"));
		
	}

}
