package Vista;

import java.util.Scanner;

import logica.LValores;
import utilidades.ManejoArchivos;

public class VMenu {

	public VMenu() 
	{
		
		Scanner captura = new Scanner(System.in);
		int     opcPrincipal = -1;
		do {
			System.out.println("---------------------------------------");
			System.out.println("              Menú Principal           ");
			System.out.println("---------------------------------------");
			System.out.println("|          1. Captura Valores         |");
			System.out.println("|          2. Transformar Valores     |");			
			System.out.println("|          3. Listar                  |");
			System.out.println("|          0. Salir                   |");
			System.out.println("---------------------------------------");	
			System.out.println("Seleccione Opción:                 ");
			opcPrincipal = captura.nextInt();
			switch (opcPrincipal)
			{
				case 1 :
					ManejoArchivos.EliminarArchivos("./datos/datosValores.txt");
					VPedirValores pedirValores = new VPedirValores();
					break;
				case 2 :
					ManejoArchivos.EliminarArchivos("./datos/datosValoresAleatorios.txt");
					LValores lValores = new LValores();
					lValores.transformarDatosAleatorio();
					break;				
				case 3 :
					LValores.listarDatosAleatorio();
					break;		
				case 0 :
					System.out.println("Lo esperamos.");
					break;
				default :
					System.out.println("Debe Seleccionar una opción valida.");
					break;
			}
		}while(opcPrincipal != 0);
	}
}
