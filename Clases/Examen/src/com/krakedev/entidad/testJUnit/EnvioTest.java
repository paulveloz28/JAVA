package com.krakedev.entidad.testJUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.krakedev.entidad.Cliente;
import com.krakedev.entidad.Dimensiones;
import com.krakedev.entidad.Envio;

public class EnvioTest {
	
	@Test
    public void testCalculoEstandar() {
        Dimensiones dim = new Dimensiones(10, 10, 10);
        Cliente cliente = new Cliente("Juan", "REGULAR");
        Envio envio = new Envio("E001", 3, 10, "EFECTIVO", dim, cliente);

        double costo = envio.calcularCostoTotal();
        assertEquals(5 + (0.5 * 10), costo);
    }

    private void assertEquals(double d, double costo) {
		// TODO Auto-generated method stub
		
	}

	@Test
    public void testVolumenExcedido() {
        Dimensiones dim = new Dimensiones(100, 100, 6); // volumen = 60,000
        Cliente cliente = new Cliente("Ana", "REGULAR");
        Envio envio = new Envio("E002", 3, 10, "EFECTIVO", dim, cliente);

        double costo = envio.calcularCostoTotal();
        assertEquals(5 + (0.5 * 10) + 15, costo);
    }

    @Test
    public void testMembresiaPremium() {
        Dimensiones dim = new Dimensiones(10, 10, 10);
        Cliente cliente = new Cliente("Luis", "PREMIUM");
        Envio envio = new Envio("E003", 3, 10, "EFECTIVO", dim, cliente);

        double costo = envio.calcularCostoTotal();
        assertEquals((5 + (0.5 * 10)) * 0.90, costo);
    }

    @Test
    public void testMembresiaVIP() {
        Dimensiones dim = new Dimensiones(10, 10, 10);
        Cliente cliente = new Cliente("Maria", "VIP");
        Envio envio = new Envio("E004", 3, 10, "EFECTIVO", dim, cliente);

        double costo = envio.calcularCostoTotal();
        assertEquals((5 + (0.5 * 10)) * 0.80, costo);
    }

    @Test
    public void testMetodoPagoTransferencia() {
        Dimensiones dim = new Dimensiones(10, 10, 10);
        Cliente cliente = new Cliente("Pedro", "REGULAR");
        Envio envio = new Envio("E005", 3, 10, "TRANSFERENCIA", dim, cliente);

        double costo = envio.calcularCostoTotal();
        assertEquals((5 + (0.5 * 10)) * 0.95, costo);
    }

    @Test
    public void testMetodoPagoTarjeta() {
        Dimensiones dim = new Dimensiones(10, 10, 10);
        Cliente cliente = new Cliente("Sofia", "REGULAR");
        Envio envio = new Envio("E006", 3, 10, "TARJETA", dim, cliente);

        double costo = envio.calcularCostoTotal();
        assertEquals((5 + (0.5 * 10)) * 1.03, costo);
    }

    @Test
    public void testExcepciones() {
        Dimensiones dim = new Dimensiones(10, 10, 10);
        Cliente cliente = new Cliente("Carlos", "REGULAR");

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Envio("E007", -1, 10, "EFECTIVO", dim, cliente).calcularCostoTotal();
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Envio("E008", 3, -5, "EFECTIVO", dim, cliente).calcularCostoTotal();
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Envio("E009", 3, 10, "CHEQUE", dim, cliente).calcularCostoTotal();
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Cliente("Carlos", "GOLD");
        });
    }

	private void assertThrows(Class<IllegalArgumentException> class1, Object object) {
		// TODO Auto-generated method stub
		
	}

}
