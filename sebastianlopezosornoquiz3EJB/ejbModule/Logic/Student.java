package Logic;

import java.io.EOFException;
import java.io.File;
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
import Utility.Clr;
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
		if (ListPersons == null) {
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
		FileManagement.DeleteFile("DataSerialized.txt");
		try {
			FileOutputStream FilePath = new FileOutputStream(FileManagement.Root() + "DataSerialized.txt", true);
			ObjectOutputStream FileOutput = new ObjectOutputStream(FilePath);
			FileOutput.writeObject(Persons);
			FilePath.close();
			FileOutput.close();
			System.out.println("Se ha creado el archivo");
		} catch (FileNotFoundException ex) {
			System.out.println("Se ha generado un error FileNotFoundException al Escribir en el archivo: " + ex.getMessage());
		} catch (EOFException ex) {
			System.out.println("Se ha generado un error EOFException al Escribir en el archivo: " + ex.getMessage());
		} catch (IOException ex) {
			System.out.println("Se ha generado un error IOException al Escribir en el archivo: " + ex.getMessage());
		}
	}

	
	public ArrayList<Person> ReadData() {
		ArrayList<Person> data = null;
		
		try {
			FileInputStream FilePath = new FileInputStream(FileManagement.Root() + "DataSerialized.txt");
			ObjectInputStream ObjInpt = new ObjectInputStream(FilePath);
			Person[] DataRead = (Person[]) ObjInpt.readObject();
			ObjInpt.close();
			FilePath.close();
			if(DataRead.length!=0) {
				data = new ArrayList<Person>();
				for(int i=0; i < DataRead.length;i++){ data.add(DataRead[i]) ; }
			}
			return data;
		} catch (FileNotFoundException ex) {
			System.out
					.println("Se ha generado un error FileNotFoundException al Leer el archivo: " + ex.getMessage());
		} catch (EOFException ex) {
			System.out.println("Se ha generado un error EOFException al Leer el archivo: " + ex.getMessage());
		} catch (ClassNotFoundException | IOException ex) {
			System.out.println("Se ha generado un error ClassNotFoundException o IOException  al Leer el archivo: "+ ex.getMessage());
		}
		return data;
	}

	public void Show() {
		System.out.println("");
		System.out.println(Clr.BG_BL+"¯".repeat(121));
		System.out.printf("%-1s%-54s%-11s%-54s%-1s\n","|", "", "Estudiantes", "","|");
		System.out.println("-".repeat(121));
		System.out.printf("%-10s%-20s%-10s%-20s%-10s%-20s%-10s%-20s%-1s\n","|","Id","|","Name","|","LastName","|","Date Birth","|");
		System.out.println("-".repeat(121));
		ArrayList<Person> data = this.ReadData();
		if(data==null) {
			data = new ArrayList<Person>();
		}
		boolean color=true;
		for (Person P : data) {
			if(color) { System.out.print(Clr.RT); color=false; }else { System.out.print(Clr.BG_BL); color=true;}
			System.out.printf("%-10s","|");
			System.out.printf("%-20s",P.getId());
			System.out.printf("%-10s","|");
			System.out.printf("%-20s",P.getName());
			System.out.printf("%-10s","|");
			System.out.printf("%-20s",P.getLastname());
			System.out.printf("%-10s","|");
			System.out.printf("%-20s",P.getDateBirth());
			System.out.printf("%-1s","|");
			System.out.print(Clr.RT+"\n");
		}
		System.out.println("¯".repeat(121)+Clr.RT);
		System.out.println();
	}
	
	public void Truncate(){
		System.out.println("Se ha eliminado los siguientes registros: ");
		this.Show();
		FileManagement.DeleteFile("DataSerialized.txt");
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
