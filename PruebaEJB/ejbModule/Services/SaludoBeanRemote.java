package Services;

import jakarta.ejb.Remote;

@Remote
public interface SaludoBeanRemote {
	public abstract String saludo(String nombre);
}
