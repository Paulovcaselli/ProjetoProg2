package Negocios;

import java.io.IOException;
import Dados.RepositorioUsuario;
import Dados.RepositorioUsuarioArray;
import Dados.Usuario;
import Exceptions.FalhaNoCadastroException;
import Exceptions.FalhaNaBuscaException;
import Exceptions.FalhaNaRemocaoException;
import Exceptions.FalhaNaEdicaoException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
    public void gravarDados() throws IOException {

        Usuario usuario = new Usuario();
        File f = new File("Usuarios.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(usuario);
        oos.close();
    }

    public void lerDados() throws IOException, ClassNotFoundException {

        File f = new File("Usuarios.txt");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        Usuario clone = (Usuario) o;
    }

}
