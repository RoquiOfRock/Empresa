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
public class Comercios extends Locales{
    private String Direccion;
    public Comercios(int i, int aM, String d, String L, String D) {
        super(i, aM, d, L);
        this.Direccion=D;
    }
    
}
