import java.io.FileReader;

class Main {
	public static void main (String[] args) {
		String dir = System.getProperty("user.dir")+"\\src\\";
		try {
			FileReader File = new FileReader(dir+"Datos.txt");
			
			int c=0;
			String line ="";
			while(c!=-1) {
				c = File.read();
				
				if(c==10) {
					String[] data = line.split(",");
					if(data[0].equals("1020")) {
						System.out.print("El usuario es "+data[1]);
					}
					line=""; 
				}else {
					line+=((char)c);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.print("No encontro el archivo en: "+dir+"Datos.txt");
		}
		
	}
}
