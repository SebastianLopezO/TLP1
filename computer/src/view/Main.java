/*Desarrollar una aplicación que solicite la captura de N comoutadores ( Componentes: Chasis, Board, Disco Duro )
 
 - Cada Objeto debe estar cargado en un ArrayList
 - Mostrar cada computador desde un metodo privado
 - Implementar los conceptos de : Modularización, Encapsulamiento, Composición;
 
*/
package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import computer.*;

public class Main{
	public static void main(String args[]) {
		Boolean App=true, AppPC=true; //Control de App
		String option="", optionPc=""; //Options
		
		Computer C = new Computer(); //Puntero
		ArrayList<Computer> Computers =  new ArrayList<>(); // Datos
		
		while(App) {
			AppPC=false;
			option = Menu();
			switch(option) {
				case "Ingresar Computador":
					break;
				case "Buscar Computador":
					String NamePC = SelectedComputer(Computers);
					C = FindComputer(Computers,NamePC);
					if(C!=null) {
						AppPC=true;
					}
					break;
				case "Mostrar":
					for(Computer PC: Computers) {
						PC.Show();
					}
					break;
				case "Guardar":
					break;
				case "Resetear":
					break;
				case "Salir":
					App = false;
					break;
			}
			
			while(AppPC) {
				optionPc = MenuPC(NamePC);
				switch(optionPc) {
				case "Visualizar Computador":
					break;
				case "Modificar Computador":
					break;
				case "Eliminar Computador":
					break;
				case "Volver":
					AppPC=false;
					break;
				}
			}
		}
		

	}
	
	public static String Menu() {
        String[] Options = {
        		"Ingresar Computador",
        		"Buscar Computador",
                "Guardar",
                "Resetear",
                "Salir"
        };
        String Option = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una Opcion: ",
                "Computadores Poli",
                JOptionPane.QUESTION_MESSAGE,
                null,
                Options,
                Options[0]);
        return Option;
    }
	
	public static String MenuPC(String NamePC) {
        String[] Options = {
        		"Visualizar Computador",
                "Modificar Computador",
                "Eliminar Computador",
                "Volver"
        };
        String Option = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una Opcion: ",
                "Computador "+NamePC,
                JOptionPane.QUESTION_MESSAGE,
                null,
                Options,
                Options[0]);
        return Option;
    }
	
	public static String SelectedComputer(ArrayList<Computer> Computers) {
		String[] Options = new String[Computers.size()];
		int i=0;
		for(Computer PC: Computers) {
			Options[i] = PC.getName();
			i++;
		}
		
		String Option = (String) JOptionPane.showInputDialog(
				null, 
				"Seleccione un Computador: ", 
				"Computadores Poli",
				JOptionPane.QUESTION_MESSAGE, 
				null, 
				Options, 
				Options[0]);
		
		return Option;
	}
	
	public static Computer FindComputer(ArrayList<Computer> Computers,String NameComputer) {
		for(Computer PC: Computers) {
			if(PC.getName().matches(NameComputer)) {
				return PC;
			}
		}
		return null;
	}
}