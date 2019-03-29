package test;

import java.util.Scanner;

public class TablesDeMultiplication {
	public static void main(String[] args) {
		int nombre= 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("De quel nombre voulez vous la table?");
		nombre = scan.nextInt();
		for (int i=1; i<11; i++) {
			System.out.printf("%1$d x %2$d = %3$d", nombre, i, nombre*i);
			System.out.println();
		}
		scan.close();
	}
}
