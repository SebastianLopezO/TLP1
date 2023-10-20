package Logic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import Bean.File;
import Bean.Values;

public class FileSequential extends File{

	public void WriteData(Values valores) {
		try 
		{
			FileWriter 		file 	= new FileWriter("./datos/datosValores.txt",true);
			BufferedWriter	Bw 	= new BufferedWriter(file);
			PrintWriter 	line 		= new PrintWriter(Bw);
				
			line.append(valores.getCadena() + "|" + valores.getEntero() + "," + valores.getFecha() +  "=" + valores.getCaracter() +  "!" + + valores.getFlotante() + "\n");
			line.close();
		}catch(IOException e) {
			System.out.print("Se ha generado un error: "+e);
		}
		
	}

	public ArrayList<String[]> ReadData() {
		return new ArrayList<String[]>();
		// TODO Auto-generated method stub
		
	}

	public void DelData() {
		// TODO Auto-generated method stub
		
	}

}
