package edu.ucjc.programacion.Arrays.Ejercicios;

import java.util.Scanner;

public class EjerciciosArrays1 {

	public static void main(String[] args) {

	/*
	 * crear una array de numeros enteros del tamano que pidas por consola
	 * solicitar los numeros para las posiciones del array
	 * mostrar los numeros pares del array
	 * 
	 * */


		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de elementos que quieras almacenar: ");
		int cantidad = scan.nextInt();
		int [] numeros = new int[cantidad];
		
		for(int i = 0; i < cantidad; i++) {
			System.out.print("ingrese para la posicion "+ i + ": ");
				int num = scan.nextInt();
				numeros[i] = num;
			}
		System.out.println("======================");
			
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				System.out.print(numeros[i]);
			}
		}	
	}
}

