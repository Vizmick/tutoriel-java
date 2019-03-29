package euler;

public class Gauss {
	int Re, Im;

	public Gauss(int a, int b) {
		Re = a;
		Im = b;
	}

	public Gauss multiply(Gauss facteur) {
		int Rf = facteur.Re;
		int If = facteur.Im;

		int Rrep = Rf * Re - If * Im;
		int Irep = If * Re + Rf * Im;
		Gauss Rep = new Gauss(Rrep, Irep);
		return Rep;
	}
	
	public int modulecarré() {
		return Re*Re+Im*Im;
	}
	
	public Boolean diviseur(Gauss z) {
		return (this.modulecarré() % z.modulecarré() == 0);
	}
}
