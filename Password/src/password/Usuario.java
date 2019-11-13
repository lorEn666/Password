package password;

public class Usuario {
	private String nombre;
	private String vContraseña[];

	public Usuario() {
		nombre = "";
		String vContraseña[] = new String[10];
	}

	public Usuario(String nombre, String[] vContraseña) {
		this.nombre = nombre;
		this.vContraseña = vContraseña;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String[] getvContraseña() {
		return vContraseña;
	}

}
