package java_se;
import java.io.Console;
import java.util.*;

public class LoopFor {

	public static void main(String[] args) {
		Integer i1= 1;
		Integer i2= 2;
		Integer i3= 3;
		Integer i4= 4;
		Integer i5= 5;

		ArrayList<Integer> entier = new ArrayList<Integer>();
		entier.add(i1);
		entier.add(i2);
		entier.add(i3);
		entier.add(i4);
		entier.add(i5);
		for (int i:entier) {
			System.out.println(i);
		}
		
		Console console=System.console();
	}

}
