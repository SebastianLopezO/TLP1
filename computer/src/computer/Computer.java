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
	
	public void Show() {
		
	}
}