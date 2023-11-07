package Vista;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main{
	public static void main(String args[]){
		String root = System.getProperty("user.dir");
		String[] data = {};
		try {
			FileInputStream pathFile = new FileInputStream(root+"//src//DB//Datos.txt");
			ObjectInputStream readData = new ObjectInputStream(pathFile);
			
			 try {
				data= (String[]) readData.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}catch(IOException ex){
			System.out.println("No se ha podido leer los datos "+ex);
		}
	}
}
