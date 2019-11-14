package password;

import java.util.Arrays;
import java.util.Scanner;

public class Usuario {
	private String nombre;
	private Password vContrase�as[];

	public Usuario() {
		nombre = "";
		vContrase�as = new Password[10];
	}

	public Usuario(String nombre, int numeroContrase�as) {
		this.nombre = nombre;
		vContrase�as = new Password[numeroContrase�as];
	}

	public Usuario(String nombre) {
		this.nombre = nombre;
		vContrase�as = new Password[50];
	}

	public void a�adirContrase�a() {
		Scanner leer = new Scanner(System.in);
		int longitudContrase�a;

		System.out.println("Establece tama�o de la contrase�a:");
		longitudContrase�a = leer.nextInt();

		for (int i = 0; i < vContrase�as.length; i++) {
			if (vContrase�as[i] == null) {
				vContrase�as[i] = new Password(longitudContrase�a);
				break;
			}
		}
	}

	public void verTodasContrase�as() {
		for (int i = 0; i < vContrase�as.length; i++) {
			if (vContrase�as[i] != null) {
				System.out.println(vContrase�as[i]);

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
		String contrase�as = "";
		for (int i = 0; i < vContrase�as.length; i++) {
			if (vContrase�as[i] != null) {
				contrase�as += vContrase�as[i] + "\n";
			}
		}
		return nombre + "Contrase�as: \n " + contrase�as;
	}

}
