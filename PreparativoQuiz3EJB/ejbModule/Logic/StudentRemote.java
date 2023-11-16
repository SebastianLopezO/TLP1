package Logic;

import java.util.ArrayList;

import Bean.Person;
import Bean.PersonRemote;
import jakarta.ejb.Remote;

@Remote
public interface StudentRemote extends PersonRemote {
	public void WriteData(ArrayList<Person> Estudiantes);

	public ArrayList<Person> ReadData();

	public void Show(ArrayList<Person> data);
}
