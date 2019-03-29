package test;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Quelle est la température de l'eau?");
		int Temp=scan.nextInt();
		String rep="";
		
		if (Temp<0) {
			rep="C'est de la glace";
		} else if(Temp>100) {
			rep="'C'est de la vapeur";
		} else rep="C'est de l'eau";
				
		System.out.println(rep);
		scan.close();
	}
}
