package Dados;

/**
 *
 * @author paulo
 */
public class Manga {

    private String nome, editora, idioma, valor;
    //private float valor;

    public Manga(String nome, String editora, String idioma, String valor) {
        this.setNome(nome);
        this.setEditora(editora);
        this.setIdioma(idioma);
        this.setValor(valor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
