package edu.ucjc.programacion.oop;

public class Persona {
	/*
	 * tipos de modificadores de acceso
	 * public que se puede acceder y modificar la informacion
	 * private que no se puede acceder y tampoco modificar a menos que utilizes un metodo en la misma clase para modificarla
	 * package que no tienen ninguna y solo se pueden usar si estan en el mismo package
	 * protected tendran acceso todas las variables que estan en el mismo package y que sean clases hijas
	 * */
	String nombre;
	String apellidos;
	String dni;
	int edad;
	
	// constructor para inicializar la variable
	public Persona(String dni, String nombre, String apellidos, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	// sin constructor
	public Persona() {
		
	}
	
	//Metodos
	public void Saludar() {
		System.out.println("Hola");
	}
	// metodos getter and setter
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}