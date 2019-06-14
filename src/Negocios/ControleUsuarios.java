package Negocios;

import java.io.IOException;
import Dados.RepositorioUsuario;
import Dados.RepositorioUsuarioArray;
import Dados.Usuario;
import Exceptions.FalhaNoCadastroException;
import Exceptions.FalhaNaBuscaException;
import Exceptions.FalhaNaRemocaoException;
import Exceptions.FalhaNaEdicaoException;

/**
 *
 * @author paulo
 */
public class ControleUsuarios {

    private RepositorioUsuario usuarios = new RepositorioUsuarioArray();

    public void cadastrar(Usuario usuario) throws FalhaNoCadastroException {
        usuarios.inserir(usuario);
    }

    public void remover(String login) throws FalhaNaRemocaoException {
        usuarios.remover(login);
    }

    public Usuario procurar(String login, String senha) throws FalhaNaBuscaException {
        return usuarios.procurar(login, senha);
    }

    public void atualizar(Usuario usuario) throws FalhaNaEdicaoException {
        usuarios.editar(usuario);
    }

    /*public void gravarDados() throws IOException {
		
		Path path = Paths.get("./saves/dados.bin");
		if(!Files.isDirectory(path.getParent())) {
			Files.createDirectory(path.getParent());
		}
		if(!Files.exists(path)) {
			Files.createFile(path);
		}
		
		ObjectOutputStream array = new ObjectOutputStream(Files.newOutputStream(path));
		
		array.writeObject(usuarios);
	}
	
	public void lerDados() throws IOException, ClassNotFoundException {
		Path path = Paths.get("./saves/dados.bin");
		if(!Files.exists(path)) {
			throw new IOException();
		}
		ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path));
		usuarios = (RepositorioUsuarioArray) ois.readObject();
	}*/
}
