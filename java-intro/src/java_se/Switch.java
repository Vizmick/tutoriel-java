package java_se;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		String response = "Erreur de saisie";
		Scanner sc = new Scanner(System.in);
		boolean ongoing = true;
		while (ongoing) {
			System.out.println("Entrez 'O' pour ouvrir un autre fichier, 'Q' pour quitter ou 'S' pour sauvegarder");
			switch (sc.nextLine().toUpperCase()) {
			case "O":
				response = "Aucun fichier dans le répertoire";
				break;
			case "Q":
				response = "Au revoir";
				ongoing=false;
				break;
			case "S":
				response = "Fichier sauvegardé";
				break;

			}
		}

		System.out.println(response);
		sc.close();

	}

}
