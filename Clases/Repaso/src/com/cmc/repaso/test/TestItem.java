package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("============== Producto 1 ==========");
		
		Item producto1 = new Item();
		
		producto1.setNombre("Television");
		producto1.setProductosActuales(20);
		
		System.out.println("============== Valores iniciales ==========");
		producto1.imprimir();
		
		System.out.println("============== Despues de la venta de 5 productos ==========");
		producto1.vender(5);
		producto1.imprimir();
		
		System.out.println("============== Despues de la devolucion de 2 productos ==========");
		producto1.devolver(2);
		producto1.imprimir();
		
		System.out.println("============== Producto 2 ==========");
		
		Item producto2 = new Item();
		
		producto2.setNombre("Parlante");
		producto2.setProductosActuales(20);
		
		System.out.println("============== Valores iniciales ==========");
		producto2.imprimir();
		
		System.out.println("============== Despues de la venta de 8 productos ==========");
		producto2.vender(8);
		producto2.imprimir();
		
		System.out.println("============== Despues de la devolucion de 3 productos ==========");
		producto2.devolver(3);
		producto2.imprimir();
		
	}

}
