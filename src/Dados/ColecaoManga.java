package Dados;

import java.io.Serializable;

/**
 *
 * @author paulo
 */
public class ColecaoManga implements Serializable {

    private String nomeColecao, numVolume, valorUnit;

    public ColecaoManga(String nomeColecao, String numVolume, String valorUnit) {
        this.setColecao(nomeColecao.toUpperCase());
        this.setNumVolume(numVolume);
        this.setValorUnit(valorUnit);
    }

    @Override
    public String toString() {
        return nomeColecao + numVolume + valorUnit;
    }

    public String getNomeColecao() {
        return nomeColecao;
    }

    public void setColecao(String nomeColecao) {
        this.nomeColecao = nomeColecao;
    }

    public String getNumVolume() {
        return numVolume;
    }

    public void setNumVolume(String numVolume) {
        this.numVolume = numVolume;
    }

    public String getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(String Unit) {
        this.valorUnit = valorUnit;
    }
}
