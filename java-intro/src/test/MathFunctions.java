package test;

/**
 * quelques fonctions mathématiques, pour l'instant seulement factorielle
 * 
 * @author Formation
 * @version 1.0
 */

public class MathFunctions {

	private static int fact(int n, int acc) {
		int result = n == 0 ? acc : fact(n - 1, acc * n);
		return result;
	}

	public static int factorielle(int n) {
		return fact(n, 1);
	}

	public static int max(int a, int b) {
		int res = a > b ? a : b;
		return res;
	}
}
