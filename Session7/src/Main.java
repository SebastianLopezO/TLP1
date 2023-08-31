import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main{
	public static void main(String args[]) {
		//Interceptar archivo en un canal y hacerle la copia
		
		Read(System.getProperty("user.dir")+"\\src\\data.txt");
		
	}
	
	public static void Read(String RootFile) {
		try {
			FileInputStream File = new FileInputStream(RootFile);
			boolean EndFile = false;
			int cont = 0;
			int[] Outputarg = new int[364217];
			while(!EndFile) {
				int InputByte = File.read();
				if(InputByte == -1) {
					EndFile = true;
				}
				else{
					System.out.println(InputByte);
					Outputarg[cont] = InputByte;
					cont++;
				}
			}
			CopyFile(Outputarg);
			File.close();
		}catch(IOException e) {
			System.out.println("Se ha presentado el error: "+e);
		}
	}
	
	public static void CopyFile(int[] Output) {
		try {
			String rootFile = System.getProperty("user.dir")+"\\src\\data_copy.txt";
			FileOutputStream newFile = new FileOutputStream(rootFile);
			for(int i = 0 ;i < Output.length; i++ ){
				newFile.write(Output[i]);
			}
			newFile.close();
			

			Open(rootFile);
		}catch(IOException e) {
			System.out.println("Se ha presentado el error: "+e);
		}
	}
	
	public static void Open(String rootFile) {
		File file = new File(rootFile);
		try {
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}