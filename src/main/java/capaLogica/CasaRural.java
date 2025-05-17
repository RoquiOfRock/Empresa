/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaLogica;

/**
 *
 * @author 57169558
 */
public class CasaRural extends Casas {
    private int distMunicipal;
    private int nivelMar;

    public int getDistMunicipal() {
        return distMunicipal;
    }

    public void setDistMunicipal(int distMunicipal) {
        this.distMunicipal = distMunicipal;
    }

    public int getNivelMar() {
        return nivelMar;
    }

    public void setNivelMar(int nivelMar) {
        this.nivelMar = nivelMar;
    }

    public CasaRural(int i, int aM, String d, int NH, int NB, int P, int dM, int nM) {
        super(i, aM, d, NH, NB, P);
        this.distMunicipal=dM;
        this.nivelMar=nM;
    }
    
}
