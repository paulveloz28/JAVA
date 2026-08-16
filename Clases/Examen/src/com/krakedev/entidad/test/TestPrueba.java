package com.krakedev.entidad.test;

import com.krakedev.entidad.Cliente;
import com.krakedev.entidad.Dimensiones;
import com.krakedev.entidad.Envio;

public class TestPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            // Crear dimensiones
            Dimensiones dim = new Dimensiones(50, 40, 30); // volumen = 60,000 cm³

            // Crear cliente
            Cliente cliente = new Cliente("Jonathan", "PREMIUM");

            // Crear envío
            Envio envio = new Envio("ENV001", 8, 25, "TARJETA", dim, cliente);

            // Calcular costo total
            double costo = envio.calcularCostoTotal();

            // Mostrar resultado
            System.out.println("=== Detalle del Envío ===");
            System.out.println("ID: " + "ENV001");
            System.out.println("Cliente: " + "Jonathan");
            System.out.println("Membresía: " + cliente.getTipoMembresia());
            System.out.println("Método de pago: " + "TARJETA");
            System.out.println("Costo total: $" + String.format("%.2f", costo));
        } catch (IllegalArgumentException e) {
            System.out.println("Error en el envío: " + e.getMessage());
        }
    }
		



}
