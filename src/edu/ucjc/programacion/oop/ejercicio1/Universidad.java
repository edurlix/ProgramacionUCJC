package edu.ucjc.programacion.oop.ejercicio1;
import edu.ucjc.programacion.oop.utility.Utility;

public class Universidad {

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Eddyson","Ureña",22,"Informatica",1);
		String [] asignaturasAlumno1 = {"Asignatura1", "Asignatura2", "Asignatura3"};
		alumno1.setAsignaturas(asignaturasAlumno1);
		alumno1.setEmail(null);
		alumno1.mostrarInfoAlumno();
		
		String [] asignaturasAlumno2 = new String[3];
		asignaturasAlumno2[0]="Asignatura1";
		asignaturasAlumno2[1]="Asignatura2";
		
		
		Alumno alumno2 = new Alumno("Ana","Rodriguez",22,"Marketing",3, asignaturasAlumno2,"correo@gmail.com");
		alumno2.mostrarInfoAlumno();
		
		Alumno alumno3 = new Alumno("Karla","Cato",22,"Informatica",2);
		alumno3.mostrarInfoAlumno();
		
		Alumno [] alumnos = {alumno1, alumno2, alumno3};
		
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre());
			System.out.println(alumno.getApellidos());
			if(alumno.getEmail() != null) {
//				alumno.validarEmail();
//				validarEmail(alumno.getEmail());
				
//				forma 1
//						Para instanciar un metodo de la clase Universidad hay que instanciar el objeto de la univerdad.
//				Universidad uni = new Universidad();
//				uni.validarEmail(alumno.getEmail());
				
//				forma 2
//				convirtiendo el metodo en static para que ambos sean static
//				validarEmail(alumno.getEmail());
				
//				Forma 3
//				se crea una clase static llamado utility en el mismo paquete y se llama al metodo con el nombre de la clase
//				Utility.validarEmail(alumno.getEmail());
				
//				Forma 4
//				en caso de que una clase esta en otro paquete, en este caso utility, se importa el paquete de utility
				Utility.validarEmail(alumno.getEmail());
			}else {
				System.out.println(alumno.getNombre()+" no tiene email");
			}
			System.out.println();
		}

	}
	
	private static void validarEmail(String email) {
		boolean isValido = true;
		String mensaje = "";
		int count = 0;
		int despuesPunto = 0;
		System.out.println(email);
		
		
		if(email.contains(" ")) {
			isValido = false;
			mensaje += "el email no puede tener espacio en blanco";
		}
		
		
		if (!email.contains("@") || email.indexOf("@") != email.lastIndexOf("@")) {
			isValido = false;
			mensaje += "el email tiene que tener una @";
		}else {
			String dominio = email.substring(email.indexOf("@")+1);
			if(!dominio.contains(".")) {
				isValido = false;
				mensaje += "\nel email tiene que tener un punto despues del @";
			}else {
				if(dominio.indexOf(".")< 2) {
					isValido = false;
					mensaje += "\nel dominio no es mayor que 2";
				}
			}
		}
		
		if(!isValido) {
			System.out.println("el email " + email + " no es valido "+mensaje);
		}else {
			System.out.println("El email es correcto");
		}
		System.out.println();
	}

}
