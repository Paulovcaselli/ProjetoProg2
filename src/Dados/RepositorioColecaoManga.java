package Dados;
import Exceptions.FalhaNoCadastroColecaoException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author paulo
 */
public interface RepositorioColecaoManga {
    
    public void inserir (ColecaoManga colecao) throws FalhaNoCadastroColecaoException;
    public void remover (ColecaoManga colecao);
    public ColecaoManga procurar (String colecao);
    public ArrayList listar();
            
}
