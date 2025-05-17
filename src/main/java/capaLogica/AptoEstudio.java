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
public class AptoEstudio extends Apartamento {
    private int habitacion;
    public AptoEstudio(int i, int aM, String d, int NH, int NB, int vAd, int H) {
        super(i, aM, d, NH, NB, vAd);
        this.habitacion=H;
    }

    public int getHabitacion() {
        return 1;
    }
}
