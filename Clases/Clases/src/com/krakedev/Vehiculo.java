package com.krakedev;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private String anio;
	
	public Vehiculo() {
		
	}
	
	public Vehiculo(String marca) {
		this.marca = marca;
	}
	
	public Vehiculo(String marca, String modelo, String anio) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getAnio() {
		return anio;
	}
	
	public void setAnio(String anio) {
		this.anio = anio;
	}
	
}
