package Bean;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {
	private int			Id;
	private String		Name;
	private String		Lastname;
	private LocalDate	DateBirth;
	private String		Type;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public LocalDate getDateBirth() {
		return DateBirth;
	}
	public void setDateBirth(LocalDate dateBirth) {
		DateBirth = dateBirth;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	
}
