package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		
		Cuenta cuenta1 = new Cuenta("03476");
        cuenta1.setSaldo(675);

        Cuenta cuenta2 = new Cuenta("03476", "C", 98);

        Cuenta cuenta3 = new Cuenta("03476");
        cuenta3.setTipo("C");	
        
        System.out.println("--------Valores Iniciales---------");
        
        cuenta1.imprimir();
        cuenta2.imprimir();
        cuenta3.imprimir();
        
        System.out.println("--------Valores Modificados---------");
        
        cuenta1.setTipo("C");
        cuenta1.setSaldo(800);
        
        cuenta2.setTipo("A");
        cuenta2.setSaldo(150);
        
        cuenta3.setTipo("A");
        cuenta3.setSaldo(500);
        
        cuenta1.imprimir();
        cuenta2.imprimir();
        cuenta3.imprimir();
        
        Cuenta cuenta4 = new Cuenta("10556");
        Cuenta cuenta5 = new Cuenta("10457", "C", 250);
        Cuenta cuenta6 = new Cuenta("10763");
        cuenta6.setTipo("C");
        cuenta6.setSaldo(750);
        
        System.out.println("--------Cuentas Adicionales---------");
        
        cuenta4.imprimirConMiEstilo();
        cuenta5.imprimirConMiEstilo();
        cuenta6.imprimirConMiEstilo();
	}

}
