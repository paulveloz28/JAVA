package com.krakedev.controlFlujo.test;

import com.krakedev.controlFlujo.Validador;

public class ValidadorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Validador v1 = new Validador();
		
		v1.validarEdad(5);
		v1.validarEdad(22);
		v1.validarEdad(15);
		v1.validarEdad(18);
		v1.validarEdad(10);
		v1.validarEdad(25);
		v1.validarEdad(-2);
	}

}
