package test;
import java.util.Scanner;

/**
 * Prend une heure dans la console et renvoie l'heure dans une minute.
 * @author Victor
 *
 */
public class Heure {

	public static void main(String[] args) {
		int h, minute = 0;
		
		Scanner scan=new Scanner(System.in);
		h=scan.nextInt();
		minute=scan.nextInt();
		scan.close();
		
		if (minute==59) {
			h=(h+1) % 24;
			minute=0;
		} else {
			minute=(minute+1) % 60;
		} 
		
		System.out.printf("Dans une minute, il sera %1$d heures %2$d minutes",h ,minute );
	}

}
