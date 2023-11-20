package Database;

import jakarta.ejb.Remote;

@Remote
public interface FileManagementRemote {
	public void DeleteFile();
	public String Root();
}
