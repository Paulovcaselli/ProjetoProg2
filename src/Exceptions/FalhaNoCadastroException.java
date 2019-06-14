package Exceptions;

import javax.swing.JOptionPane;

/**
 *
 * @author paulo
 */
public class FalhaNoCadastroException extends Exception {

    public FalhaNoCadastroException(boolean jaExiste, String login, String senha, String email, String nome) {
        super("Falha no cadastro");
        if (login.contains(" ")) {
            JOptionPane.showMessageDialog(null, "Login inválido");
        } else if (jaExiste) {
            JOptionPane.showMessageDialog(null, "Usuário já existe !");
        } else if (jaExiste) {
            JOptionPane.showMessageDialog(null, "Usuário já existe !");
        } else if (senha.length() < 6) {
            JOptionPane.showMessageDialog(null, "Senha muito curta !\nMinimo 6 digitos.");
        } else if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "Email inválido.");
        } else if (nome.equals("")) {
            JOptionPane.showMessageDialog(null, "Nome já existente !");
        } else {
            JOptionPane.showMessageDialog(null, "Falha no cadastro !");
        }
    }
}
