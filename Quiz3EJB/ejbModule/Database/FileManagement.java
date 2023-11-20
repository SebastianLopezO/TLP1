package Database;

import java.io.File;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;

/**
 * Session Bean implementation class FileManagment
 */
@Stateless
@LocalBean
public class FileManagement implements FileManagementRemote {
	private String File;
    /**
     * Default constructor. 
     */
    public FileManagement(String File) {
    	this.File = File;
        // TODO Auto-generated constructor stub
    }
    
	
	public void DeleteFile() {
		String root = System.getProperty("user.dir");
		File delFile = new File(root+"EJB//ejbModule//Database//"+this.File);	
		if (delFile.exists()) {
			if(delFile.delete()) {
				System.out.println("Se ha eliminado el archivo");
			}else {
				System.out.println("No se ha eliminado el archivo");
			}
		}
	}
	
	public String Root() {
		return System.getProperty("user.dir")+"EJB//ejbModule//Database//";
	}
}
