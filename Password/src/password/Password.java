package password;

import java.util.Random;

public class Password {
	private int longitud;
	private String contrase�a;
	private boolean nivelSeguridad;

	// Constructores

	public Password() {
		longitud = 8;
		contrase�a = "";
		generarPassword(longitud);
		nivelSeguridad = esFuerte(contrase�a);
	}

	public Password(int longitud, String contrase�a) {
		this.longitud = longitud;
		generarPassword(longitud);
		esFuerte(contrase�a);
	}

	private void generarPassword(int longitud) {
		Random num = new Random();
		String libreria = "1234567890AaBbCcDdEeFfGgHhIiJjKkLlMmNn��OoPpQqRrSsTtUuVvXxYyZz!@#$%&/()=?�*��_-:;><�{}[]+^.,���";

		for (int i = 0; i < longitud; i++) {
			int posicion = num.nextInt(libreria.length());
			contrase�a += libreria.charAt(posicion);
		}
	}

	public boolean esFuerte(String contrase�a) {
		int numeroMayusculas = 2, numeroMinusculas = 1, numeroNumeros = 5;
		String libreriaMayusculas = "ABCDEFGHIJKLMN�OPQRSTUVXYZ";
		String libreriaMinusculas = "abcdefghijklmn�opqrstuvxyz";
		String libreriaNumeros = "1234567890";

		inicio: for (int i = 0; i < contrase�a.length(); i++) {
			for (int j = 0; j < libreriaMayusculas.length(); j++) {
				if (contrase�a.substring(i, i + 1).equals(libreriaMayusculas.substring(j, j + 1))) {
					numeroMayusculas--;
					continue inicio;
				}
			}

			for (int j2 = 0; j2 < libreriaMinusculas.length(); j2++) {
				if (contrase�a.substring(i, i + 1).equals(libreriaMinusculas.substring(j2, j2 + 1))) {
					numeroMinusculas--;
					continue inicio;
				}
			}

			for (int k = 0; k < libreriaNumeros.length(); k++) {
				if (contrase�a.substring(i, i + 1).equalsIgnoreCase(libreriaNumeros.substring(k, k + 1))) {
					numeroNumeros--;
					continue inicio;
				}
			}
		}

		if ((numeroMayusculas < 0) && (numeroMinusculas < 0) && (numeroNumeros < 0)) {
			return true;
		} else {
			return false;
		}
	}

	// Getters de contrase�a y longitud y setter solo de longitud

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	// ToString

	@Override
	public String toString() {
		return "Longitud: " + longitud + " Contrase�a: " + contrase�a + " Es segura: " + nivelSeguridad;
	}

}
