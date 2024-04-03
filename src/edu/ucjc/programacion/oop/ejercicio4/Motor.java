package edu.ucjc.programacion.oop.ejercicio4;

public class Motor {
	private String marca;
	private int numCaballo;
	private Piston piston;
	
	//constructor
	
	public Motor(String marca, int numCaballo, Piston piston) {
		super();
		this.marca = marca;
		this.numCaballo = numCaballo;
		this.piston = piston;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getNumCaballo() {
		return numCaballo;
	}

	public void setNumCaballo(int numCaballo) {
		this.numCaballo = numCaballo;
	}

	public Piston getPiston() {
		return piston;
	}

	public void setPiston(Piston piston) {
		this.piston = piston;
	}
	
	
}
