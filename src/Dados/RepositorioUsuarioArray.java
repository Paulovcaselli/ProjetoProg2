package Dados;

import java.io.Serializable;
import Exceptions.FalhaNoCadastroException;
import Exceptions.FalhaNaBuscaException;
import Exceptions.FalhaNaRemocaoException;
import Exceptions.FalhaNaEdicaoException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author paulo
 */
public class RepositorioUsuarioArray implements RepositorioUsuario, Serializable {

    private Usuario[] usuarios;
    private int indice;

    private final static int TAMANHO = 100;

    public RepositorioUsuarioArray() {
        this.usuarios = new Usuario[TAMANHO];
        this.indice = 0;
    }

    public void erroNoCadastro(boolean jaExiste, String login, String senha, String email, String nome) throws FalhaNoCadastroException {
        FalhaNoCadastroException e;
        e = new FalhaNoCadastroException(jaExiste, login, senha, email, nome);
        throw e;
    }

    public void erroNaBusca(String login, String senha, boolean jaExiste) throws FalhaNaBuscaException {
        FalhaNaBuscaException e;
        e = new FalhaNaBuscaException(login, senha, jaExiste);
        throw e;
    }

    public void inserir(Usuario usuario) throws FalhaNoCadastroException {
        boolean jaExiste = false;
        if (usuario.getLogin().equals("") || usuario.getSenha().length() < 6 || usuario.getNome().equals("") || usuario.getEmail().equals("") || usuario.getLogin().contains(" ")) {
            erroNoCadastro(jaExiste, usuario.getLogin(), usuario.getSenha(), usuario.getNome(), usuario.getEmail());
        }
        for (int i = 0; i <= indice; i++) {
            if (usuarios[i] != null && usuarios[i].getLogin().equals(usuario.getLogin())) {
                jaExiste = true;
                erroNoCadastro(jaExiste, usuario.getLogin(), usuario.getSenha(), usuario.getNome(), usuario.getEmail());
            }
        }
        for (int i = 0; i <= indice; i++) {
            if (usuarios[i] == null) {
                usuarios[i] = usuario;
                this.indice++;
                return;
            }
        }
        erroNoCadastro(jaExiste, usuario.getLogin(), usuario.getSenha(), usuario.getNome(), usuario.getEmail());
    }

    public void editar(Usuario usuario) throws FalhaNaEdicaoException {
        for (int i = 0; i <= indice; i++) {
            if (usuarios[i] != null && usuarios[i].getLogin() == usuario.getLogin()) {
                usuarios[i] = usuario;
                return;
            }
        }
        FalhaNaEdicaoException e;
        e = new FalhaNaEdicaoException(usuario.getLogin());
        throw e;

    }

    public Usuario procurar(String login, String senha) throws FalhaNaBuscaException {
        boolean jaExiste = false;
        if (login.equals("") || senha.equals("")) {
            erroNaBusca(login, senha, jaExiste);
        }
        for (int i = 0; i <= indice; i++) {
            if (usuarios[i] != null && usuarios[i].getLogin().equals(login) && usuarios[i].getSenha().equals(senha)) {
                return usuarios[i];
            }
        }
        erroNaBusca(login, senha, jaExiste);
        return null;
    }

    public void remover(String login) throws FalhaNaRemocaoException {
        for (int i = 0; i <= indice; i++) {
            if (usuarios[i].getLogin() == login) {
                usuarios[i] = null;
                this.indice--;
                return;
            }
        }
        FalhaNaRemocaoException e;
        e = new FalhaNaRemocaoException(login);
        throw e;
    }
}
