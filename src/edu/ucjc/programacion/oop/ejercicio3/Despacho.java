package edu.ucjc.programacion.oop.ejercicio3;

public class Despacho {
	//Composición
		private String nombre;
		private Mesa mesa;
		private Silla silla;
		
		//Constructor
		public Despacho(String nombre, Mesa mesa, Silla silla) {
			super();
			this.nombre = nombre;
			this.mesa = mesa;
			this.silla = silla;
		}
		
		//Métodos get y set
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public Mesa getMesa() {
			return mesa;
		}
		public void setMesa(Mesa mesa) {
			this.mesa = mesa;
		}
		public Silla getSilla() {
			return silla;
		}
		public void setSilla(Silla silla) {
			this.silla = silla;
		}
		
}
