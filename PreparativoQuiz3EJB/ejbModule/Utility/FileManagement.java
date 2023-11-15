package Utility;

import java.io.File;

public class FileManagement {
	
	public FileManagement() {}
	
	public static void DeleteFile(String fileName) {
		String root = System.getProperty("user.dir");
		File delFile = new File(root+"//src//Database//"+fileName);	
		if (delFile.exists()) {
			if(delFile.delete()) {
				System.out.println("Se ha eliminado el archivo");
			}else {
				System.out.println("No se ha eliminado el archivo");
			}
		}
	}
	
	public static String Root() {
		return System.getProperty("user.dir")+"EJB//ejbModule//Database//";
	}

}

