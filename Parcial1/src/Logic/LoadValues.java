package Logic;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.time.LocalDate;
import java.io.IOException;

import Bean.Values;
import Utility.FileManagement;

public class LoadValues extends Values{

	public LoadValues() {}
	
	public LoadValues(Values valores) {
		guardarDatosPlano(valores);
		
	}
	
	private void guardarDatosPlano(Values valores) {
		try 
		{
			FileWriter 		archivo 	= new FileWriter("./datos/datosValores.txt",true);
			BufferedWriter	escribir 	= new BufferedWriter(archivo);
			PrintWriter 	linea 		= new PrintWriter(escribir);
				
			linea.append(valores.getCadena() + "|" + valores.getEntero() + "," + valores.getFecha() +  "=" + valores.getCaracter() +  "!" + + valores.getFlotante() + "\n");
			linea.close();
		}catch(IOException e) {}
	}
	
	private void leerDatosPlano() {
		
	}
	
	public void transformarDatosAleatorio() {
		
		try
        {
            FileReader datosLeidos = new FileReader("./datos/datosValores.txt");
            BufferedReader bufferdatos = new BufferedReader(datosLeidos);

            String linea = "";

            while (linea != null)
            {
                 linea = bufferdatos.readLine();
                 if(linea != null)
                 {       
		                 String restoLinea = "";
		                 int ubicacionCaracter = 0;
		                 
		                 //Primer Valor
		                 ubicacionCaracter = linea.indexOf("|");
		                 super.setCadena(linea.substring(0, ubicacionCaracter));
		                 restoLinea = linea.substring(ubicacionCaracter + 1);
		                 
		               //Segundo Valor
		                 ubicacionCaracter = restoLinea.indexOf(",");
		                 super.setEntero( Integer.valueOf(restoLinea.substring(0,ubicacionCaracter)));
		                 restoLinea = restoLinea.substring(ubicacionCaracter +1);
		                 
		                 
		                 //Tercer Valor
		                 ubicacionCaracter = restoLinea.indexOf("=");
		                 super.setFecha(LocalDate.parse(restoLinea.substring(0,ubicacionCaracter)));
		                 restoLinea = restoLinea.substring(ubicacionCaracter + 1);
		                 
		                 //Cuarto Valor
		                 ubicacionCaracter = restoLinea.indexOf("!");
		                 super.setCaracter(     restoLinea.substring(0,ubicacionCaracter).charAt(0)     );
		                 restoLinea = restoLinea.substring(ubicacionCaracter + 1);
		
		                 //Quinto Valor
		                 super.setFlotante(Float.parseFloat(restoLinea));
		                 
		                 System.out.println("Valor 1: " + super.getCadena() + " " + "Valor 2: " + super.getEntero() + " " + "Valor 3: " + super.getFecha()  + " " + "Valor 4: " + super.getCaracter()  + " " + "Valor 5: " + super.getFlotante());
		                 
		                 guardarDatosAleatorio();
                 }
            }
        }catch(IOException e) {}

		
	}
	
	private void guardarDatosAleatorio() {
		
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
	
	public static void listarDatosAleatorio() {
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
			RandomAccessFile archivo = new RandomAccessFile("./datos/datosValoresAleatorios.txt","r");
			archivo.seek(0);
			while(archivo.getFilePointer() < archivo.length())
			{
				System.out.printf("%8s%26s%35s%30s%26s\n", archivo.readUTF(),archivo.readInt(),archivo.readUTF(),archivo.readChar(),archivo.readFloat());
				System.out.printf("|        |");
			}
			System.out.println("\n|-----------------------------------------------------------------------------------------------------------------------------------------|\n");
		}catch(IOException e) 
		     {System.out.print(e);}	
	}
}
