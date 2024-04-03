package edu.ucjc.programacion.ejercicios;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int option = 0;
		do{
			System.out.println("     MENU\n");
			System.out.println("1. Mostrar Matriz");
			System.out.println("2. Pintar Cuadrado");
			System.out.println("3. Serie Fibonacci");
			System.out.println("4. Salir");
			
			option = scan.nextInt();
			
			switch(option) {
			case 1: for(int i= 1; i<= 9; i++) {
				System.out.print(i);
				if(i == 3 || i == 6) {
					System.out.println();
				}
			}
			System.out.println("\n");
			break;
			case 2: System.out.println("Ingresar Tamaño");
				int tamaño = scan.nextInt();
				for(int i = 1; i <= tamaño; i++) {
					for(int j = 1; j <= tamaño; j++) {
						if(i == 1 || i == tamaño) {
							System.out.print("* ");
						}
						else if(j == 1 || j == tamaño) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
				System.out.println("\n");
				break;
			case 3: 
				int n1= 0;
				int n2 = 1;
				int n3;
				System.out.println("Cuantos numeros de la serie de Fibonacci quieres mostrar?");
				int count = scan.nextInt();
				System.out.print(n1+" "+n2);
				for(int i=2;i<count;++i) {
					n3 = n1+n2;
					System.out.print(" "+ n3);
					n1 = n2;
					n2 = n3;
				}
				System.out.println("\n");
				break;
			case 4: System.out.println("Adios");
				break;
			default: System.out.println("Opcion Incorrecta");
				break;
			}
		}while(option != 4);
	}
}
