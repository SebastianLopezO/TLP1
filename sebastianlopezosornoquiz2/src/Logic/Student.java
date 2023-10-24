package Logic;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
		for(int i=0; i < ListPersons.size(); i++)
		{

			Persons[i] = new Person();
			Persons[i].setId(ListPersons.get(i).getId());
			Persons[i].setName(ListPersons.get(i).getName());
			Persons[i].setLastname(ListPersons.get(i).getLastname());
			Persons[i].setDateBirth(ListPersons.get(i).getDateBirth());
			Persons[i].setType(ListPersons.get(i).getType());

		}
		try
		{
			FileOutputStream FilePath = new FileOutputStream(FileManagement.Root()+"DataSerialized.txt",true);
			ObjectOutputStream FileOutput = new ObjectOutputStream(FilePath);
			FileOutput.writeObject(Persons);
			FileOutput.close();
		}catch(Exception e)
		{

		System.out.println("Se ha generado un error al acceder al archivo:" + e);

		}
	}

	public void ReadData() {
		try
		{
			FileInputStream FilePath = new FileInputStream(FileManagement.Root()+"DataSerialized.txt");
			ObjectInputStream ObjInpt = new ObjectInputStream(FilePath);
			Person[] DataRead = (Person[]) ObjInpt.readObject();
			ObjInpt.close();
			String line = "";
			ArrayList<Person> data = new ArrayList<Person>();
			for(int i=0; i < DataRead.length;i++)
			{
	
			data.add(DataRead[i]) ;
			
			}
			this.Show(data);
		}catch(Exception e) {
			System.out.println("Se ha generado un error al acceder al archivo: "+e);
		}
	}
	
	public void Show(ArrayList<Person> data) {
		for(Person P: data)
		{
			String line = P.getId() + " - " + P.getName()+" "+P.getLastname()+ " "+P.getDateBirth();
			System.out.println(line);
					

		}
	}
	
}
