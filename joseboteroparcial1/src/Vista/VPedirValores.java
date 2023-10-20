package Vista;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

import bean.BValores;
import logica.LValores;
import utilidades.ManejoArchivos;

public class VPedirValores extends LValores{
	
	public VPedirValores() {
		
		BValores bValores = new BValores();
		
		int annio, mes, dia;
		
		System.out.println("Inicia captura de valores");
		
		int ciclos = 0;
		do {
			
			Scanner capturaValores = new Scanner(System.in);
			System.out.println("Ciclo" + (ciclos + 1));		
			System.out.println("    Primer valor (Cadena de caracteres) -> ");
			bValores.setCadena(capturaValores.nextLine());
			
			System.out.println("    Segundo valor (Entero) -> ");
			bValores.setEntero(capturaValores.nextInt());
			
			System.out.println("    Tercer valor (Fecha) -> ");
			System.out.println("       Digite el año a cuato digitos -> ");
			annio	= capturaValores.nextInt();
			
			System.out.println("       Digite el mes a dos digitos -> ");
			mes		= capturaValores.nextInt();
			
			System.out.println("       Digite el día a dos digitos -> ");
			dia		= capturaValores.nextInt();
			bValores.setFecha(LocalDate.of(annio, mes, dia));
			
			System.out.println("    Cuarto valor (Caracter) -> ");
			bValores.setCaracter(capturaValores.next().charAt(0));
			
			System.out.println("    Quinto valor (Punto Flotante la coma(,) -> ");
			bValores.setFlotante(capturaValores.nextFloat());
			
			new LValores(bValores);
			ciclos++;
		}while(ciclos < 2);		
		
	}
}	

	
