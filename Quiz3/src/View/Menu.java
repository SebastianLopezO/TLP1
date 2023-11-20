package View;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import Bean.Person;
import Bean.PersonRemote;
import Logic.Student;
import Logic.StudentRemote;
import Utility.Validate;

public class Menu {
	public Menu() {
		Scanner sc = new Scanner(System.in);

		boolean app = true;

		// Cargar menu
		String[] options = { "Ingresar","Buscar","Eliminar","Listar","Vaciar", "Salir" };
		String console = "";
		String line = "-".repeat(39);
		for (int i = 0; i < options.length; i++) {
			console += String.format("|      %d. %-20s        |\n", i + 1, options[i]);
		}

		while (app) {
			System.out.printf("%s\n%23s\n%s\n", line, "Menu Principal", line);
			System.out.print(console);
			System.out.printf("%s\nSeleccione Opcion: ", line);
			int option = sc.nextInt();

			switch (option) {
				case 1:
					PersonRemote Person;
					StudentRemote Student;
					try {
						// Services

						Person = (PersonRemote) InitialContext.doLookup("/PreparativoQuiz3EJB/Person!Bean.PersonRemote");

						int year, month, day;

						System.out.println("Inicia captura de valores");

						Person Estudiante = new Person();
						
						Estudiante.setId(Validate.GetID());
						System.out.println("    Ingrese los nombre del estudiant<e: ");
						Estudiante.setName(sc.nextLine());

						System.out.println("    Ingrese los apellidos del estudiante: ");
						Estudiante.setLastname(sc.nextLine());

						System.out.println("    Ingrese la fecha de Nacimiento del estudiante: ");
						System.out.println("       Digite el año a cuatro digitos: ");
						year = Validate.GetNum();

						System.out.println("       Digite el mes a dos digitos: ");
						month = Validate.GetNum();

						System.out.println("       Digite el día a dos digitos: ");
						day = Validate.GetNum();
						Estudiante.setDateBirth(LocalDate.of(year, month, day));
						
						
						
						Student = (StudentRemote) InitialContext.doLookup("/PreparativoQuiz3EJB/Student!Logic.StudentRemote");
						new Student().WriteData(Estudiante);
					} catch (NamingException e) {
						// TODO Auto-generated catch block
						System.out.println(
								"Se ha generado un error al intentar cargar el esquema de ingreso de datos: " + e.getMessage());
					}
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				case 6:
					System.out.println("Saliendo...");
					app = false;
					break;
				default:
					System.out.println("Debe Seleccionar una opción valida.");
					break;
			}
		}
	}
}
