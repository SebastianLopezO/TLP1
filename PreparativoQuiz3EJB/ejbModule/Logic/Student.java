package Logic;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

import Bean.Person;
import Utility.FileManagement;

public class Student extends Person {
	public Student() {
		
	}
	
	public Student(Person Estudiante) {
		
	}
	
	public void WriteData(ArrayList<Person> Estudiantes) {
		ArrayList<Person> ListPersons = Estudiantes;
		Person[] Persons = new Person[ListPersons.size()];
		for (int i = 0; i < ListPersons.size(); i++) {

			Persons[i] = new Person();
			Persons[i].setId(ListPersons.get(i).getId());
			Persons[i].setName(ListPersons.get(i).getName());
			Persons[i].setLastname(ListPersons.get(i).getLastname());
			Persons[i].setDateBirth(ListPersons.get(i).getDateBirth());
			Persons[i].setType(ListPersons.get(i).getType());

		}
		try {
			FileOutputStream FilePath = new FileOutputStream(FileManagement.Root() + "DataSerialized.txt", true);
			ObjectOutputStream FileOutput = new ObjectOutputStream(FilePath);
			FileOutput.writeObject(Persons);
			FilePath.close();
			FileOutput.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Se ha generado un error FileNotFoundException al acceder al archivo: " + ex.getMessage());
		} catch (EOFException ex) {
			System.out.println("Se ha generado un error EOFException al acceder al archivo: " + ex.getMessage());
		} catch (IOException ex) {
			System.out.println("Se ha generado un error IOException al acceder al archivo: " + ex.getMessage());
		}
	}

	public ArrayList<Person> ReadData() {
		ArrayList<Person> data = new ArrayList<Person>();
		try
		{
			FileInputStream FilePath = new FileInputStream(FileManagement.Root()+"DataSerialized.txt");
			ObjectInputStream ObjInpt = new ObjectInputStream(FilePath);
			Person[] DataRead = (Person[]) ObjInpt.readObject();
			ObjInpt.close();
			FilePath.close();
			String line = "";
			
			for(int i=0; i < DataRead.length;i++)
			{
	
			data.add(DataRead[i]) ;
			
			}
			this.Show(data);
		}catch(FileNotFoundException ex) {
			System.out.println("Se ha generado un error FileNotFoundException al acceder al archivo: "+ex.getMessage());
		}catch(EOFException ex) {
			System.out.println("Se ha generado un error EOFException al acceder al archivo: "+ex.getMessage());
		}catch(ClassNotFoundException | IOException ex) {
			System.out.println("Se ha generado un error ClassNotFoundException o IOException  al acceder al archivo: "+ex.getMessage());
		}
		
		return data;
	}
	
	public void Show(ArrayList<Person> data) {
		for(Person P: data)
		{
			String line = P.getId() + " - " + P.getName()+" "+P.getLastname()+ " "+P.getDateBirth();
			System.out.println(line);
					

		}
	}
	
}
