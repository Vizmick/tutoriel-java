package java_se;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		Console console=System.console();
		String response ="";
		if (console!=null) {
			response=console.readLine();
		} else {
			response="Pas de console";
		}
		System.out.println(response);
	}
}
