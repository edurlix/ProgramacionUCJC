package edu.ucjc.programacion.Arrays;

import java.util.Scanner;

public class PruebasArrays {
	public static void main(String[] args) {
		
		int [] num = {1,2,3,4};
		int [] num2 = new int[6];
		
		num2[0] = 1;
		num2[1] = 2;
		num = num2;
		System.out.println(num[1]);
	}
}
