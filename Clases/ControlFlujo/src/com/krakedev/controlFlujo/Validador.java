package com.krakedev.controlFlujo;

public class Validador {
	
	
	public void validarEdad(int edad) {
		
		if(edad >= 18) {
			System.out.println("Es mayor de edad: " + edad);	
		}else if(edad >= 12 && edad < 18 ) {
			System.out.println("Es adolescente: " + edad);
		}else if(edad >0 && edad <12) {
			System.out.println("Es un niño: " + edad);
		}else {
			System.out.println("Edad Incorrecta: " + edad);
		}
		
	}

}
