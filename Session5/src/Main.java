//Caculadora que capture dos valores y almacene los operadores y su resultado

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		boolean app = true;
		String option;

		do {
			option = Menu();
			
			switch (option) {
				case "Ejecutar Operaciones":
					Start();
					break;
				case "Historial Operaciones":
					Read();
					break;
				case "Eliminar Operaciones":
					Del();
					break;
				case "Salir":
						app = false;
					break;
			}
		
		}while(app);
	}
	
	

    public static String Menu() {
        String[] Options = {"Ejecutar Operaciones",
                "Historial Operaciones",
                "Eliminar Operaciones",
                "Salir"
        };
        String Option = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una Opcion: ",
                "Calculadora",
                JOptionPane.QUESTION_MESSAGE,
                null,
                Options,
                Options[0]);
        return Option;
    }
    
    public static void Start() {
    	int num1 = GetNum();
    	int num2 = GetNum();
    	int res = num1+num2;
    	JOptionPane.showMessageDialog(null, num1+" + "+num2+" = "+res);
    	//Guardar en archivo plano
    	Save(num1,num2,res);
    }
    
    public static void Save(int num1, int num2, int res) {
    	String root = System.getProperty("user.dir")+"\\src\\";
    	try {
    		FileWriter file = new FileWriter(root+"Datos.txt", true);
    		
    		file.write(num1+","+num2+","+res+"\n");
    		file.close();
    	}catch(Exception e){
    		e.printStackTrace();
			System.out.print("No encontro el archivo en: "+root+"Datos.txt");
    	}
    }
    
    public static void Del() {
    	String root = System.getProperty("user.dir")+"\\src\\";
    	try {
    		FileWriter file = new FileWriter(root+"Datos.txt");
    		
    		file.write("");
    		file.close();
    	}catch(Exception e){
    		e.printStackTrace();
			System.out.print("No encontro el archivo en: "+root+"Datos.txt");
    	}
    }
    
    public static void Read() {
    	String root = System.getProperty("user.dir")+"\\src\\";
    	ArrayList<String> values = new ArrayList<String>(); 
    	try {
    		FileReader file = new FileReader(root+"Datos.txt");
    	
    		
    		int c = 0;
    		
    		String line="";
    		
    		
    		while (c!=-1){
    			c = file.read();
    			
    			if(c==10) {
    				values.add(line);
    				
    				line="";
    			}else {
    				line +=((char)c);
    			}
    		}
    		
    		file.close();
    		Show(values);
    	}catch(Exception e){
    		e.printStackTrace();
			System.out.print("No encontro el archivo en: "+root+"Datos.txt");
    	}
    	
    	
    }
    
    public static void Show(ArrayList<String> values) {
  
    	for(String val: values){
    		String[] vals = val.split(",");
    		if(vals.length == 3) {
    			System.out.println(vals[0]+" + "+vals[1]+" = "+vals[2]);
    		}
    	}
    }
    
    
    public static int GetNum() {
        int num;
        while (true) {
            try {
                num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero a Operar "+ ": "));
                return num;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "No se ha insertado un numero.");
                System.out.println("No ha insertado un numero, error" + ex);
            }
        }
    }
}


