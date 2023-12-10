package logic;

import java.util.ArrayList;
import java.util.Scanner;

import Bean.Admin;
import Bean.Curso;
import Interface.Esquema;

public class LCursos implements Esquema <Curso, String> {

	
	public void Ingresar(ArrayList<Curso> Inventario, Admin Admin ) {
		if(Admin.getInventario() == null) {
			Admin.setInventario(Inventario);
		}else {
			ArrayList<Curso> InventarioOG = Admin.getInventario();
			for (Curso curso : Inventario) {
				InventarioOG.add(curso);
			}
 			Admin.setInventario(InventarioOG);
		}
	}

	@Override
	public Curso Buscar(ArrayList<Curso> Inventario, String bus) {
		Curso P = null;
		for (int i= 0; i < Inventario.size(); i++) {
			if(Inventario.get(i).getCurso().equalsIgnoreCase(bus)) {
				P = Inventario.get(i);
			}
		}
		return P;
	}

	@Override
	public ArrayList<Curso> Eliminar(ArrayList<Curso> Inventario, String bus) {
		for (int i= 0; i < Inventario.size(); i++) {
			if(Inventario.get(i).getCurso().equals(bus)) {
				Inventario.remove(i);
			}
		}
		return Inventario;
	}

	@Override
	public ArrayList<Curso> Reemplazar(ArrayList<Curso> Inventario, Curso producto, String bus) {
		for (int i= 0; i < Inventario.size(); i++) {
			if(Inventario.get(i).getCurso().equalsIgnoreCase(bus)) {
				Inventario.remove(i);
				Inventario.add(producto);
			}
		}
		return Inventario;
	}

	@Override
	public void Mostrar(ArrayList<Curso> Inventario) {
		try {
			for(Curso Productos: Inventario) {
				Productos.MostrarInfo();
			}
		} catch (Exception e) {
			System.out.println("No hay registros");
		}
	}
	
	public ArrayList<Curso> Modificar_Cantidad(ArrayList<Curso> Inventario, String bus, int Cambio) {
		for (int i= 0; i < Inventario.size(); i++) {
			if(Inventario.get(i).getCurso().equalsIgnoreCase(bus)) {
				Inventario.get(i).setCant(Cambio);;
			}
		}
		return Inventario;
	}

}
