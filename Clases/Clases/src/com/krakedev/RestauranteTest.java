package com.krakedev;

public class RestauranteTest {

	public static void main(String[] args) {
		
		Restaurante rest1;
		rest1 = new Restaurante();

		System.out.println("=============== Restaurante 1 : Creado ================");

		System.out.println("Nombre: " + rest1.nombre);
		System.out.println("Dirección: " + rest1.direccion);
		System.out.println("Calificación: " + rest1.calificacion);

		System.out.println("=========== Restaurante 1 : Valores asignados ===========");

		rest1.nombre = "La Parrilla";
		rest1.direccion = "Av. Amazonas";
		rest1.calificacion = 4.8f;

		System.out.println("Nombre: " + rest1.nombre);
		System.out.println("Dirección: " + rest1.direccion);
		System.out.println("Calificación: " + rest1.calificacion);

		System.out.println("=============== Restaurante 2 : Creado ================");

		Restaurante rest2 = new Restaurante();

		System.out.println("Nombre: " + rest2.nombre);
		System.out.println("Dirección: " + rest2.direccion);
		System.out.println("Calificación: " + rest2.calificacion);

		System.out.println("=========== Restaurante 2 : Valores asignados ===========");

		rest2.nombre = "El Buen Sabor";
		rest2.direccion = "Av. Naciones Unidas";
		rest2.calificacion = 4.5f;

		System.out.println("Nombre: " + rest2.nombre);
		System.out.println("Dirección: " + rest2.direccion);
		System.out.println("Calificación: " + rest2.calificacion);

	}

}
