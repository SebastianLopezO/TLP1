package View;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import Bean.Values;
import Logic.LoadValues;
import Utility.FileManagement;
import Utility.Validate;

public class InputValues extends LoadValues{
	
	public InputValues() {
		
		Values Valores = new Values();
		
		int year, month, day;
		
		System.out.println("Inicia captura de valores");
		
		int ciclos = 0;
		do {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Ciclo" + (ciclos + 1));		
			System.out.println("    Primer valor (Cadena de caracteres) -> ");
			Valores.setCadena(sc.nextLine());
			
			System.out.println("    Segundo valor (Entero) -> ");
			Valores.setEntero(Validate.GetNum());
			
			System.out.println("    Tercer valor (Fecha) -> ");
			System.out.println("       Digite el año a cuato digitos -> ");
			year	= Validate.GetNum();
			
			System.out.println("       Digite el mes a dos digitos -> ");
			month		= Validate.GetNum();
			
			System.out.println("       Digite el día a dos digitos -> ");
			day		= Validate.GetNum();
			Valores.setFecha(LocalDate.of(year, month, day));
			
			System.out.println("    Cuarto valor (Caracter) -> ");
			Valores.setCaracter(sc.next().charAt(0));
			
			System.out.println("    Quinto valor (Punto Flotante la coma(,) -> ");
			Valores.setFlotante(sc.nextFloat());
			
			new LoadValues(Valores);
			ciclos++;
		}while(ciclos < 5);		
		
	}
}	

	
