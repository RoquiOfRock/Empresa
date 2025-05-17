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
public class Casas extends InmueblesVivienda {
    private int Pisos;

    public Casas(int i, int aM, String d, int NH, int NB, int P) {
        super(i, aM, d, NH, NB);
        this.Pisos=P;
    }

}
