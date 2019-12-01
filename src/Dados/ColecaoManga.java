package Dados;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author paulo
 */
public class ColecaoManga implements Serializable {

    private String nomeColecao, numVolume, valorUnit;
    Usuario donoColecao;
    ArrayList<Integer> meusVolumes;

    public ColecaoManga(String nomeColecao, String numVolume, String valorUnit) {
        this.setColecao(nomeColecao.toUpperCase());
        this.setNumVolume(numVolume);
        this.setValorUnit(valorUnit);
        this.meusVolumes = new ArrayList<Integer>();
    }
    
    public ArrayList<Integer> getMeusVolumes() {
        return meusVolumes;
    }
    
    public ArrayList<Integer> addVolumesColecao(int n){
        meusVolumes.add(n);
        Collections.sort(meusVolumes);
        return meusVolumes;
    }
    
    public Usuario getDonoColecao() {
        return donoColecao;
    }

    public void setDonoColecao(Usuario donoColecao) {
        this.donoColecao = donoColecao;
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
