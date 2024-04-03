package edu.ucjc.programacion.oop.utility;

import java.util.Scanner;

public class Utility {
	public static void validarEmail(String email) {
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
	
	public static int pideDatoEntero(String texto) {
		int numero = 0;
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		numero = scan.nextInt();
		
		return numero;
	}
	
	public static String pideDatoString(String texto) {
		String dato = "";
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		dato = scan.nextLine();
		
		return dato;
	}
	
	public static void pintarMenu(String [] opciones) {
		for (String opcion: opciones) {
			System.out.println(opcion);
		}
	}
}
