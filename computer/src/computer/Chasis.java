package computer;
public class Chasis{
	private int largoPlaca;
	private int anchoPlaca;
	private int ranuras;
	private boolean adminCables;
	private int ancho;
	private int alto;
	private int profundidad;
	
	//Default Constructor
	public Chasis() {
		this.largoPlaca = 0;
		this.anchoPlaca = 0;
		this.ranuras = 0;
		this.adminCables = false;
		this.ancho = 0;
		this.alto = 0;
		this.profundidad = 0;
	}

	//customized Constructor
	public Chasis(int largoPlaca, int anchoPlaca, int ranuras, boolean adminCables, int ancho, int alto,
			int profundidad) {
		this.largoPlaca = largoPlaca;
		this.anchoPlaca = anchoPlaca;
		this.ranuras = ranuras;
		this.adminCables = adminCables;
		this.ancho = ancho;
		this.alto = alto;
		this.profundidad = profundidad;
	}

	public int getLargoPlaca() {
		return largoPlaca;
	}

	public void setLargoPlaca(int largoPlaca) {
		this.largoPlaca = largoPlaca;
	}

	public int getAnchoPlaca() {
		return anchoPlaca;
	}

	public void setAnchoPlaca(int anchoPlaca) {
		this.anchoPlaca = anchoPlaca;
	}

	public int getRanuras() {
		return ranuras;
	}

	public void setRanuras(int ranuras) {
		this.ranuras = ranuras;
	}

	public boolean isAdminCables() {
		return adminCables;
	}

	public void setAdminCables(boolean adminCables) {
		this.adminCables = adminCables;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(int profundidad) {
		this.profundidad = profundidad;
	}
	
	
	
}