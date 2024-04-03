package edu.ucjc.programacion.ejercicios;

public class NumerosPares {
	public static void main(String[] args) {
		int par  = 100;
//		for(int impar = 1; impar <= 100; impar++) {
//			if(impar % 2 != 0) {
//				System.out.print(impar);
//			}
//			if(par % 2 == 0) {
//				System.out.println("-" + par);
//			}
//			par --;
//		}
		for(int i =1, j=100; j>=2; i+=2, j-=2) {
			System.out.println(i + "-" + j);
		}
	}
}
