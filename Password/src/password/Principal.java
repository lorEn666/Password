package password;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

//		Scanner leer = new Scanner(System.in);
//		int tamañoVector, longitudContraseña;
//
//		System.out.println("¿Cuántas contraseñas quiere guardar?");
//		tamañoVector = leer.nextInt();
//
//		Password vContraseña[] = new Password[tamañoVector];
//		boolean vFuerte[] = new boolean[tamañoVector];
//
//		System.out.println("¿Qué longitud desea que tengan las contraseñas?");
//		longitudContraseña = leer.nextInt();
//
//		for (int i = 0; i < vContraseña.length; i++) {
//			vContraseña[i] = new Password(longitudContraseña);
//			vFuerte[i] = vContraseña[i].esFuerte();
//			System.out.println(vContraseña[i].toString());
//		}

		int opc;
		Usuario user = new Usuario();

		do {
			switch (opc = Menu.despliegaMenu()) {
			case 1:
				user.añadirContraseña();
				break;
			case 2:
				user.verTodasContraseñas();
				break;
			}
		} while (opc != 3);

	}
}
