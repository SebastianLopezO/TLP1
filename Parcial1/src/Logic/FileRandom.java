package Logic;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

import Bean.File;
import Bean.Values;

public class FileRandom extends File {
	
	public FileRandom() {
		
	}

	public void WriteData(Values valores) {
		try
		{
			RandomAccessFile file = new RandomAccessFile("./datos/datosValoresAleatorios.txt","rw");
			file.seek(file.length());
			
			file.writeUTF(valores.getCadena());
			file.writeInt(valores.getEntero());
			file.writeUTF(String.valueOf(valores.getFecha()));
			file.writeChar(valores.getCaracter());
			file.writeFloat(valores.getFlotante());			
			
			file.close();
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
	
	public void Show() {
			System.out.printf("|-----------------------------------------------------------------------------------------------------------------------------------------|\n");
			System.out.printf("|%8s", "");
			System.out.printf("|%10s", "Valor 1");
			System.out.printf("%8s", "|");		
			System.out.printf("%17s", "Valor 2");
			System.out.printf("%8s", "|");
			System.out.printf("%30s", "Valor 3");
			System.out.printf("%8s", "|");
			System.out.printf("%35s", "Valor 4");
			System.out.printf("%8s", "|");
			System.out.printf("%25s\n", "Valor 5");
			System.out.printf("|%8s", "");
			System.out.printf("|--------------------------------------------------------------------------------------------------------------------------------|\n");		
			System.out.printf("|Registro|");
			try
			{
				RandomAccessFile file = new RandomAccessFile(this.getPath(),"r");
				file.seek(0);
				while(file.getFilePointer() < file.length())
				{
					System.out.printf("%8s%26s%35s%30s%26s\n", file.readUTF(),file.readInt(),file.readUTF(),file.readChar(),file.readFloat());
					System.out.printf("|        |");
				}
				file.close();
				System.out.println("\n|-----------------------------------------------------------------------------------------------------------------------------------------|\n");
			}catch(IOException e) 
			     {System.out.print(e);}	
	}

}
