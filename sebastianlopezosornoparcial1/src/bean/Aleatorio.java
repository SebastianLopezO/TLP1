package bean;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Aleatorio extends File{

	public Aleatorio(String Name, String Path) {
		super(Name, Path);
		// TODO Auto-generated constructor stub
	}
	
	public void Show() {
		ArrayList<ArrayList<String>> data = ReadFilePlane();
		System.out.println("\nTipos de Datos");
		System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n","Id","Cadena","Entero","Fecha","Caracter","Flotante");
		for(ArrayList<String> register: data) {
			for(String dt: register) {
				System.out.printf("%-20s",dt);
			}
			System.out.println("");
		}
		System.out.println();
	}
	
	public void Transfer(ArrayList<ArrayList<String>> data) {
		
	}
	
	public  ArrayList<ArrayList<String>> ReadFilePlane(){
		String root = System.getProperty("user.dir");
		ArrayList<ArrayList<String>> data = new ArrayList<>();
		
		try {
			FileReader File = new FileReader(root+"\\src\\db\\data.txt");
			BufferedReader Br = new BufferedReader(File);
			
			String line=Br.readLine();
			while(line!=null) {
				data.add(new ArrayList<>(Arrays.asList(line.split(","))));
				line = Br.readLine();
			}
			Br.close();
		}catch(IOException e) {
			System.out.print("Hubo un error: "+e);
		}
		
		return data;
	}
}