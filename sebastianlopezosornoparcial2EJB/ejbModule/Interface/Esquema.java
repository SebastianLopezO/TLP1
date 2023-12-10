package Interface;

import java.util.ArrayList;

public interface Esquema <e, t> {
	public e Buscar(ArrayList<e> Object, t bus);
	public ArrayList<e> Eliminar(ArrayList<e> Collection, t bus);
	public ArrayList<e> Reemplazar(ArrayList<e> Collection, e Object2, t bus);
	public void Mostrar(ArrayList<e> Collection);
}
