package edu.ucjc.programacion.Arrays.Ejercicios;

public class EjerciciosArrays2 {

	public static void main(String[] args) {
		/*
		 * array de strings de longitud 3 con 3 emails
		 * validaremos el email para ver si es correcto
		 * El email no puede tener espacio en blanco, el email debe contener una @
		 * despues de la @ tiene que haber al menos un punto
		 * la distancia entre la @ y el primer punto despues de esta tiene que ser superior a 2
		 * el numero de caracteres despues del ultimo punto debe estar entre 2 y 5
		 * */
		String [] emails = {" eddy@gmail.com", "Anaoutlook.com", "Jose@g.fr", "Almira.g@gmailcom", "Sebastian@gmail.e"};
		
		for(String email : emails) {
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
			
			
			
//			for(int arrobaPunto = email.indexOf("@"); arrobaPunto < email.lastIndexOf("."); arrobaPunto++) {
//				count++;
//			}
//			if(count <= 2) {
//				isValido = false;
//				mensaje += "la distancia entre @ y el punto es menor que 2";
//			}
//			
//			
//			
//			for(int punto = email.lastIndexOf("."); punto < email.substring(punto).length(); punto++) {
//				despuesPunto++;
//				System.out.println(despuesPunto);
//			}
//			if(despuesPunto < 2 && despuesPunto > 5) {
//				isValido = false;
//				mensaje += "el dominio no es mayor que 2";
//			}
			
			if(!isValido) {
				System.out.println("el email " + email + " no es valido "+mensaje);
			}
			System.out.println();
		}
	}

}
