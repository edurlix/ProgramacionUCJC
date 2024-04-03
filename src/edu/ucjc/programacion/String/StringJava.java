package edu.ucjc.programacion.String;

public class StringJava {
	public static void main(String[] args) {
		String nombre = "Texto";
//		nombre = nombre.toUpperCase();
//		System.out.println(nombre);
//		System.out.println(nombre.toLowerCase());
		
		String nombre2 = new String("Texto");
		String nombre3 = "Texto"; 
		System.out.println(nombre == nombre2); // Estan apuntando a memorias diferentes ya que se creo un objeto nuevo
		System.out.println(nombre == nombre3);
		System.out.println(nombre.equals(nombre2)); // compara el mismo valor 
		
		// Metodos para String
		System.out.println("\nMetodos");
		
		System.out.println(nombre.contains("Te")); // verificar si contiene 
		
		System.out.println(nombre.equalsIgnoreCase(nombre3));  //verifica si es igual ignorando los case
		
		System.out.println(nombre.indexOf("e"));
		String cadena = "Esto es una prueba";
		System.out.println(cadena.indexOf("e"));
		System.out.println(cadena.lastIndexOf("e"));
		
		System.out.println(cadena.trim()); // elimina los espacio que contenga el string
		
		System.out.println(cadena.replace("E", "O")); // reemplazar
		
		System.out.println(cadena.substring(3)); // genera un string desde la posicion que indicas
		
		System.out.println(cadena.concat(" de metodos")); // agrega lo que sea al string pero no es recomendable
		
		String info = "dato1;dato2;dato3";
		String [] datos = info.split(";");
		System.out.println(datos[0]);
	}
}
