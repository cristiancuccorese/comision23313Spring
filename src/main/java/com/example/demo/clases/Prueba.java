package com.example.demo.clases;

public class Prueba {

	public static void main(String[] args) {
		
		Tamagotchi tama = new Tamagotchi();
        tama.setNombre("Pipi");
        tama.setEstado("hambrienta");
        // Consulto el estado de Pipi
        System.out.println("Pipi esta " + tama.getEstado());
        // Le damos de comer a Pipi
        tama.comer();
        // Consultamos el estado de Pipi luego de que comió
        System.out.println("Luego de comer, Pipi esta " + tama.getEstado());
	
	
	}
	

}
