package password;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

//		Scanner leer = new Scanner(System.in);
//		int tama�oVector, longitudContrase�a;
//
//		System.out.println("�Cu�ntas contrase�as quiere guardar?");
//		tama�oVector = leer.nextInt();
//
//		Password vContrase�a[] = new Password[tama�oVector];
//		boolean vFuerte[] = new boolean[tama�oVector];
//
//		System.out.println("�Qu� longitud desea que tengan las contrase�as?");
//		longitudContrase�a = leer.nextInt();
//
//		for (int i = 0; i < vContrase�a.length; i++) {
//			vContrase�a[i] = new Password(longitudContrase�a);
//			vFuerte[i] = vContrase�a[i].esFuerte();
//			System.out.println(vContrase�a[i].toString());
//		}
		
		int opc;
		Usuario user = new Usuario();
				
		do {
			switch (opc = Menu.despliegaMenu()) {
			case 1:
				user.a�adirUsuario();
				System.out.println(user);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			}
		} while (opc!=5);
		
		
		
	}
}
