package password;

import java.util.Scanner;

public class Menu {
	
	public static int despliegaMenu() {
		Scanner leer = new Scanner(System.in);
		int opcionEscogida;
		
		do {
			System.out.println("1- Añadir Usuario");
			System.out.println("2- Borrar Usuario");
			System.out.println("3- Editar usuario");
			System.out.println("4- Ver todos los Usuarios");
			System.out.println("5- Salir");
			opcionEscogida = leer.nextInt();
			return opcionEscogida;
		} while (opcionEscogida!=5);
	}

}
