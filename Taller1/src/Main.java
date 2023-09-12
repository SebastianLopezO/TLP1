import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		boolean app = true, cons = false;
		String Option, OptionCon;
		while (app) {
			Option = Menu();
			switch (Option) {
			case "1. Cargar Datos":
				ArrayList<ArrayList<String>> data = ReadFilePlane();
				System.out.printf("%-20s%-20s%-20s%-20s%-20s\n","Id","Name","Birth","Sex","Expenses");
				for(ArrayList<String> register: data) {
					for(String dt: register) {
						System.out.printf("%-20s",dt);
					}
					System.out.println();
				}
				break;
			case "2. Consultas":
				cons = true;
				break;
			case "3. Salir":
				app = false;
				break;
			}
			
			while(cons) {
				OptionCon = MenuCon();
				switch (OptionCon) {
				case "1. Cantidad x Sexo":
					break;
				case "2. Total Ingresos x Sexo":
					break;
				case "3. Regresar":
					cons = false;
					break;
				}
			}
		}
	}

	public static String Menu() {
		String[] options = { "1. Cargar Datos", "2. Consultas", "3. Salir" };
		String option = (String) JOptionPane.showInputDialog(null, "Seleccionar una acción: ", "Menu: ",
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		return option;

	}

	public static String MenuCon() {
		String[] options = { "1. Cantidad x Sexo", "2. Total Ingresos x Sexo", "3. Regresar" };
		String option = (String) JOptionPane.showInputDialog(null, "Seleccionar una consulta: ", "Consultas: ",
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		return option;
	}
	
	public static ArrayList<ArrayList<String>> ReadFilePlane(){
		String root = System.getProperty("user.dir");
		ArrayList<ArrayList<String>> data = new ArrayList<>();
		
		try {
			FileReader File = new FileReader(root+"\\src\\Secuencial.txt");
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
	
	public static void CreateRandom() {
		
	}
}