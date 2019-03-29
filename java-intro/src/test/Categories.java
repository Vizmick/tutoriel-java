package test;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Categories {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quel age?");
		int age = scan.nextInt();
		String rep = "";
		if (age < 6) {
			rep = "Trop jeune";
		} else if (age < 8) {
			rep = "Poussin";
		} else if (age < 10) {
			rep = "Pupille";
		} else if (age < 12) {
			rep = "Minime";
		} else if (age < 18) {
			rep = "Cadet";
		} else {
			rep = "Senior";
		}
		System.out.println(rep);
		scan.close();
		Calendar calendar =Calendar.getInstance();

		System.out.printf("Nous sommes en %s", calendar.get(1));
		LocalDateTime date=LocalDateTime.now();
		System.out.println();
		System.out.println(date.getYear());
		
	}

}
