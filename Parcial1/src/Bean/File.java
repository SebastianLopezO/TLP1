package Bean;

import java.util.ArrayList;

public abstract class File {
	
	public String Name;
	public String Path;
	
	public void WriteData(Values valores) {}
	public ArrayList<String[]> ReadData() { return new ArrayList<String[]>(); };
	public void DelData() {};
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPath() {
		return Path;
	}
	public void setPath(String path) {
		String root = System.getProperty("user.dir");
		Path = root+"//src//Database//"+path;
	}
	
	
}
