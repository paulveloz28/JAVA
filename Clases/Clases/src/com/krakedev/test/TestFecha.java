package com.krakedev.test;

import com.krakedev.Fecha;

public class TestFecha {

	public static void main(String[] args) {
		
		
		Fecha f1 = new Fecha();
		
		f1.setAnio(2026);
		f1.setMes(4);
		f1.setDia(1);
		
		
		System.out.println("Año: " + f1.getAnio());
		System.out.println("Mes: " + f1.getMes());
		System.out.println("Dia: " + f1.getDia());
	}

}
