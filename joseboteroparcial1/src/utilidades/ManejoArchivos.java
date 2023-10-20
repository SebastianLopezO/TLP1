package utilidades;

import java.io.File;

public class ManejoArchivos {
	
	public ManejoArchivos() {}
	
	public static void EliminarArchivos(String nombreArchivo) {
		
		File archivoBorrar = new File(nombreArchivo);	
		if (archivoBorrar.exists()) {
			archivoBorrar.delete();
		}
	}

}
