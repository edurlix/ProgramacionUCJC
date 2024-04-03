package edu.ucjc.programacion.oop.ejercicio1;

public class Alumno {
	//Variables de instancia
	private String nombre;
	private String apellidos;
	private int edad;
	private String cursando;
	private int curso;
	private String [] asignaturas;
	private String email;
	private String dni;
	
	//Constructores
	public Alumno(String nombre, String apellidos, int edad, String cursando, int curso) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.cursando = cursando;
		this.curso = curso;
	}
	
	public Alumno(String nombre, String apellidos, int edad, String cursando, int curso, String[] asignaturas, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.cursando = cursando;
		this.curso = curso;
		this.asignaturas = asignaturas;
		this.email = email;
	}
	
	public Alumno(String nombre, String apellidos, int edad, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCursando() {
		return cursando;
	}

	public void setCursando(String cursando) {
		this.cursando = cursando;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDni() {
		return dni; 
	}

	public void mostrarInfoAlumno() {
		System.out.println("El alumno " + this.nombre + " " + this.apellidos + " esta estudiando "+ this.curso + " de " + this.cursando + " con las asignaturas:");
		
		if(asignaturas!=null) {
			for(String asignatura: this.asignaturas) {
				if(asignatura!=null) {
					System.out.println(asignatura.toUpperCase());
				}
			}
		}else {
			System.out.println("No esta matriculado de ninguna");
		}	
	}
	
	void validarEmail() {
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
