package Negocios;

import java.io.IOException;
import Dados.RepositorioUsuario;
import Dados.RepositorioUsuarioArray;
import Dados.Usuario;
import Exceptions.FalhaNoCadastroException;
import Exceptions.FalhaNaBuscaException;
import Exceptions.FalhaNaRemocaoException;
import Exceptions.FalhaNaEdicaoException;
import Dados.Manga;
import Dados.RepositorioManga;
import Dados.RepositorioMangaArraylist;
import Exceptions.FalhaNoCadastroMangaException;
import java.util.ArrayList;

/**
 *
 * @author paulo
 */
public class ControleMangas {

    private RepositorioManga mangas = new RepositorioMangaArraylist();

    public void cadastrar(Manga manga) throws FalhaNoCadastroMangaException {
        mangas.inserir(manga);
    }

    public void remover(Manga manga) {
        mangas.remover(manga);
    }

    public Manga procurar(String nome) {
        return mangas.procurar(nome);
    }

    public RepositorioManga listar() {
        return mangas;
    }

}
