package java_se;

import java.util.Scanner;

public class Ihm {

	 static String response ="";
	 static Scanner sc=null;
	
	public static void main(String[] args) {
		open();
		dialog();
		close();
	}
	public static void open() {
		sc = new Scanner(System.in);
		System.out.println("");
	}
	
	public static void close() {
		System.out.println(response);
		sc.close();
	}
	
	public static void dialog() {
		
	}

}
