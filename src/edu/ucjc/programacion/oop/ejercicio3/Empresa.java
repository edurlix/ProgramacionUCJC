package edu.ucjc.programacion.oop.ejercicio3;

public class Empresa {
	public static void main(String[] args) {
		
		Silla silla = new Silla(1,"blanco",100);
		Mesa mesa = new Mesa(1,"blanca",200);
		
		Despacho despacho = new Despacho("despacho1",mesa,silla);
		
		
		Silla s1 = despacho.getSilla();
		System.out.println(s1.getPrecio());
		System.out.println(despacho.getSilla().getColor());

	}
}
