package Exceptions;

import javax.swing.JOptionPane;

/**
 *
 * @author paulo
 */
public class FalhaNoCadastroMangaException extends Exception {

    public FalhaNoCadastroMangaException(boolean jaExiste, String nome, String editora, String idioma, float valor) {
        super("Falha no cadastro");
        if (nome.contains("")) {
            JOptionPane.showMessageDialog(null, "Nome inválido");
        } else if (jaExiste) {
            JOptionPane.showMessageDialog(null, "Mangá já existe !");
        } else if (editora.contains("")) {
            JOptionPane.showMessageDialog(null, "Editora inválida");
        } else if (idioma.contains("")) {
            JOptionPane.showMessageDialog(null, "Idioma inválido");
        } else if (valor < 0) {
            JOptionPane.showMessageDialog(null, "Valor inválido");
        }
    }

}
