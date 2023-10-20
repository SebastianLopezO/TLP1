package View;

import java.util.Scanner;

import Logic.ControlValues;
import Utility.FileManagement;

public class Menu {

	public Menu() 
	{	
		Scanner sc = new Scanner(System.in);
		String root = System.getProperty("user.dir");
		
		boolean app = true;
		
		
		
		//Cargar menu
		String[] options = {"Captura Valores","Transformar Valores","Listar","Salir"};
		String console = "";
		String line = "-".repeat(39);
		for(int i=0;i<options.length;i++) {
			console += String.format("|      %d. %-20s        |\n",i+1,options[i]);
		}
		
		while(app) {
			System.out.printf("%s\n%23s\n%s\n", line, "Menú Principal", line);
		    System.out.print(console);
		    System.out.printf("%s\nSeleccione Opción: ", line); 
			int option = sc.nextInt();
			switch (option)
			{
				case 1 :
					FileManagement.DeleteFile(root+"/src/database/squentialFlat.txt");
					new InputValues();
					break;
				case 2 :
					FileManagement.DeleteFile(root+"/src/database/randomFlat.txt");
					ControlValues lValores = new ControlValues();
					lValores.transformarDatosAleatorio();
					break;				
				case 3 :
					new ControlValues().listarDatosAleatorio();
					break;		
				case 4:
					System.out.println("Lo esperamos.");
					app=false;
					break;
				default :
					System.out.println("Debe Seleccionar una opción valida.");
					break;
			}
		}
	}
}
