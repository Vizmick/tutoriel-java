package java_se;

import java.util.ArrayList;
import java.util.Scanner;

public class MoyenneListe {

	public static void main(String[] args) {
		String response = "";
		Scanner sc = new Scanner(System.in);
		ArrayList<Float> list = new ArrayList<Float>();
		String question = "Entrez une note, ou appuyez sur une lettre pour sortir. (ne pas utiliser '.')";
		
		
		boolean ongoing = true;
		while (ongoing) {
			System.out.println(question);
			if (!sc.hasNextFloat()) {
				ongoing = false;
				if (sc.next().contains(".")) {
					System.out.println("erreur de saisie");
					System.out.println();
					ongoing=true;
				}
			} else {
				list.add(sc.nextFloat());
			}
		}

		response = String.format("La moyenne est %s", moy(list));
		System.out.println(response);
		sc.close();

	}

	public static float moy(ArrayList<Float> list) {
		float som = 0;
		float len = list.size();
		som = list.stream().reduce((a, b) -> a + b).get();
		return som / len;
	}
}
