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

public class ControlValues extends Values{
	
	public FileRandom filerandom;
	public FileSequential filesequential;

	public ControlValues() {}
	
	public ControlValues(Values valores) {
		filesequential.setPath("sequentialFlat.txt");
		filerandom.setPath("randomFlat.txt");
		filesequential.WriteData(valores);
		
	}
	
	private void guardarDatosPlano(Values valores) {
		filesequential.WriteData(valores);
	}
	
	private void leerDatosPlano() {
		filesequential.ReadData();
	}
	
	public void transformarDatosAleatorio() {
		
		try
        {
            FileReader datosLeidos = new FileReader(filesequential.getPath());
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
		                 filerandom.WriteData(this);
                 }
            }
        }catch(IOException e) {}

		
	}
	
	
	public void listarDatosAleatorio() {
		filerandom.Show();
	}
}
