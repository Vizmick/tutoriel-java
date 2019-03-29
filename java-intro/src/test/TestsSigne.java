package test;

import java.util.Scanner;

public class TestsSigne {

	public static void main(String[] args) {
		test_memesigne();
	}

	public static void test_memesigne() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entrez un premier nombre");
		float nombre1 = sc.nextFloat();
		System.out.println("Entrez un second nombre");
		float nombre2 = sc.nextFloat();

		Boolean memeSigne = (signe(nombre1)) == (signe(nombre2)) || (nombre1 == 0) || (nombre2 == 0);
		if (memeSigne) {
			System.out.println("Les deux nombres sont de même signe");
		} else
			System.out.println("Les deux nombres sont de signes différents ");
		sc.close();

	}

	public static String signe(float x) {
		if (x == 0) {
			return "zero";
		} else if (x > 0) {
			return "positif";
		} else
			return "negatif";
	}
}
