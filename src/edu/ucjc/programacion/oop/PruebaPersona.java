package edu.ucjc.programacion.oop;

public class PruebaPersona {

	public static void main(String[] args) {
		// Crear Objeto de tipo persona
		Persona persona1 = new Persona("Z000", "Eddyson", "Urena", 22);
		System.out.println("mi nombre es "+ persona1.getNombre() + " tengo "+ persona1.edad + " años");
		persona1.Saludar();
		
		Persona persona2 = new Persona();
		persona2.dni = "E0000";
		persona2.setNombre("Maria"); 
		persona2.apellidos = "Cabral";
		persona2.edad = 22;
		System.out.println("La persona 2 se llama "+ persona2.nombre);
		
		
//		Persona persona3; // este va a dar error por no inicializar
//		System.out.println(persona3);
	}
}
