package edu.ucjc.programacion;

import java.util.Scanner;

public class ObtenerNota {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce una nota");
		int valor = scan.nextInt();
		
		
		if(valor > 0 && valor < 5) {
			System.out.println("Suspenso");
		}else if(valor >= 5 && valor < 7) {
			System.out.println("Aprobado");
		}else if(valor >= 7 && valor < 9) {
			System.out.println("Notable");
		}else if(valor == 10) {
			System.out.println("Sobresaliente");
		}else {
			System.out.println("La nota es incorrecta");
		}
		
		switch(valor) {
		case 1:
		case 2:
		case 3:
		case 4: System.out.println("Suspenso");
		break;
		case 5: 
		case 6: System.out.println("Aprobado");
		break;
		case 7: 
		case 8:
		case 9: System.out.println("Notable");
		break;
		case 10: System.out.println("Sobresaliente");
		break;
		default: System.out.println("La nota es incorrecta");
		}

	}

}
