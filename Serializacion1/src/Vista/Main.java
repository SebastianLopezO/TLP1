package Vista;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main{
	public static void main(String args[]){
		String root = System.getProperty("user.dir");
		try {
			FileInputStream pathFile = new FileInputStream(root+"//src//DB//Datos.txt");
			ObjectInputStream readData = new ObjectInputStream(pathFile);
			
			String[] data = (String[]) readData.readObject();
		}catch(IOException ex){
			System.out.println("No se ha podido leer los datos "+ex);
		}
	}
}
