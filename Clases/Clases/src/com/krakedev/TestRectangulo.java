package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo();
		System.out.println("=========Rectangulo 1 : Creado =========");
		
		System.out.println("Base: " + r1.getBase());
		System.out.println("Altura: " + r1.getAltura());
		
		System.out.println("=========Rectangulo 1 : Valores asignados =========");
		r1.setBase(4);
		r1.setAltura(5);
		
		System.out.println("Base: " + r1.getBase());
		System.out.println("Altura: " + r1.getAltura());
		
		double resultadoArea;
		resultadoArea = r1.calcularArea();
		System.out.println("Resultado area rectangulo 1: " + resultadoArea);
		
		double resultadoPerimetro;
		resultadoPerimetro = r1.calcularPerimetro();
		System.out.println("Resultado perimetro rectangulo 1: " + resultadoPerimetro);
		
		Rectangulo r2 = new Rectangulo();
		System.out.println("=========Rectangulo 2 : Creado =========");
	    
		System.out.println("Base: " + r2.getBase());
		System.out.println("Altura: " + r2.getAltura());
		
		System.out.println("=========Rectangulo 2 : Valores asignados ========="); 
	    r2.setBase(2);
	    r2.setAltura(8);
	    
	    System.out.println("Base: " + r2.getBase());
		System.out.println("Altura: " + r2.getAltura());
		
		double resultadoArea2;
	    resultadoArea2 = r2.calcularArea();
	    System.out.println("Resultado area rectangulo 2: " + resultadoArea2);
	    
	    double resultadoPerimetro2;
	    resultadoPerimetro2 = r2.calcularPerimetro();
	    System.out.println("Resultado perimetro rectangulo 2: " + resultadoPerimetro2);
	    

	}

}
