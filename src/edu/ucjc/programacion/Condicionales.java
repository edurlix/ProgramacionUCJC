package edu.ucjc.programacion;

public class Condicionales {
	public static void main(String[] args) {
		// Los operadores condicionales && y ||
		int num = 10;
		if(num > 12) {
			System.out.println("Num es mayor que 12");
		}else if(num > 9 && num < 12) {
			System.out.println("Num entre 9 y 12");
		}else {
			System.out.println("no es mayor que 12");
		}
		// switch
		int option = 9;
		switch(option) {
		case 1:
		case 2: 
		case 3: System.out.println("El valor esta entre 1 y 3");
		break;
		case 9: System.out.println("El valor es 9");
		break;
		default: System.out.println("No es ningun valor controlado");
		}
	}
}

