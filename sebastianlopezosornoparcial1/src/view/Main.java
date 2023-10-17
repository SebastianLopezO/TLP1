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

import bean.Aleatorio;
import bean.Secuencial;
import utility.Validate;
public class Main{
	public static void main(String[] args) {
		boolean app = true;
		Scanner sc = new Scanner(System.in);
		int option;
		
		String root = System.getProperty("user.dir");
		
		
		Secuencial sec= new Secuencial("DataSec",root+"//src//db//DataSec.txt");
		Aleatorio ale = new Aleatorio("DataAle",root+"//src//db//DataAle.txt");
		while(app) {
			System.out.print(  "--------------------------\n"
							+  "-   Aplicacion MUV-U	 -\n"
					        +  "--------------------------\n"
							+  "-      1.Ingresar        -\n"
							+  "-      2.Listar          -\n"
							+  "-      0.Salir           -\n"
							+  "--------------------------\n");
			option = Validate.GetNum();
			
			switch(option) {
				case 1:
					sec.Insert();
					break;
				case 2:
					ale.Transfer(sec.ReadFilePlane());
					ale.Show();
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
	
}