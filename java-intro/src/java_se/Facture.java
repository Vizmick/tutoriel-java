package java_se;

import java.util.Scanner;
/**
 * Etablit le montant total correspondant à des factures entrées par l'utilisateur
 * version1.0
 * @author Formation
 *
 */
public class Facture {

	public static void main(String[] args) {
		float prix = 0;
		float nombre = 0;
		float taux = 0;
		float total = 0;
		Boolean ongoing = true;
		Scanner sc = new Scanner(System.in);

		while (ongoing) {

			System.out.println("Entrez le prix HT");
			prix = Float.valueOf(sc.nextLine());

			System.out.println("Entrez nombre d'articles");
			nombre = Float.valueOf(sc.nextLine());

			System.out.println("Entrez le taux de TVA");
			taux = Float.valueOf(sc.nextLine());
			prix *= 1 + (taux / 100);
			prix *= nombre;
			total += prix;

			System.out.println("Encore des factures?  (O/N)");
			if (sc.nextLine().contentEquals("N")) {
				System.out.println("Etes-vous sûr de vouloir terminer? (O/N)");
				if (sc.nextLine().contentEquals("O")) {
					ongoing = false;// break
				}
			}
		}

		System.out.print("Le prix total est:");
		System.out.println(total);
		sc.close();
	}

}
