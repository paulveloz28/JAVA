package com.krakedev.test;

import com.krakedev.Restaurante;

public class RestauranteTest {

	public static void main(String[] args) {
		
		Restaurante rest1;
		rest1 = new Restaurante("La Parrilla", "Av. Amazonas", 4.8f );

		System.out.println("=============== Restaurante 1 : Valores Asignados ================");

		System.out.println("Nombre: " + rest1.getNombre());
		System.out.println("Dirección: " + rest1.getDireccion());
		System.out.println("Calificación: " + rest1.getCalificacion());


		System.out.println("=============== Restaurante 2 : Valores Asignados ================");

		Restaurante rest2 = new Restaurante("El Buen Sabor", "Av. Naciones Unidas", 4.5f);

		System.out.println("Nombre: " + rest2.getNombre());
		System.out.println("Dirección: " + rest2.getDireccion());
		System.out.println("Calificación: " + rest2.getCalificacion());


	}

}
