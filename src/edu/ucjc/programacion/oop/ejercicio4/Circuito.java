package edu.ucjc.programacion.oop.ejercicio4;
import java.lang.Math;

public class Circuito {

	public static void main(String[] args) {
		int rand1 = (int)(Math.random() * 120);
		int rand2 = (int)(Math.random() * 120);
		
		
		Volante volante1 = new Volante(1, "deportivo", "negro");
		Volante volante2 = new Volante(2, "deportivo", "gris");
		
		Piston piston1 = new Piston(1, "John Deere");
		Piston piston2 = new Piston(2, "MAHLE");
		
		Motor motor1 = new Motor("RB26DETT I6", 276, piston1 );
		Motor motor2 = new Motor("Twin-turbo 3.0-litro", 320, piston2);
		
		Coche coche1 = new Coche("R234l", "Nissan",volante1, motor1, rand1);
		Coche coche2 = new Coche("S4543k", "Toyota", volante2, motor2, rand2);
		
		Coche [] coches = {coche1, coche2};
		
		arrancarCoches(coches);

	}
	
	private static void arrancarCoches(Coche[] coches) {
		for (Coche coche : coches) {
			System.out.println("El vehiculo marca: " + coche.getMarca() + " tiene como motor un " + coche.getMotor().getMarca() + " que tiene " + coche.getMotor().getNumCaballo() + " de HP");
			coche.conducir();
			System.out.println();
		}
	}

}
