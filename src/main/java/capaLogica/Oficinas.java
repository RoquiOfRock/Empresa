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
public class Oficinas extends Locales{
    private boolean SonDelGobierno;

    public Oficinas(int i, int aM, String d, String L, boolean SdG) {
        super(i, aM, d, L);
        this.SonDelGobierno=SdG;
    }

    public boolean isSonDelGobierno() {
        return SonDelGobierno;
    }

    public void setSonDelGobierno(boolean SonDelGobierno) {
        this.SonDelGobierno = SonDelGobierno;
    }
}
