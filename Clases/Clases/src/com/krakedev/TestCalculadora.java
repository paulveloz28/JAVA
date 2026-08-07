package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {

		
		Calculadora c1 = new Calculadora();

	      int r1;
	      
	      r1 = c1.sumar(4, 2);

	      System.out.println("Resultado Suma: " + r1);

	      int r2;
	      
	      r2 = c1.restar(4, 2);

	      System.out.println("Resultado Resta: " + r2);
	      
	      double r3;
	      r3 = c1.multiplicar(10, 5);
	      System.out.println("Resultado Multiplicacion: " + r3);
	      
	      double r4;
	      r4 = c1.dividir(6, 2);
	      System.out.println("Resultado Multiplicacion: " + r4);
	}

}
