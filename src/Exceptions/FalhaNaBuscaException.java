package Exceptions;
import javax.swing.JOptionPane;
/**
 *
 * @author paulo
 */
public class FalhaNaBuscaException extends Exception{
    
    	private String login;
	
	public FalhaNaBuscaException(String login, String senha, boolean jaExiste) {
		super("Falha na busca");
		if(login.equals("")||login.contains(" ")) {
			JOptionPane.showMessageDialog(null, "Login inválido");
		}
		else if(senha.equals("")) {
			JOptionPane.showMessageDialog(null, "Senha inválida");
		}
		else if(jaExiste == false) {
			JOptionPane.showMessageDialog(null, "Usuário não existe ou senha incorreta");
		}
	}
}

