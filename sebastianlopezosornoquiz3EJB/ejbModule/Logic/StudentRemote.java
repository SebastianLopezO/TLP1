package Logic;

import java.util.ArrayList;

import Bean.Person;
import Bean.PersonRemote;
import jakarta.ejb.Remote;

@Remote
public interface StudentRemote extends PersonRemote {
	public void WriteData(Person Estudiante);

	public ArrayList<Person> ReadData();

	public void Show();
}
