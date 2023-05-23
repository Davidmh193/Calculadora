package Prueba;

public class Calculadora {

	public static int suma(int a, int b) {
		return a + b;
	}

	public static int resta(int a, int b) {
		return a - b;
	}

	public static int divide(int a, int b) {
		
		 if (b == 0) {
	            throw new IllegalArgumentException("Cannot divide by zero!");
	        }
	        return (int) ((double) a / (double) b);
	}

	public static int multiplicar(int a, int b) {
		return a * b;
	}

}
