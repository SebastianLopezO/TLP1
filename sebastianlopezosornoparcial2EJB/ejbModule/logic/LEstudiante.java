package logic;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Iterator;

import Bean.Estudiante;

public class LEstudiante {
	
	private File f = new File("./Datos/Estudiantes.txt");
	
	public void Ingresar(Estudiante a) {
		try {
			RandomAccessFile archivo = new RandomAccessFile(f, "rw");
			archivo.seek(archivo.length());
			archivo.writeUTF(a.getMail());
			archivo.writeUTF(a.getPassword());
			archivo.writeInt(a.getId());
			archivo.close();
		} catch (Exception e) {}	
	}
	
	public Estudiante BuscarUC(String usuario, String contraseña) {
		try {
			
			String bus1, bus2;
			int bus3;
			RandomAccessFile archivo = new RandomAccessFile(f, "r");
			archivo.seek(0);
			while(archivo.getFilePointer() < archivo.length()) {
				bus1 = archivo.readUTF();
				bus2 = archivo.readUTF();
				bus3 = archivo.readInt();
				if(bus1.equalsIgnoreCase(usuario) && bus2.equalsIgnoreCase(contraseña)) {
					Estudiante encontrado = new Estudiante(usuario, contraseña, bus3);
					return encontrado;
				}
			}
			archivo.close();	
		} catch (Exception e) {}
		return null;
	}
	
	public Estudiante BuscarID(int id) {
		try {
			
			String bus1, bus2;
			int bus3;
			RandomAccessFile archivo = new RandomAccessFile(f, "r");
			archivo.seek(0);
			while(archivo.getFilePointer() < archivo.length()) {
				bus1 = archivo.readUTF();
				bus2 = archivo.readUTF();
				bus3 = archivo.readInt();
				if(bus3 == id) {
					Estudiante encontrado = new Estudiante(bus1, bus2, bus3);
					return encontrado;
				}
			}
			archivo.close();	
		} catch (Exception e) {}
		return null;
	}
}
