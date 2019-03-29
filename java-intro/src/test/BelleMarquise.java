package test;

public class BelleMarquise {

	public static void main(String[] args) {
		String nom1 = "Belle Marquise";
		String phrase1 = "vos beaux yeux me font mourir d'amour";
		String nom2 = "Grosse pute";
		String phrase2 = "lache moi les baskets";
		
		System.out.printf("%1$s, %2$s", nom1, phrase1);
		System.out.println();
		System.out.printf("%1$s, %2$s", nom1, phrase2);
		System.out.println();
		System.out.printf("%1$s, %2$s", nom2, phrase1);
		System.out.println();
		System.out.printf("%1$s, %2$s", nom1, phrase2);
	}

}
