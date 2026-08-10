package com.krakedev;

public class PlatoTest {

	public static void main(String[] args) {
		
		Plato platoA;
		platoA = new Plato();

		System.out.println("=============== Plato A : Creado ================");

		System.out.println("Nombre: " + platoA.getNombre());
		System.out.println("Tipo: " + platoA.getTipo());
		System.out.println("Precio: " + platoA.getPrecio());
		System.out.println("Disponible: " + platoA.isDisponible());

		System.out.println("=========== Plato A : Valores asignados ===========");

		platoA.setNombre("Encebollado");
		platoA.setTipo("Plato fuerte");
		platoA.setPrecio(4.50f);
		platoA.setDisponible(true);

		System.out.println("Nombre: " + platoA.getNombre());
		System.out.println("Tipo: " + platoA.getTipo());
		System.out.println("Precio: " + platoA.getPrecio());
		System.out.println("Disponible: " + platoA.isDisponible());

		System.out.println("=============== Plato B : Creado ================");

		Plato platoB = new Plato();

		System.out.println("Nombre: " + platoB.getNombre());
		System.out.println("Tipo: " + platoB.getTipo());
		System.out.println("Precio: " + platoB.getPrecio());
		System.out.println("Disponible: " + platoB.isDisponible());

		System.out.println("=========== Plato B : Valores asignados ===========");

		platoB.setNombre("Papas con cuero");
		platoB.setTipo("Entrada");
		platoB.setPrecio(6.75f);
		platoB.setDisponible(true);

		System.out.println("Nombre: " + platoB.getNombre());
		System.out.println("Tipo: " + platoB.getTipo());
		System.out.println("Precio: " + platoB.getPrecio());
		System.out.println("Disponible: " + platoB.isDisponible());

		System.out.println("=============== Plato C : Creado ================");

		Plato platoC = new Plato();

		System.out.println("Nombre: " + platoC.getNombre());
		System.out.println("Tipo: " + platoC.getTipo());
		System.out.println("Precio: " + platoC.getPrecio());
		System.out.println("Disponible: " + platoC.isDisponible());

		System.out.println("=========== Plato C : Valores asignados ===========");

		platoC.setNombre("Tres Leches");
		platoC.setTipo("Postre");
		platoC.setPrecio(3.25f);
		platoC.setDisponible(false);

		System.out.println("Nombre: " + platoC.getNombre());
		System.out.println("Tipo: " + platoC.getTipo());
		System.out.println("Precio: " + platoC.getPrecio());
		System.out.println("Disponible: " + platoC.isDisponible());

	}

}
