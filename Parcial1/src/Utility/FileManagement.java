package Utility;

import java.io.File;

public class FileManagement {
	
	public FileManagement() {}
	
	public static void DeleteFile(String fileName) {
		
		File delFile = new File(fileName);	
		if (delFile.exists()) {
			delFile.delete();
		}
	}

}
