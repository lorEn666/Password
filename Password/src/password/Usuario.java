package password;

public class Usuario {
	private String nombre;
	private String vContrase�a[];

	public Usuario() {
		nombre = "";
		String vContrase�a[] = new String[10];
	}

	public Usuario(String nombre, String[] vContrase�a) {
		this.nombre = nombre;
		this.vContrase�a = vContrase�a;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String[] getvContrase�a() {
		return vContrase�a;
	}

}
