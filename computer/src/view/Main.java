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
		Boolean App=true; //Control de App
		String option=""; //Options
		
		Computer C = new Computer(); //Puntero
		ArrayList<Computer> Computers =  new ArrayList<>(); // Datos
		
		while(App) {
			option = Menu();
			switch(option) {
				case "Ingresar Computador":
					break;
				case "Modificar Computador":
					C = SelectedComputer();
					break;
				case "Eliminar Computador":
					break;
				case "Mostar Computador":
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
		}
		

	}
	
	public static String Menu() {
        String[] Options = {
        		"Ingresar Computador",
                "Modificar Computador",
                "Eliminar Computador",
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
	
	public static String MenuPC() {
        String[] Options = {
        		"Ingresar Computador",
                "Modificar Computador",
                "Eliminar Computador",
                "Volver"
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
	
	public static int SelectedComputer(String[] Options) {

		
		String Option = (String) JOptionPane.showInputDialog(
				null, 
				"Seleccione un Computador: ", 
				"Computadores Poli",
				JOptionPane.QUESTION_MESSAGE, 
				null, 
				Options, 
				Options[0]);
		
		return 

	}
}