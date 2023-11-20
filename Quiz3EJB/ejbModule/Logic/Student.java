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
import Database.FileManagement;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;

/**
 * Session Bean implementation class Student
 */
@Stateless
@LocalBean
public class Student implements StudentRemote {

	/**
	 * Default constructor.
	 */
	public Student() {

	}

	public Student(Person Estudiante) {

	}

	public void WriteData(Person Estudiante) {
		ArrayList<Person> ListPersons = this.ReadData();
		if(ListPersons==null) {
			ListPersons = new ArrayList<Person>();
		}
		ListPersons.add(Estudiante);
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
			FileOutputStream FilePath = new FileOutputStream(new FileManagement("").Root() + "DataSerialized.txt", true);
			ObjectOutputStream FileOutput = new ObjectOutputStream(FilePath);
			FileOutput.writeObject(Persons);
			FilePath.close();
			FileOutput.close();
		} catch (FileNotFoundException ex) {
			System.out
					.println("Se ha generado un error FileNotFoundException al acceder al archivo: " + ex.getMessage());
		} catch (EOFException ex) {
			System.out.println("Se ha generado un error EOFException al acceder al archivo: " + ex.getMessage());
		} catch (IOException ex) {
			System.out.println("Se ha generado un error IOException al acceder al archivo: " + ex.getMessage());
		}
	}

	public ArrayList<Person> ReadData() {
		ArrayList<Person> data = null;
		try {
			FileInputStream FilePath = new FileInputStream(new FileManagement("").Root() + "DataSerialized.txt");
			ObjectInputStream ObjInpt = new ObjectInputStream(FilePath);
			data = (ArrayList<Person>) ObjInpt.readObject();
			ObjInpt.close();
			FilePath.close();
			return data;
		} catch (FileNotFoundException ex) {
			System.out
					.println("Se ha generado un error FileNotFoundException al acceder al archivo: " + ex.getMessage());
		} catch (EOFException ex) {
			System.out.println("Se ha generado un error EOFException al acceder al archivo: " + ex.getMessage());
		} catch (ClassNotFoundException | IOException ex) {
			System.out.println("Se ha generado un error ClassNotFoundException o IOException  al acceder al archivo: " + ex.getMessage());
		}

		return data;
	}

	public void Show(ArrayList<Person> data) {
		for (Person P : data) {
			String line = P.getId() + " - " + P.getName() + " " + P.getLastname() + " " + P.getDateBirth();
			System.out.println(line);
		}
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getLastname() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLastname(String lastname) {
		// TODO Auto-generated method stub

	}

	@Override
	public LocalDate getDateBirth() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDateBirth(LocalDate dateBirth) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setType(String type) {
		// TODO Auto-generated method stub

	}

}
