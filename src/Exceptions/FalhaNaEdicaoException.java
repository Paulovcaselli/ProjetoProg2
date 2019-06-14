package Exceptions;

/**
 *
 * @author paulo
 */
public class FalhaNaEdicaoException extends Exception{
    
    	String login;
	
	public FalhaNaEdicaoException(String login) {
		super("Falha na atualização");
		this.login = login;
	}

	public String getLogin() {
		return login;
	}
	
}
