package Dados;

import java.util.ArrayList;

/**
 *
 * @author paulo
 */
public class RepositorioMangaArraylist implements RepositorioManga {

    ArrayList<Manga> colecoesMangas;

    public RepositorioMangaArraylist() {
        colecoesMangas = new ArrayList();
    }

    @Override
    public void inserir(Manga manga) {
        colecoesMangas.add(manga);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Manga manga) {
        colecoesMangas.remove(manga);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Manga procurar(String nome) {
        for (int i = 0; i < colecoesMangas.size(); i++) {
            if (colecoesMangas.get(i).getNome().equals(nome)) {
                return colecoesMangas.get(i);
            }
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList listar() {
        return colecoesMangas;

    }

}
