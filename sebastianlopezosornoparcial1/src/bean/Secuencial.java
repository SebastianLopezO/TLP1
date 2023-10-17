package bean;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import utility.Validate;

public class Secuencial extends File{

	public Secuencial(String Name, String Path) {
		super(Name, Path);
		// TODO Auto-generated constructor stub
	}
	
	public void Insert() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		System.out.println("Ingrese una cadena de caracteres:");
		String Cadena = sc.nextLine();
		
		System.out.println("Ingrese un Entero:");
		int Entero = Validate.GetNum();
		
		System.out.println("Ingrese una Fecha en el formato (DD-MM-AAA):");
		Date Fecha = Validate.GetDate();
		
		System.out.println("Ingrese un Caracter:");
		char Caracter = sc.next().charAt(0);
		
		System.out.println("Ingrese un numero punto flotante:");
		float Flotante = sc.nextFloat();
		
		
		WriteFilePlane(Cadena,Entero,Fecha,Caracter,Flotante);
		
		System.out.println();
	}

	
	public  void WriteFilePlane(String Cadena,int Entero, Date Fecha, char Caracter,float Flotante) {
		
		try {
			FileWriter File = new FileWriter(this.getPath(), true);
			BufferedWriter Bw = new BufferedWriter(File);
			PrintWriter line = new PrintWriter(Bw);
			line.append(Cadena+"|"+Entero+","+Fecha+"="+Caracter+"!"+Flotante+" \n");
			line.close();
			Bw.close();
			System.out.println("Se registro correctamente");
		}catch(IOException e) {
			System.out.print("Hubo un error: "+e);
		}
	}
	
	public ArrayList<ArrayList<String>> ReadFilePlane(){
		ArrayList<ArrayList<String>> data = new ArrayList<>();
		
		try {
			FileReader File = new FileReader(this.getPath());
			BufferedReader Br = new BufferedReader(File);
			
			String line=Br.readLine();
			while(line!=null) {
				line.replace("|", ","); line.replace("=", ","); line.replace("!", ",");
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