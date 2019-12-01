package Negocios;

import Dados.ColecaoManga;
import java.io.IOException;
import Dados.Usuario;
import Dados.Manga;
import Dados.RepositorioManga;
import Exceptions.FalhaNoCadastroException;
import Exceptions.FalhaNaBuscaException;
import Exceptions.FalhaNaRemocaoException;
import Exceptions.FalhaNaEdicaoException;
import Exceptions.FalhaNoCadastroColecaoException;
import Exceptions.FalhaNoCadastroMangaException;

/**
 *
 * @author paulo
 */
public class FachadaUsuario {

    private ControleUsuarios usuario;
    private ControleMangas mangas;
    private ControleColecoes colecoes;
    private static FachadaUsuario instance;

    public FachadaUsuario() {
        usuario = new ControleUsuarios();
        mangas = new ControleMangas();
        colecoes = new ControleColecoes();
    }

    public static FachadaUsuario getInstance() {
        if (FachadaUsuario.instance == null) {
            FachadaUsuario.instance = new FachadaUsuario();
        }
        return FachadaUsuario.instance;
    }

    public void cadastrar(Usuario usuario) throws FalhaNoCadastroException {
        this.usuario.cadastrar(usuario);
    }

    public void cadastrar(Manga manga) throws FalhaNoCadastroMangaException {
        this.mangas.cadastrar(manga);
    }

    public void cadastrar(ColecaoManga colecao) throws FalhaNoCadastroColecaoException{
        this.colecoes.cadastrar(colecao);
    }

    public void remover(String login) throws FalhaNaRemocaoException {
        usuario.remover(login);
    }

    public void remover(Manga manga) {
        mangas.remover(manga);
    }

    public void remover(ColecaoManga colecao) {
        colecoes.remover(colecao);
    }

    public Usuario procurar(String login, String senha) throws FalhaNaBuscaException {
        return usuario.procurar(login, senha);
    }

    public Manga procurar(String nome) {
        return mangas.procurar(nome);
    }

    /*public ColecaoManga procurar(String nomeColecao) {
        return colecoes.procurar(nomeColecao);
    }*/
    
    public void atualizar(Usuario usuario) throws FalhaNaEdicaoException {
        this.usuario.atualizar(usuario);
    }

    public ControleMangas listar() {
        return mangas;
    }

    /*public ControleColecoes listar() {
        return colecoes;
    }*/

 /*public void salvar() throws IOException {
		this.usuario.gravarDados();
	}
	
	public void ler() throws IOException, ClassNotFoundException{
		this.usuario.lerDados();
	}*/
}
