package servicios;

import javax.ejb.Remote;

@Remote
public interface SaludoBeanRemote {

	public abstract String saludo(String nombre);

}