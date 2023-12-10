package Bean;

import java.io.Serializable;
import java.util.ArrayList;

public class Agencia implements Serializable {
	private String Name;
	private ArrayList<Curso> Inventario;
	
	

	public Agencia() {
		Name = "";
		Inventario = null;
	}

	 
	public Agencia(String Nombre_Negocio, ArrayList<Curso> Inventario) {
		this.Name = Nombre_Negocio;
		this.Inventario = Inventario;
	}

	public String getAgencia() {
		return Name;
	}

	public void setAgencia(String Agencia) {
		Name = Agencia;
	}
	
	public String Mostrar_Nombre() {
		String S = Name;
		return S;
	}
	

	public ArrayList<Curso> getInventario() {
		return Inventario;
	}

	public void setInventario(ArrayList<Curso> inventario) {
		Inventario = inventario;
	}

	
}
