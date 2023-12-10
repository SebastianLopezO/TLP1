package Bean;

import java.io.Serializable;

public class Curso implements Serializable {
	private String Name;
	private int Cant;
	
	
	public Curso(String nombre_Producto, int cant) {
		Name = nombre_Producto;
		Cant = cant;
	}
	
	public Curso() {
		Name = "";
		Cant = 0;
	}
	
	public String getCurso() {
		return Name;
	}
	public void setCurso(String Curso) {
		Name = Curso;
	}
	public int getCant() {
		return Cant;
	}
	public void setCant(int cant) {
		Cant = cant;
	}
	
	public String MostrarInfo() {
		String S = Name+","+Cant;
		return S;
	}
	
}
