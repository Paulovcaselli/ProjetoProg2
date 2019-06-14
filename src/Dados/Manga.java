package Dados;

/**
 *
 * @author paulo
 */
public class Manga {

    private String nome, editora, idioma;
    private float valor;

    public Manga(String nome, String editora, String idioma, float valor) {
        this.nome = nome;
        this.editora = editora;
        this.idioma = idioma;
        this.valor = valor;
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

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

}
