package password;

import java.util.Arrays;
import java.util.Scanner;

public class Usuario {
	private String nombre;
	private Password vUsuario[];

	public Usuario() {
		nombre = "";
		vUsuario = new Password[10];
	}

	public Usuario(Password[] vUsuario) {
		nombre = "";
		this.vUsuario = vUsuario;
	}

	public void a�adirUsuario() {
		Scanner leer = new Scanner(System.in);
		String nombre;
		int longitudContrase�a;

		for (int i = 0; i < vUsuario.length; i++) {
			if (vUsuario[i] == null) {
				System.out.println("Inserte nombre del nuevo Usuario:");
				this.nombre = leer.nextLine();
				System.out.println(
						"Se generar�n 10 contrase�as para el nuevo usuario. Inserte la longitud de las mismas:");
				longitudContrase�a = leer.nextInt();
				
				vUsuario[i] = new Password(longitudContrase�a);
				break;
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
		return "Usuario:" + nombre + "   Contrase�a:" + Arrays.toString(vUsuario);
	}
	
	

}
