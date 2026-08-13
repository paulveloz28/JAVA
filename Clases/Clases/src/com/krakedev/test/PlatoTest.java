package com.krakedev.test;

import com.krakedev.Plato;

public class PlatoTest {

	public static void main(String[] args) {
		
		Plato platoA;
		platoA = new Plato("Encebollado", "Plato fuerte", 4.50f, true);

		System.out.println("=========== Plato A : Valores asignados ===========");

		System.out.println("Nombre: " + platoA.getNombre());
		System.out.println("Tipo: " + platoA.getTipo());
		System.out.println("Precio: " + platoA.getPrecio());
		System.out.println("Disponible: " + platoA.isDisponible());

		
		System.out.println("=========== Plato B : Valores asignados ===========");
		Plato platoB = new Plato("Papas con cuero", "Entrada", 6.75f, true);

		System.out.println("Nombre: " + platoB.getNombre());
		System.out.println("Tipo: " + platoB.getTipo());
		System.out.println("Precio: " + platoB.getPrecio());
		System.out.println("Disponible: " + platoB.isDisponible());

		
		System.out.println("=========== Plato C : Valores asignados ===========");
		Plato platoC = new Plato("Tres Leches", "Postre", 3.25f, false);

		System.out.println("Nombre: " + platoC.getNombre());
		System.out.println("Tipo: " + platoC.getTipo());
		System.out.println("Precio: " + platoC.getPrecio());
		System.out.println("Disponible: " + platoC.isDisponible());

	}

}
