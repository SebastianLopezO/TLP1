package servicios;

import javax.ejb.Stateless;

@Stateless
public class SaludoBean implements SaludoBeanRemote {
	public SaludoBean() {
	}

	@Override
	public String saludo(String nombre) {
		return "Hola " + nombre;
	}
}