package Exceptions;

/**
 *
 * @author paulo
 */
public class FalhaNaRemocaoException extends Exception{
    
    	private String login;
	
	public FalhaNaRemocaoException(String login) {
		super("Falha na remoção");
		this.login = login;
	}
	
	public String getLogin() {
		return login;
	}
	
}
