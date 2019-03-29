package test;

import java.util.Scanner;

public class Impots {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quel age?");
		int age = scan.nextInt();

		System.out.println("Homme (H) ou Femme (F) ou Autre (A)?");
		String genre = scan.next();

		String rep = "Non imposable";

		if ((age > 20) && (genre.equals("H"))) {
			rep = "Imposable";
		} else if ((genre.equals("F")) && (age > 18) && (age < 35)) {
			rep = "Imposable";
		} else if (!((genre.equals("F")) || (genre.equals("H")) || (genre.equals("A")))) {
			rep = "Erreur de saisie";
		}
		System.out.println(rep);
		System.out.println(genre);

		scan.close();

	}

}
