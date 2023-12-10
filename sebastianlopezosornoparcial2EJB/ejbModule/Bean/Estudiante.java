package Bean;

public class Estudiante {
	private String mail;
	private String password;
	private int id;
	
	public Estudiante(String correo, String contraseña, int id) {
		this.mail = correo;
		this.password = contraseña;
		this.id = id;
	}
	
	public Estudiante() {
		mail = "";
		password = "";
		id = 0;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMail() {
		return mail;
	}
	
	public void setMail(String correo) {
		this.mail = correo;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String contraseña) {
		this.password = contraseña;
	}
	
	
}
