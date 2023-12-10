package Bean;

import java.util.ArrayList;

public class Admin extends Agencia {
	private int identificacion;
	private String Nombre;
	private String Correo;
	private long Telefono;
	
	
	public Admin(int identificacion, String nombre, String correo, long telefono, String Nombre_Negocio, ArrayList<Curso> Inventario) {
		  
		super(Nombre_Negocio, Inventario );
		this.identificacion = identificacion;
		this.Nombre = nombre;
		this.Correo = correo;
		this.Telefono = telefono;
	}
	
	
	
	public Admin() {
		super();
		this.identificacion = 0;
		this.Nombre = "";
		this.Correo = "";
		this.Telefono = 0;
	}



	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public long getTelefono() {
		return Telefono;
	}
	public void setTelefono(long telefono) {
		Telefono = telefono;
	}
	
	public String Mostrar_InfoBasica() {
		String S = identificacion+","+Nombre+","+Correo+","+Telefono+","+Mostrar_Nombre();	
		return S;
	}
	
	
}
