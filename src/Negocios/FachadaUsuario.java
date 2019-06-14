package Negocios;
import java.io.IOException;
import Dados.Usuario;
import Exceptions.FalhaNoCadastroException;
import Exceptions.FalhaNaBuscaException;
import Exceptions.FalhaNaRemocaoException;
import Exceptions.FalhaNaEdicaoException;

/**
 *
 * @author paulo
 */
public class FachadaUsuario {
    
    	private ControleUsuarios usuario;
	private static FachadaUsuario instance;
	
	
	public FachadaUsuario() {
		usuario = new ControleUsuarios();
	}
	
	public static FachadaUsuario getInstance(){
		if (FachadaUsuario.instance == null){
			FachadaUsuario.instance = new FachadaUsuario();
		}
		return FachadaUsuario.instance;
	}
	
	public void cadastrar(Usuario usuario) throws FalhaNoCadastroException {
		this.usuario.cadastrar(usuario);
	}
	
	public void remover(String login) throws FalhaNaRemocaoException {
		usuario.remover(login);
	}
	
	public Usuario procurar(String login, String senha)  throws FalhaNaBuscaException{
		return usuario.procurar(login,senha);
	}
	
	public void atualizar (Usuario usuario) throws FalhaNaEdicaoException {
		this.usuario.atualizar(usuario);
	}
	
	/*public void salvar() throws IOException {
		this.usuario.gravarDados();
	}
	
	public void ler() throws IOException, ClassNotFoundException{
		this.usuario.lerDados();
	}*/
}

