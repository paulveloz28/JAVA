package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {
		
		Cuadrado c1 = new Cuadrado();
		System.out.println("=========Cuadrado 1 : Creado =========");
		
		System.out.println("Lado: " + c1.getLado());
		
		System.out.println("=========Cuadrado 1 : Valor asignado =========");
		c1.setLado(4);
		
		System.out.println("Lado: " + c1.getLado());
		
		double resultadoArea; 
		resultadoArea = c1.calcularArea();
		System.out.println("Resultado area cuadrado 1: " + resultadoArea);
		
		double resultadoPerimetro;
		resultadoPerimetro = c1.calcularPerimetro();
		System.out.println("Resultado perimetro cuadrado 1: " + resultadoPerimetro);
		
		Cuadrado c2 = new Cuadrado();
		System.out.println("=========Cuadrado 2 : Creado =========");
		
		System.out.println("Lado: " + c2.getLado());
		
		System.out.println("=========Cuadrado 2 : Valor asignado =========");
		c2.setLado(8);
		
		System.out.println("Lado: " + c2.getLado());
		
		double resultadoArea2;
		resultadoArea2 = c2.calcularArea();
		System.out.println("Resultado area cuadrado 2: " + resultadoArea2);
		
		double resultadoPerimetro2;
		resultadoPerimetro2 = c2.calcularPerimetro();
		System.out.println("Resultado perimetro cuadrado 2: " + resultadoPerimetro2);
		
		Cuadrado c3 = new Cuadrado();
		System.out.println("=========Cuadrado 3 : Creado =========");
		
		System.out.println("Lado: " + c3.getLado());
		
		System.out.println("=========Cuadrado 3 : Valor asignado =========");
		c3.setLado(6);
		
		System.out.println("Lado: " + c3.getLado());
		
		double resultadoArea3;
		resultadoArea3 = c3.calcularArea();
		System.out.println("Resultado area cuadrado 3: " + resultadoArea3);
		
		double resultadoPerimetro3;
		resultadoPerimetro3 = c3.calcularPerimetro();
		System.out.println("Resultado perimetro cuadrado 3: " + resultadoPerimetro3);
		
	}

}
