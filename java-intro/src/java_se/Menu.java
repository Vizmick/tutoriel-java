package java_se;

public class Menu extends template.Ihm {
	public static void main(String[] args) {
		open();
		
		dialog();	
		
		close();
		
	}
	public static void dialog() {
		System.out.println("Entrez 'O' pour ouvrir un autre fichier, 'Q' pour quitter ou 'S' pour sauvegarder");
		switch (sc.nextLine().toUpperCase()) {
			case "O":
				response="Aucun fichier dans le répertoire";
				break;
			case "Q":
				response="Au revoir";
				break;
			case "S":
				response="Fichier sauvegardé";
				break;}
	}
}
