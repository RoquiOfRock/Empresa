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
public class Apartamento extends InmueblesVivienda{
    private int valorDeAdministracion;
    public Apartamento(int i, int aM, String d, int NH, int NB, int vAd) {
        super(i, aM, d, NH, NB);
        this.valorDeAdministracion=vAd;
    }

    public int getValorDeAdministracion() {
        return valorDeAdministracion;
    }

    public void setValorDeAdministracion(int valorDeAdministracion) {
        this.valorDeAdministracion = valorDeAdministracion;
    }
    
}
