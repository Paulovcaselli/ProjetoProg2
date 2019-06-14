package Negocios;
import java.io.IOException;

/**
 *
 * @author paulo
 */
public class Fachada {
    
	private static Fachada instance;

	public Fachada() {

	}

	public static Fachada getInstance() {
		if (Fachada.instance == null) {
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
	}
}
