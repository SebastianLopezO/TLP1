package Logic;

import java.io.IOException;
import java.io.RandomAccessFile;

import Bean.File;

public class FileRandom implements File {

	@Override
	public void WriteData() {
		try
		{
			RandomAccessFile archivo = new RandomAccessFile("./datos/datosValoresAleatorios.txt","rw");
			archivo.seek(archivo.length());
			
			archivo.writeUTF(super.getCadena());
			archivo.writeInt(super.getEntero());
			archivo.writeUTF(String.valueOf(super.getFecha()));
			archivo.writeChar(super.getCaracter());
			archivo.writeFloat(super.getFlotante());			
			
			archivo.close();
		}catch(IOException e) {System.out.print(e);	}
		
	}

	@Override
	public void ReadData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DelData() {
		// TODO Auto-generated method stub
		
	}

}
