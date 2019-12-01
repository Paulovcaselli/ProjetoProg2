package Dados;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author paulo
 */
public class Usuario implements Serializable {

    private String login, senha, nome, email;
    private ArrayList<ColecaoManga> minhasColecoes;

    public Usuario(String login, String senha, String nome, String email, ArrayList<ColecaoManga> minhasColecoes) {
        this.setLogin(login.toUpperCase());
        this.setSenha(senha);
        this.setNome(nome);
        this.setEmail(email);
        this.setMinhasColecoes(minhasColecoes);

    }
    
    public ArrayList<ColecaoManga> getMinhasColecoes() {
        return minhasColecoes;
    }

    public void setMinhasColecoes(ArrayList<ColecaoManga> minhasColecoes) {
        this.minhasColecoes = minhasColecoes;
    }

    @Override
    public String toString() {
        return "Login: " + login + "\nSenha: " + senha + "\nNome: " + nome + "\nEmail: " + email;
    }

    public Usuario clone() {
        return new Usuario(this.login, this.senha, this.nome, this.email, this.minhasColecoes);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}
