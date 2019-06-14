package Negocios;

import Dados.ColecaoManga;
import java.io.IOException;
import Dados.RepositorioUsuario;
import Dados.RepositorioUsuarioArray;
import Dados.Usuario;
import Exceptions.FalhaNoCadastroException;
import Exceptions.FalhaNaBuscaException;
import Exceptions.FalhaNaRemocaoException;
import Exceptions.FalhaNaEdicaoException;
import Dados.Manga;
import Dados.RepositorioColecaoManga;
import Dados.RepositorioColecaoMangaArraylist;
import Dados.RepositorioManga;
import Dados.RepositorioMangaArraylist;
import java.util.ArrayList;

/**
 *
 * @author paulo
 */
public class ControleColecoes {

    private RepositorioColecaoManga colecoes = new RepositorioColecaoMangaArraylist();

    public void inserir(ColecaoManga colecao) {
        colecoes.inserir(colecao);
    }

    public void remover(ColecaoManga colecao) {
        colecoes.remover(colecao);
    }

    public ColecaoManga procurar(String nomeColecao) {
        return colecoes.procurar(nomeColecao);
    }

    public RepositorioColecaoManga listar() {
        return colecoes;
    }

}
