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

public class InputValues {

	public InputValues() {

		PersonRemote Person;
		StudentRemote Student;
		try {
			// Services

			Person = (PersonRemote) InitialContext.doLookup("/PreparativoQuiz3EJB/Person!Bean.PersonRemote");

			int year, month, day;

			System.out.println("Inicia captura de valores");

			ArrayList<Person> Estudiantes = new ArrayList<Person>();

			int ciclos = 0;
			do {
				Person Estudiante = new Person();
				Scanner sc = new Scanner(System.in);
				System.out.println("Ciclo" + (ciclos + 1));
				Estudiante.setId(1);
				System.out.println("    Ingrese los nombre del estudiante: ");
				Estudiante.setName(sc.nextLine());

				System.out.println("    Ingrese los apellidos del estudiante: ");
				Estudiante.setLastname(sc.nextLine());

				System.out.println("    Ingrese la fecha de Nacimiento del estudiante: ");
				System.out.println("       Digite el año a cuato digitos: ");
				year = Validate.GetNum();

				System.out.println("       Digite el mes a dos digitos: ");
				month = Validate.GetNum();

				System.out.println("       Digite el día a dos digitos: ");
				day = Validate.GetNum();
				Estudiante.setDateBirth(LocalDate.of(year, month, day));

				new Student(Estudiante);
				Estudiantes.add(Estudiante);
				ciclos++;
			} while (ciclos < 3);
			Student = (StudentRemote) InitialContext.doLookup("/PreparativoQuiz3EJB/Student!Logic.StudentRemote");
			new Student().WriteData(Estudiantes);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			System.out.println(
					"Se ha generado un error al intentar cargar el esquema de ingreso de datos: " + e.getMessage());
		}
	}
}
