package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuadrado c1 = new Cuadrado();
		c1.lado = 4;
		
		int resultadoArea; 
		resultadoArea = c1.calcularArea();
		System.out.println("Resultado area cuadrado 1: " + resultadoArea);
		
		double resultadoPerimetro;
		resultadoPerimetro = c1.calcularPerimetro();
		System.out.println("Resultado perimetro cuadrado 1: " + resultadoPerimetro);
		
		Cuadrado c2 = new Cuadrado();
		c2.lado = 8;
		
		int resultadoArea2;
		resultadoArea2 = c2.calcularArea();
		System.out.println("Resultado area cuadrado 2: " + resultadoArea2);
		
		double resultadoPerimetro2;
		resultadoPerimetro2 = c2.calcularPerimetro();
		System.out.println("Resultado perimetro cuadrado 2: " + resultadoPerimetro2);
		
	}

}
