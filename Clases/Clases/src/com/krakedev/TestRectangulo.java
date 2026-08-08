package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangulo r1 = new Rectangulo();
		r1.altura = 5;
		r1.base = 4;
		
		int resultadoArea;
		resultadoArea = r1.calcularArea();
		System.out.println("Resultado: " + resultadoArea);
		
		double resultadoPerimetro;
		resultadoPerimetro = r1.calcularPerimetro();
		System.out.println("Resultado perimetro rectangulo 1: " + resultadoPerimetro);
		
		
	    Rectangulo r2 = new Rectangulo();
	    int resultadoArea2; 
	    r2.altura = 8;
	    r2.base = 2;
	    
	    resultadoArea2 = r2.calcularArea();
	    System.out.println("Resultado rectangulo 2: " + resultadoArea2);
	    
	    double resultadoPerimetro2;
	    resultadoPerimetro2 = r2.calcularPerimetro();
	    System.out.println("Resultado perimetro resctangulo 2: " + resultadoPerimetro2);
	    

	}

}
