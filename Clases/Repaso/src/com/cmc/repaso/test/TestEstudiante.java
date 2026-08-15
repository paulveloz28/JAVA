package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("==========Estudiante 1==========");
		
		Estudiante estudiante1 = new Estudiante("Oliver");
		estudiante1.calificar(6.5);
		
		System.out.println("Nombre: " + estudiante1.getNombre());
		System.out.println("Nota: " + estudiante1.getNota());
		System.out.println("Resultado: " + estudiante1.getResultado());
		
		System.out.println("==========Estudiante 2==========");
		
		Estudiante estudiante2 = new Estudiante("Roberto");
		estudiante2.calificar(9);
		
		System.out.println("Nombre: " + estudiante2.getNombre());
		System.out.println("Nota: " + estudiante2.getNota());
		System.out.println("Resultado: " + estudiante2.getResultado());
		
        System.out.println("==========Estudiante 3==========");
		
		Estudiante estudiante3 = new Estudiante("Kasandra");
		estudiante3.calificar(8);
		
		System.out.println("Nombre: " + estudiante3.getNombre());
		System.out.println("Nota: " + estudiante3.getNota());
		System.out.println("Resultado: " + estudiante3.getResultado());
		
	}

}
