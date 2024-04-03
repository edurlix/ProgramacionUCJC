package edu.ucjc.programacion.oop.ejercicio2;

import edu.ucjc.programacion.oop.ejercicio1.Alumno;
import edu.ucjc.programacion.oop.utility.Utility;

public class MenuUniversidad {

	public static void main(String[] args) {
		int opcion = 0;
		MenuUniversidad menu = new MenuUniversidad();
		Alumno [] alumnos = null;
		do {
			String [] opciones = {"1. Crear Universidad", "2. Insertar Alumnos", "3. Mostrar Alumno", "4. Buscar Alumno", "5. Borrar alumno", "6. Salir"};
			Utility.pintarMenu(opciones);

			opcion = Utility.pideDatoEntero("Seleccione una opcion");
			
			switch(opcion){
			case 1: 
				int numAlumnos = Utility.pideDatoEntero("Introduce numero de alumnos");
				alumnos = new Alumno[numAlumnos];
				System.out.println("Universidad creada con "+ alumnos.length);
				break;
			case 2: 
				System.out.println(alumnos.length);
				if(alumnos == null) {
					System.out.println("Debes crear la universidad en la opcion 1");
				}else {
					// Rellenamos el array
					for(int i = 0; i < alumnos.length; i++) {
						String nombre = Utility.pideDatoString("Ingresar el nombre del alumno "+ (i+1));
						String apellido = Utility.pideDatoString("Ingresar el apellido del alumno "+ (i+1));
						String dni = Utility.pideDatoString("Ingresar el dni del alumno "+ (i+1));
						int edad = Utility.pideDatoEntero("Ingresar la edad del alumno "+ (i+1));
						
						Alumno alumno = new Alumno(nombre, apellido, edad,dni);
						alumnos[i] = alumno;
					}
				}
				break;
			case 3: 
				if(alumnos == null) {
					System.out.println("Debes crear la universidad en la opcion 1");
				}else {
					for (Alumno alumno: alumnos) {
						if(alumno != null) {
							System.out.println("Nombre " + alumno.getNombre());
							System.out.println("Apellido " + alumno.getApellidos());
							System.out.println("Edad " + alumno.getEdad());
							System.out.println("Dni " + alumno.getDni());
							System.out.println("=========================================");
						}else {
							System.out.println("Debes rellenar el array en la opcion 2");
						}
					}
				}
				break;
			case 4: 
				if(alumnos == null) {
					System.out.println("Debes crear la universidad en la opcion 1");
				}else {
					String dniBusqueda = Utility.pideDatoString("Introduce el dni del alumno a buscar ");
					for (Alumno alumno: alumnos) {
						if(alumno != null && alumno.getDni().equals(dniBusqueda)) {
							System.out.println("Alumno con dni "+ dniBusqueda + " encontrado");
							break;
						}
					}
				}
				break;
			case 5:
				if(alumnos == null) {
					System.out.println("Debes crear la universidad en la opcion 1");
				}else {
					String dniBorrar = Utility.pideDatoString("Introduce el dni del alumno a buscar ");
					
					int i = 0;
					boolean alumnoEncontrado = false;
					for (Alumno alumno: alumnos) {
						if(alumno != null && alumno.getDni().equals(dniBorrar)) {
							System.out.println("Alumno con dni "+ dniBorrar + " eliminado");
							alumnoEncontrado = true;
							alumnos[i] = null;
							break;
						}
						i++;
					}
					
					if(!alumnoEncontrado) {
						System.out.println("El alumno con dni "+ dniBorrar + " no esta en la universidad");
					}
				}
				break;
			case 6: 
				System.out.println("Adios");
				break;
			default: System.out.println("Opcion incorrecta");
			}
		}while(opcion!= 6);
	}
	
//	private void crearUniversidad() {
//		int numAlumnos = Utility.pideDatoEntero("Introduce numero de alumnos");
//		System.out.println(num2);
//		alumnos = new Alumno[numAlumnos];
//	}
	
}
