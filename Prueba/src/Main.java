import javax.naming.InitialContext;
import javax.naming.NamingException;
import Services.SaludoBeanRemote;

public class Main {
	public static void main(String[] args) throws NamingException {
		SaludoBeanRemote saludoBean = (SaludoBeanRemote) InitialContext
				.doLookup("/PruebaEJB/SaludoBean!Services.SaludoBeanRemote");

		System.out.println(saludoBean.saludo("TLPI-2020-02"));
		System.out.println("Excelente!");

	}
}