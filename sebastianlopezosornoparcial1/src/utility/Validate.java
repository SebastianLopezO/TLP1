package utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Validate{

	public Validate() {}
	
	public static int GetNum() {
		int num=0;
		boolean app=true;
        while (app) {
            try {
            	Scanner sc = new Scanner(System.in);
                num = sc.nextInt();
                return num;
            } catch (InputMismatchException ex) {
                System.out.println("No ha insertado un numero, error" + ex);
            }
        }
		return num;
	}
	
	public static Date GetDate(){
		String FechaStr;
		Date Fecha = null;
		boolean app=true;
		SimpleDateFormat Formato = new SimpleDateFormat("dd/mm/yyyy");
        while (app) {
            try {
            	Scanner sc = new Scanner(System.in);
            	FechaStr = sc.next();
        		Fecha = Formato.parse(FechaStr);
                return Fecha;
            } catch (ParseException ex) {
                System.out.println("No ha insertado una fecha correcta, error" + ex);
            }
        }
		return Fecha;
	}
}