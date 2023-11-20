package Bean;

import java.time.LocalDate;

import jakarta.ejb.Stateless;

/**
 * Session Bean implementation class Person
 */
@Stateless
public class Person implements PersonRemote {

	private int Id;
	private String Name;
	private String Lastname;
	private LocalDate DateBirth;
	private String Type;

	/**
	 * Default constructor.
	 */
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		// TODO Auto-generated method stub
		return Id;
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.Id = id;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return Name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.Name = name;
	}

	@Override
	public String getLastname() {
		// TODO Auto-generated method stub
		return Lastname;
	}

	@Override
	public void setLastname(String lastname) {
		// TODO Auto-generated method stub
		this.Lastname = lastname;
	}

	@Override
	public LocalDate getDateBirth() {
		// TODO Auto-generated method stub
		return DateBirth;
	}

	@Override
	public void setDateBirth(LocalDate dateBirth) {
		// TODO Auto-generated method stub
		this.DateBirth=dateBirth;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return Type;
	}

	@Override
	public void setType(String type) {
		// TODO Auto-generated method stub
		this.Type=type;
	}

}
