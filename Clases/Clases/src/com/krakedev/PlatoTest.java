package com.krakedev;

public class PlatoTest {

	public static void main(String[] args) {
		
		Plato platoA;
		platoA = new Plato();

		System.out.println("=============== Plato A : Creado ================");

		System.out.println("Nombre: " + platoA.nombre);
		System.out.println("Tipo: " + platoA.tipo);
		System.out.println("Precio: " + platoA.precio);
		System.out.println("Disponible: " + platoA.disponible);

		System.out.println("=========== Plato A : Valores asignados ===========");

		platoA.nombre = "Encebollado";
		platoA.tipo = "Plato fuerte";
		platoA.precio = 4.50f;
		platoA.disponible = true;

		System.out.println("Nombre: " + platoA.nombre);
		System.out.println("Tipo: " + platoA.tipo);
		System.out.println("Precio: " + platoA.precio);
		System.out.println("Disponible: " + platoA.disponible);

		System.out.println("=============== Plato B : Creado ================");

		Plato platoB = new Plato();

		System.out.println("Nombre: " + platoB.nombre);
		System.out.println("Tipo: " + platoB.tipo);
		System.out.println("Precio: " + platoB.precio);
		System.out.println("Disponible: " + platoB.disponible);

		System.out.println("=========== Plato B : Valores asignados ===========");

		platoB.nombre = "Papas con cuero";
		platoB.tipo = "Entrada";
		platoB.precio = 6.75f;
		platoB.disponible = true;

		System.out.println("Nombre: " + platoB.nombre);
		System.out.println("Tipo: " + platoB.tipo);
		System.out.println("Precio: " + platoB.precio);
		System.out.println("Disponible: " + platoB.disponible);

		System.out.println("=============== Plato C : Creado ================");

		Plato platoC = new Plato();

		System.out.println("Nombre: " + platoC.nombre);
		System.out.println("Tipo: " + platoC.tipo);
		System.out.println("Precio: " + platoC.precio);
		System.out.println("Disponible: " + platoC.disponible);

		System.out.println("=========== Plato C : Valores asignados ===========");

		platoC.nombre = "Tres Leches";
		platoC.tipo = "Postre";
		platoC.precio = 3.25f;
		platoC.disponible = false;

		System.out.println("Nombre: " + platoC.nombre);
		System.out.println("Tipo: " + platoC.tipo);
		System.out.println("Precio: " + platoC.precio);
		System.out.println("Disponible: " + platoC.disponible);

	}

}
