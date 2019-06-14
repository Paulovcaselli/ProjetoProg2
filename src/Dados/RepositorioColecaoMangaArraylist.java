package Dados;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author paulo
 */
public class RepositorioColecaoMangaArraylist implements RepositorioColecaoManga {

    ArrayList<ColecaoManga> colecoes = new ArrayList();

    public void inserir(ColecaoManga colecao) {
        colecoes.add(colecao);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(ColecaoManga colecao) {
        colecoes.remove(colecao);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ColecaoManga procurar(String colecao) {
        for (int i = 0; i < colecoes.size(); i++) {
            if (colecoes.get(i).getNomeColecao().equals(colecao)) {
                return colecoes.get(i);
            }
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList listar() {
        return colecoes;

    }

}
