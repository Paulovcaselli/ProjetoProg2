package Dados;
import java.io.Serializable;
import Exceptions.FalhaNoCadastroException;
import Exceptions.FalhaNaBuscaException;
import Exceptions.FalhaNaRemocaoException;
import Exceptions.FalhaNaEdicaoException;

/**
 *
 * @author paulo
 */
public interface RepositorioUsuario {
    
    public void inserir(Usuario usuario) throws FalhaNoCadastroException;
    public void editar(Usuario usuario) throws FalhaNaEdicaoException;
    public Usuario procurar(String login, String senha)  throws FalhaNaBuscaException;
    public void remover(String login) throws FalhaNaRemocaoException;
	
}

    

