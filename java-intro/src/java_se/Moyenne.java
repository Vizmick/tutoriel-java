package java_se;

import java.util.Scanner;
import java.util.*;
/**
 * Permet de calculer une moyenne de notes
 * @author Formation
 *
 */

public class Moyenne {

	private static Scanner sc =null;
	private static Integer n= null;
	private static float[] tab=null;
	private static String err ="";
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Combien de notes?");
		n = sc.nextInt();
		
		tab = new float[n];
		
		recupdesnotes();
		
		float moy = Tableau.moy(tab);
		System.out.printf("La moyenne de la classe est %s", moy);
		sc.close();
	}

	private static void recupdesnotes() {
		for (int i = 0; i < n; i++) {
			System.out.println("Entrez une note (Attention, utilisez ',' et non '.')");
			try {tab[i] = sc.nextFloat();}
			catch (InputMismatchException e) {
				System.out.println("Erreur! Vous avez utilisé '.', la note n'a pas été prise en compte");
				i--;
				err=sc.nextLine();
				}
		}
	}
}
