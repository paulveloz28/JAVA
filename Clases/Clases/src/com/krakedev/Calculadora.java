package com.krakedev;

public class Calculadora {
	
	public int sumar(int a, int b) {
		  
	    int resultado;
	    resultado = a + b;
	    return resultado;

	  }

	  public int restar(int a, int b) {
	  
	    int resultado;
	    resultado = a - b;
	    return resultado;
	  }
	  
	  public double multiplicar(double valor1, double valor2) {

			double resultado;
			resultado = valor1 * valor2;
			return resultado;

	  }
	  
	  public double dividir(double dividendo, double divisor) {
		  
		  double resultado;
		  resultado = dividendo / divisor;
		  return resultado;
	  }
	  
	  public double promediar(double a, double b, double c) {
		  
		  double resultado;
		  resultado = (a + b + c) / 3;
		  return resultado;
	  }

}


