package com.krakedev;

public class RestauranteTest {

	public static void main(String[] args) {
		
		Restaurante rest1;
		rest1 = new Restaurante();

		System.out.println("=============== Restaurante 1 : Creado ================");

		System.out.println("Nombre: " + rest1.getNombre());
		System.out.println("Dirección: " + rest1.getDireccion());
		System.out.println("Calificación: " + rest1.getCalificacion());

		System.out.println("=========== Restaurante 1 : Valores asignados ===========");

		rest1.setNombre("La Parrilla");
		rest1.setDireccion("Av. Amazonas"); 
		rest1.setCalificacion(4.8f);

		System.out.println("Nombre: " + rest1.getNombre());
		System.out.println("Dirección: " + rest1.getDireccion());
		System.out.println("Calificación: " + rest1.getCalificacion());

		System.out.println("=============== Restaurante 2 : Creado ================");

		Restaurante rest2 = new Restaurante();

		System.out.println("Nombre: " + rest2.getNombre());
		System.out.println("Dirección: " + rest2.getDireccion());
		System.out.println("Calificación: " + rest2.getCalificacion());

		System.out.println("=========== Restaurante 2 : Valores asignados ===========");

		rest2.setNombre("El Buen Sabor"); 
		rest2.setDireccion("Av. Naciones Unidas");
		rest2.setCalificacion(4.5f);

		System.out.println("Nombre: " + rest2.getNombre());
		System.out.println("Dirección: " + rest2.getDireccion());
		System.out.println("Calificación: " + rest2.getCalificacion());

	}

}
