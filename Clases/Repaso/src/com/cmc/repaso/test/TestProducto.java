package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("========Producto 1 ==========");
		
		Producto producto1 = new Producto("Celular", 1000);
		
		System.out.println("Nombre: " + producto1.getNombre());
		System.out.println("Precio inicial: " + producto1.getPrecio());
		
		producto1.setPrecio(-800);
		
		System.out.println("Nuevo precio: " + producto1.getPrecio());	
		
		double precioPromo1 = producto1.calcularPrecioPromo(10);
		System.out.println("Precio con 10% de descuento: " + precioPromo1);
		
		
		System.out.println("========Producto 2 ==========");
		
		Producto producto2 = new Producto("Audifonos", 50);
		
		System.out.println("Nombre: " + producto2.getNombre());
		System.out.println("Precio inicial: " + producto2.getPrecio());
		
		producto2.setPrecio(40);
		
		System.out.println("Nuevo precio: " + producto2.getPrecio());
		
		double precioPromo2 = producto2.calcularPrecioPromo(20);
		System.out.println("Precio con 20% de descuento: " + precioPromo2);
		
	}

}
