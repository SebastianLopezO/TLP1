package View;

import java.util.Scanner;

import Logic.Student;
import Utility.FileManagement;

public class Menu {

	public Menu() 
	{	
		Scanner sc = new Scanner(System.in);
		
		boolean app = true;
		
		
		
		//Cargar menu
		String[] options = {"Ingresar","Listar","Salir"};
		String console = "";
		String line = "-".repeat(39);
		for(int i=0;i<options.length;i++) {
			console += String.format("|      %d. %-20s        |\n",i+1,options[i]);
		}
		
		while(app) {
			System.out.printf("%s\n%23s\n%s\n", line, "Menu Principal", line);
		    System.out.print(console);
		    System.out.printf("%s\nSeleccione Opcion: ", line); 
			int option = sc.nextInt();
			switch (option)
			{
				case 1 :
					FileManagement.DeleteFile("DataSerialized.txt");
					new InputValues();
					break;
				case 2 :
					new Student().ReadData();
					break;				
				case 3:
					System.out.println("Saliendo...");
					app=false;
					break;
				default :
					System.out.println("Debe Seleccionar una opción valida.");
					break;
			}
		}
	}
}
