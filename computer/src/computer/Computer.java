package computer;
public class Computer{
	private String Name;
	private Chasis Gabinete;
	private Board Placa;
	
	public Computer() {
		this.Name = "";
		this.Gabinete = null;
		this.Placa = null;
	}
	
	public Computer(String name) {
		this.Name = name;
		this.Gabinete = null;
		this.Placa = null;
	}
	
	
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Chasis getGabinete() {
		return Gabinete;
	}

	public void setGabinete(Chasis gabinete) {
		Gabinete = gabinete;
	}

	public Board getPlaca() {
		return Placa;
	}

	public void setPlaca(Board placa) {
		Placa = placa;
	}

	public void Show() {
		
	}
}