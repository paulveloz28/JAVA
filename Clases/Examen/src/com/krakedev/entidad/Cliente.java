package com.krakedev.entidad;

public class Cliente {
	
	private String nombre;
    private String tipoMembresia;

    public Cliente(String nombre, String tipoMembresia) {
        if (!tipoMembresia.equals("REGULAR") && 
            !tipoMembresia.equals("PREMIUM") && 
            !tipoMembresia.equals("VIP")) {
            throw new IllegalArgumentException("Tipo de membresía inválido.");
        }
        this.nombre = nombre;
        this.tipoMembresia = tipoMembresia;
    }
    
    public String getNombre() {
    	return nombre;
    }

    public String getTipoMembresia() {
        return tipoMembresia;
    }

}
