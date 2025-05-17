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
public class CasaCerrada extends CasaUrbana{
    private int valorAdmin;
    private boolean AreasComun;
    public CasaCerrada(int i, int aM, String d, int NH, int NB, int P, int vA, boolean AC) {
        super(i, aM, d, NH, NB, P);
        this.AreasComun=AC;
        this.valorAdmin=vA;
    }

    public int getValorAdmin() {
        return valorAdmin;
    }

    public void setValorAdmin(int valorAdmin) {
        this.valorAdmin = valorAdmin;
    }

    public boolean isAreasComun() {
        return AreasComun;
    }

    public void setAreasComun(boolean AreasComun) {
        this.AreasComun = AreasComun;
    }
    
}
