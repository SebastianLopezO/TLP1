package logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import Bean.Admin;
import Interface.Esquema;

public class LAdmin implements Esquema <Admin, Integer>{
	String root = System.getProperty("user.dir");
	private File F = new File(root+"EJB/ejbModule/DataBase/Admin.txt");	
	
	
	public void Ingresar(ArrayList<Admin> Registros ) {
		BorrarArchivo();		
		try {
			FileOutputStream B = new FileOutputStream(F);
			ObjectOutputStream Escribir = new ObjectOutputStream(B);
			Escribir.writeObject(Registros);
			Escribir.close();
		} catch (Exception e) {}
	}
	
	@Override
	public Admin Buscar(ArrayList<Admin> Registro, Integer bus) {
		Admin Encontrado = null;
		for (Admin dueño : Registro) {
			if(dueño.getIdentificacion() == bus) 
				Encontrado = dueño;
		}
		return Encontrado;
	}

	@Override
	public ArrayList<Admin> Eliminar(ArrayList<Admin> Registro, Integer bus) {
		for (int i= 0; i < Registro.size(); i++) {
			if(Registro.get(i).getIdentificacion() == bus) {
				Registro.remove(i);
			}
		}
		return Registro;
	}

	@Override
	public ArrayList<Admin> Reemplazar(ArrayList<Admin> Registro, Admin Dueño, Integer bus) {
		for (int i = 0; i < Registro.size(); i++) {
			if(Registro.get(i).getIdentificacion() == bus) { 
				Registro.remove(i);
				Registro.add(i, Dueño);
			}
		}
		return Registro;
	}
	
	public ArrayList<Admin> GenerarSerializado() {
		ArrayList<Admin> Registro = new ArrayList<>() ;
		try {
			FileInputStream A = new FileInputStream(F);
			ObjectInputStream Leer = new ObjectInputStream(A);
			if(ContentExist())
				Registro = (ArrayList<Admin>) (Leer.readObject());
			
			Leer.close();
		} catch (Exception e) {}
		return Registro;
	}

	public void Mostrar(ArrayList<Admin> Registro) {
		try {
			for(Admin Dueño: Registro) {
				Dueño.Mostrar_InfoBasica();
			}
		} catch (Exception e) {
			System.out.println("No hay registro el cual mostrar");
		}
	
		
	}

	private void BorrarArchivo() {
		try {
			FileWriter A = new FileWriter(F, false);
			A.write("");
			A.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public boolean ContentExist() {
		if(F.length() > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void EscribirArchivo(String Nombre) {
		try {
			ZonedDateTime FechaI = ZonedDateTime.now();
			DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			String root = System.getProperty("user.dir");
			FileWriter a = new FileWriter(root+"EJB/ejbModule/DataBase/Agencias.txt", true);
			BufferedWriter b = new BufferedWriter(a);
			b.write( "\n" + Nombre +","+FechaI.format(forma));
			b.close();
		} catch (Exception e) {}
	}
	
	public ArrayList<String> LeerArchivo() {
		String S = "";
		ArrayList<String> reg = new ArrayList<>();
		try {
			String root = System.getProperty("user.dir");
			FileReader a = new FileReader(root+"EJB/ejbModule/Datos/Agencias.txt");
			BufferedReader leer = new BufferedReader(a);
			while(S != null) {
				if(S != null) {
					S = leer.readLine();
					reg.add(S);
				}
			}
			leer.close();
		} catch (Exception e) {}
		return reg;
	}
}

	
	
	
	
	

