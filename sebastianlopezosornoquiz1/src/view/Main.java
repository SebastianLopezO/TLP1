package view;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean app = true;
		Scanner sc = new Scanner(System.in);
		int option;
		
		while(app) {
			System.out.print(  "--------------------------\n"
							+  "-   Aplicacion MUV-U	 -\n"
					        +  "--------------------------\n"
							+  "-      1.Ingresar        -\n"
							+  "-      2.Listar          -\n"
							+  "-      0.Salir           -\n"
							+  "--------------------------\n");
			option = GetNum();
			
			switch(option) {
				case 1:
					Insert();
					break;
				case 2:
					Show();
					break;
				case 0:
					app = false;
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Debes ingresar un numero valido");
					break;
			}
		}
	}
	
	
	public static int GetNum() {
		int num;
        while (true) {
            try {
            	Scanner sc = new Scanner(System.in);
                num = sc.nextInt();
                return num;
            } catch (InputMismatchException ex) {
                System.out.println("No ha insertado un numero, error" + ex);
            }
        }
	}
	
	
	public static void Insert() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Ingrese el codigo del pais:");
		int Id = GetNum();

		System.out.println("Ingrese el nombre del pais:");
		String Country = sc.nextLine();
		System.out.println("Ingrese la abreviatura del pais:");
		String Abbreviaton = sc.nextLine();
		if(!Exist(Id)) {
			WriteFilePlane(Id,Country,Abbreviaton);
		}else {
			System.out.println("Este codigo de pais ya existe");
		}
		
		System.out.println();
	}
	
	public static boolean Exist(int Id) {
		String root = System.getProperty("user.dir");
		boolean exist = false;
		try {
			FileReader File = new FileReader(root+"\\src\\db\\data.txt");
			BufferedReader Br = new BufferedReader(File);
			
			String line=Br.readLine();
			while(line!=null) {
				String[] data = line.split(",");
				if(Integer.parseInt(data[0]) == Id) {
					return true;
				}
				line = Br.readLine();
			}
			Br.close();
		}catch(IOException e) {
			System.out.print("Hubo un error: "+e);
		}
		return exist;
	}
	
	public static void WriteFilePlane(int Id, String Country, String Abbreviaton ) {
		String root = System.getProperty("user.dir");
		
		try {
			FileWriter File = new FileWriter(root+"\\src\\db\\data.txt", true);
			BufferedWriter Bw = new BufferedWriter(File);
			PrintWriter line = new PrintWriter(Bw);
			line.append(Id + "," + Country + "," + Abbreviaton+"\n");
			line.close();
			Bw.close();
			System.out.println("Se registro correctamente");
		}catch(IOException e) {
			System.out.print("Hubo un error: "+e);
		}
	}
	
	public static ArrayList<ArrayList<String>> ReadFilePlane(){
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
	
	public static void Show() {
		ArrayList<ArrayList<String>> data = ReadFilePlane();
		System.out.println("\nPaises de Intercambio");
		System.out.printf("%-20s%-20s%-20s\n","Id","Country","Abbreviation");
		for(ArrayList<String> register: data) {
			for(String dt: register) {
				System.out.printf("%-20s",dt);
			}
			System.out.println("");
		}
		System.out.println();
	}
}