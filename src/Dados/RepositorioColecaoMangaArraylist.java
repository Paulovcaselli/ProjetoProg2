package Dados;

import Exceptions.FalhaNoCadastroColecaoException;
import Exceptions.FalhaNoCadastroMangaException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author paulo
 */
public class RepositorioColecaoMangaArraylist implements RepositorioColecaoManga {

    ArrayList<ColecaoManga> colecoes = new ArrayList();

    //@Override
    public void inserir(ColecaoManga colecao) throws FalhaNoCadastroColecaoException {
        boolean jaExiste = false;
        if ( colecao == null || 
        		colecao.getNomeColecao().equals("") || colecao.getNumVolume().equals("") || 
        		"".equals(colecao.getValorUnit())) {
        	if (colecao != null)
        		erroNoCadastro(jaExiste, colecao.getNomeColecao(), colecao.getNumVolume(), colecao.getValorUnit());
        	else
        		colecao = null;// tratamento para null
        }
        for (int i = 0; i < colecoes.size(); i++) {
            if (colecoes.get(i) != null && colecoes.get(i).getNomeColecao().equals(colecao.getNomeColecao())) {
                jaExiste = true;
                erroNoCadastro(jaExiste, colecoes.get(i).getNomeColecao(), colecoes.get(i).getNumVolume(), colecoes.get(i).getValorUnit());
            }
        }
        if (jaExiste == false) {
            colecoes.add(colecao);
        }
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
    public ArrayList<ColecaoManga> listar() {
        return colecoes;

    }

    private void erroNoCadastro(boolean jaExiste, String nomeColecao, String numVolume, String valorUnit) throws FalhaNoCadastroColecaoException {
        FalhaNoCadastroColecaoException e;
        e = new FalhaNoCadastroColecaoException(jaExiste, nomeColecao, numVolume, valorUnit);
        throw e;
    }

}
