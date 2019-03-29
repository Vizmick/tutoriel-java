package java_se;

import java.util.Scanner;

public class Dessin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un nombre");
		int n=sc.nextInt();
		sc.close();
		
		System.out.println("Ligne d'étoiles");
		System.out.println(ligne(n));
		System.out.println("Carré d'étoiles");
		carré(n);
		System.out.println("Triangle d'étoiles");
		triangle(n);
		
	}

	private static String ligne(int n) {
		if (n==1) {
			return "*";
		} else {
			return ligne(n-1)+"*";
		}
	}

	private static void carré(int n) {
		String ligne=ligne(n);
		for (int i=0; i<n; i++) {
			System.out.println(ligne);
		}
	}
	
	private static void triangle(int n) {
		String ligne="";
		for (int i=0; i<n; i++) {
			ligne=ligne+"*";
			System.out.println(ligne);
		}
	}
}
