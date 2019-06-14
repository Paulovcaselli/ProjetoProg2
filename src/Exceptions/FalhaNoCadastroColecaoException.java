package Exceptions;

import javax.swing.JOptionPane;

/**
 *
 * @author paulo
 */
public class FalhaNoCadastroColecaoException extends Exception {

    public FalhaNoCadastroColecaoException(boolean jaExiste, String nomeColecao, String numVolume, String valorUnit) {
        super("Falha no cadastro");
        if (nomeColecao.contains("")) {
            JOptionPane.showMessageDialog(null, "Nome inválido");
        } else if (jaExiste) {
            JOptionPane.showMessageDialog(null, "Coleção já existe!");
        } else if (numVolume.contains("")) {
            JOptionPane.showMessageDialog(null, "Número inválido");
        } else if (valorUnit.contains("")) {
            JOptionPane.showMessageDialog(null, "Valor inválido");
        }
    }

}
