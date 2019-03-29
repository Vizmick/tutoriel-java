package test;

public class While {
	
	public static String pair(int i) {
		return (i % 2==0)?"pair":"impair";
	}
	
	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {

			System.out.printf("%1$s est %2$s", i, pair(i));
			System.out.println();
			
			i++;
			if (i==5) {
				i=10;//break
			}
		}

	}

}
