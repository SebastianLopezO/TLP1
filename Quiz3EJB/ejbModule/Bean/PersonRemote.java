package Bean;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.ejb.Remote;

@Remote
public interface PersonRemote extends Serializable {
	
	public int getId();
	public void setId(int id);
	public String getName();
	public void setName(String name);
	public String getLastname();
	public void setLastname(String lastname);
	public LocalDate getDateBirth();
	public void setDateBirth(LocalDate dateBirth);
	public String getType();
	public void setType(String type);
}
