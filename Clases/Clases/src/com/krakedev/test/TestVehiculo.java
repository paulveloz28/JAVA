package com.krakedev.test;

import com.krakedev.Vehiculo;

public class TestVehiculo {

	public static void main(String[] args) {
		
		Vehiculo v;
		v = new Vehiculo();
		
		
		System.out.println("===============Vehiculo 1 : Creado================");
		
		System.out.println("Año: " + v.getAnio());
		System.out.println("Marca: " + v.getMarca());
		System.out.println("Modelo: " + v.getModelo());
		
		System.out.println("===========Vehiculo 1 : Valores asignados==============");
		v.setAnio("2012");
		v.setMarca("Chevrolet");
		v.setModelo("Nuevo");
		
		
		System.out.println("Año: " + v.getAnio());
		System.out.println("Marca: " + v.getMarca());
		System.out.println("Modelo: " + v.getModelo());
		
		System.out.println("===============Vehiculo 2 : Creado================");
		
		Vehiculo v2 = new Vehiculo();
		System.out.println("Año: " + v2.getAnio());
		System.out.println("Marca: " + v2.getMarca());
		System.out.println("Modelo: " + v2.getModelo());
		
		System.out.println("===========Vehiculo 2 : Valores asignados==============");
		v2.setAnio("2026");
		v2.setMarca("Honda");
		v2.setModelo("El mas rapido");
		
		System.out.println("Año: " + v2.getAnio());
		System.out.println("Marca: " + v2.getMarca());
		System.out.println("Modelo: " + v2.getModelo());
		
		System.out.println("===========Vehiculo 3 : Valores asignados==============");
		Vehiculo v3 = new Vehiculo("Toyota");
		
		System.out.println("Año: " + v3.getAnio());
		System.out.println("Marca: " + v3.getMarca());
		System.out.println("Modelo: " + v3.getModelo());
		
		System.out.println("===========Vehiculo 4 : Valores asignados==============");
		Vehiculo v4 = new Vehiculo("Toyota", "El mas chevere", "2011");
		
		System.out.println("Año: " + v4.getAnio());
		System.out.println("Marca: " + v4.getMarca());
		System.out.println("Modelo: " + v4.getModelo());

	}

}
