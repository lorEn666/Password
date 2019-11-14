package password;

import java.util.Scanner;

public class Menu {
	
	public static int despliegaMenu() {
		Scanner leer = new Scanner(System.in);
		int opcionEscogida;
		
		do {
			System.out.println("1- Añadir Contraseña");
			System.out.println("2- Ver todas las Contraseñas");
			System.out.println("3- Salir");
			opcionEscogida = leer.nextInt();
			return opcionEscogida;
		} while (opcionEscogida!=3);
	}

}
