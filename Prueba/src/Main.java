import javax.naming.InitialContext;
import javax.naming.NamingException;
import Services.SaludoBeanRemote;

public class Main {
	public static void main(String[] args){
		SaludoBeanRemote saludoBean;
		try {
			saludoBean = (SaludoBeanRemote) InitialContext
					.doLookup("/PruebaEJB/SaludoBean!Services.SaludoBeanRemote");
			System.out.println(saludoBean.saludo("TLPI-2020-02"));
			System.out.println("Excelente!");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}
}