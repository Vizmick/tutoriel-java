package java_se;

import java.util.*;
/**
 * Contient des méthodes utiles sur les tableaux et une fonction main test
 * 
 * @version 1.0
 * @author Formation
 *
 */

public class Tableau {

	public static void main(String[] args) {
		int[] tabInt10 = new int[10];
		int[] tabInt12 = new int[12];

		for (int i = 0; i < 10; i++) {
			tabInt10[i] = 2 * i;
			tabInt12[i] = 1 + 2 * i;
		}
		tabInt12[10] = 21;
		tabInt12[11] = 23;

		System.out.println("Le tableau 12 impair");
		print(tabInt12);
		System.out.println("Le tableau 10 pair");
		print(tabInt10);

		List<Integer> arr = Arrays.asList(5, 6);
		arr.stream().map(x -> x * x).forEach(System.out::println);
	}

	public static void print(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
	}

	public static float moy(float[] tab) {
		float som = 0;
		int len= tab.length;
		for (int i=0; i<len ;i++) {
			som+=tab[i];
		}
		return som/len;
	}
}
