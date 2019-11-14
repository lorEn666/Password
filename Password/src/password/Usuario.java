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

	public void añadirUsuario() {
		Scanner leer = new Scanner(System.in);
		String nombre;
		int longitudContraseña;

		for (int i = 0; i < vUsuario.length; i++) {
			if (vUsuario[i] == null) {
				System.out.println("Inserte nombre del nuevo Usuario:");
				this.nombre = leer.nextLine();
				System.out.println(
						"Se generarán 10 contraseñas para el nuevo usuario. Inserte la longitud de las mismas:");
				longitudContraseña = leer.nextInt();
				
				vUsuario[i] = new Password(longitudContraseña);
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
		return "Usuario:" + nombre + "   Contraseña:" + Arrays.toString(vUsuario);
	}
	
	

}
