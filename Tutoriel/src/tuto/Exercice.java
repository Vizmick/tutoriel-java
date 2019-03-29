package tuto;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercice {
	private File program =null;
	private String filePath = "";
	private String question ="";
	private String bonneReponse ="";
	
	public static void main(String[] args) {

		
	}
	
	public Exercice(String className) {
		filePath =String.format("C:\\Users\\Formation\\eclipse-workspace\\java-intro\\src\\tuto\\%s.java",className );
		program = new File(filePath);
	}
	
	public void write() {
		try {
			Scanner readFile =new Scanner(program);
			while (readFile.hasNextLine()){
				System.out.println(readFile.nextLine());
			}
			readFile.close();
			System.out.println(question);
			
			
		}
		catch (FileNotFoundException e) {
			System.out.println("Le fichier n'existe pas ");
		}
		Scanner console=new Scanner(System.in);
		String reponse= console.nextLine();
		
		if (reponse.contentEquals(bonneReponse)) {
			System.out.println("Bravo!");
		} else {
			System.out.printf("Faux, la bonne réponse était '%s'", bonneReponse);
		}
		console.close();
	}
	
	public void setQuestion(String q) {
		question=q;
	}
	
	public void setBonneReponse(String rep) {
		bonneReponse=rep;
	}
}
