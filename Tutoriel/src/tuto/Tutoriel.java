package tuto;



public class Tutoriel {

	public static void main(String[] args) {
		Exercice test= new Exercice("Testfile");
		test.setBonneReponse("rien");
		test.setQuestion("Que fait la m�thode main()?");
		
		
		test.write();
		

	}

}
