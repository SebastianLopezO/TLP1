package View;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


import Bean.Person;
import Logic.Student;
import Utility.Validate;

public class InputValues{
	
	public InputValues() {
		
		int year, month, day;
		
		System.out.println("Inicia captura de valores");
		
		
		ArrayList<Person> Estudiantes = new ArrayList<Person>();
		int ciclos = 0;
		do {
			Person Estudiante = new Person();
			Scanner sc = new Scanner(System.in);
			System.out.println("Ciclo" + (ciclos + 1));
			Estudiante.setId(ciclos+1);
			System.out.println("    Ingrese los nombre del estudiante: ");
			Estudiante.setName(sc.nextLine());
			
			System.out.println("    Ingrese los apellidos del estudiante: ");
			Estudiante.setLastname(sc.nextLine());
			
			System.out.println("    Ingrese la fecha de Nacimiento del estudiante: ");
			System.out.println("       Digite el año a cuato digitos: ");
			year	= Validate.GetNum();
			
			System.out.println("       Digite el mes a dos digitos: ");
			month		= Validate.GetNum();
			
			System.out.println("       Digite el día a dos digitos: ");
			day		= Validate.GetNum();
			Estudiante.setDateBirth(LocalDate.of(year, month, day));
			
		
			new Student(Estudiante);
			Estudiantes.add(Estudiante);
			ciclos++;
		}while(ciclos < 1);	
		new Student().WriteData(Estudiantes);
		
	}
}	

	
