package com.krakedev.entidad;

public class Dimensiones {
	
	 private double alto;
	    private double ancho;
	    private double largo;

	    public Dimensiones(double alto, double ancho, double largo) {
	        if (alto <= 0 || ancho <= 0 || largo <= 0) {
	            throw new IllegalArgumentException("Las dimensiones deben ser mayores a 0.");
	        }
	        this.alto = alto;
	        this.ancho = ancho;
	        this.largo = largo;
	    }

	    public double calcularVolumen() {
	        return alto * ancho * largo;
	    }

}
