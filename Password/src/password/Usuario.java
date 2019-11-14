package password;

import java.util.Arrays;
import java.util.Scanner;

public class Usuario {
	private String nombre;
	private Password vContraseñas[];

	public Usuario() {
		nombre = "";
		vContraseñas = new Password[10];
	}

	public Usuario(String nombre, int numeroContraseñas) {
		this.nombre = nombre;
		vContraseñas = new Password[numeroContraseñas];
	}

	public Usuario(String nombre) {
		this.nombre = nombre;
		vContraseñas = new Password[50];
	}

	public void añadirContraseña() {
		Scanner leer = new Scanner(System.in);
		int longitudContraseña;

		System.out.println("Establece tamaño de la contraseña:");
		longitudContraseña = leer.nextInt();

		for (int i = 0; i < vContraseñas.length; i++) {
			if (vContraseñas[i] == null) {
				vContraseñas[i] = new Password(longitudContraseña);
				break;
			}
		}
	}

	public void verTodasContraseñas() {
		for (int i = 0; i < vContraseñas.length; i++) {
			if (vContraseñas[i] != null) {
				System.out.println(vContraseñas[i]);

			}
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		String contraseñas = "";
		for (int i = 0; i < vContraseñas.length; i++) {
			if (vContraseñas[i] != null) {
				contraseñas += vContraseñas[i] + "\n";
			}
		}
		return nombre + "Contraseñas: \n " + contraseñas;
	}

}
