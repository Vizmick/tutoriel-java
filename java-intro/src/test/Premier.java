package test;

import java.util.Scanner;

public class Premier {
	public static void main(String[] args) {
		System.out.println("Hello World ");
		String hello = "Hello World";
		System.out.println(hello);

		System.out.println("De quel nombre voulez vous prendre la factorielle?");

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int f = MathFunctions.factorielle(n);
		System.out.println(f);

		System.out.println("Entrez 20 nombres entiers positifs");
		int compteur = 0, argmax = 0, maxi = 0, nombrelu = 0;

		while (compteur < 20) {
			compteur += 1;
			nombrelu = scan.nextInt();

			if (nombrelu >= maxi) {
				maxi = nombrelu;
				argmax = compteur;
			}
		}

		if (argmax == 0) {
			System.out.println("Les nombres sont tous négatifs");
		} else {
			System.out.printf("Le plus grand nombre est %2$d et est en position %1$d", argmax, maxi);
		}

		scan.close();
		
	}
}
