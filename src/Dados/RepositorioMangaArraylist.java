package Dados;

import Exceptions.FalhaNoCadastroMangaException;
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
    public void inserir(Manga manga) throws FalhaNoCadastroMangaException {
        colecoesMangas.add(manga);
        	boolean jaExiste = false;
		if(manga.getNome().equals("")||manga.getEditora().equals("")||manga.getIdioma().equals("")||manga.getValor().equals("")) {
			erroNoCadastro(jaExiste,manga.getNome(),manga.getEditora(),manga.getIdioma(),manga.getValor());
		}
    }

    @Override
    public void remover(Manga manga) {
        colecoesMangas.remove(manga);        
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

    private void erroNoCadastro(boolean jaExiste, String nome, String editora, String idioma, String valor) throws FalhaNoCadastroMangaException {
        		FalhaNoCadastroMangaException e;
		e = new FalhaNoCadastroMangaException(jaExiste,nome,editora,idioma,valor);
		throw e;
    }

}
