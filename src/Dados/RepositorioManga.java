package Dados;

import Exceptions.FalhaNoCadastroMangaException;
import java.util.ArrayList;

/**
 *
 * @author paulo
 */
public interface RepositorioManga {
    
    public void inserir (Manga manga) throws FalhaNoCadastroMangaException;
    public void remover (Manga manga);
    public Manga procurar (String manga);
    public ArrayList listar();
    
}
