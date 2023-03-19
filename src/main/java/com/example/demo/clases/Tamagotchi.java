package com.example.demo.clases;

public class Tamagotchi {

		
	// Propiedades
	private String nombre;

	

	private Integer nivel;

	private String estado;

	private Integer tiempoEnMinutos;
	// Constructor

	public Tamagotchi() {
		this.nivel = 0;
	}
	
	public Tamagotchi(String nombre) {
		this.nombre = nombre;
		
	}
	
	
	// Metodos

	public void comer() {
		switch (this.estado) {
		case "hambrienta":
			this.estado = "contenta";
			break;
		case "contenta":
			this.nivel++;
			break;
		case "aburrida":
			if (this.tiempoEnMinutos > 80) {
				this.estado = "contenta";
			}
			break;
		default:
			System.out.println("Estado desconocido");
			break;
		}
	}

	public void jugar() {
		if (this.puedejugar()) {
			switch (this.estado) {
			case "contenta":
				this.nivel += 2; // this.nivel = this.nivel + 2;
				break;
			case "aburrida":
				this.estado = "contenta";
				break;
			default:
				System.out.println("Estado desconocido");
				break;

			}

		}

	}

	public Boolean puedejugar() {

		return this.estado.equals("hambrienta") ? false : true;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		if (nivel < 0) {
			this.nivel = 0;
		}
		this.nivel = nivel;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	




}

