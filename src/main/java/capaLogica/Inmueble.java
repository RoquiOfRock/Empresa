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
public class Inmueble {
    private int idInmobiliaros;
    private int AreaMetros;
    private String Direccion;
    
    public Inmueble(int i, int aM,String d){
        this.idInmobiliaros=i;
        this.AreaMetros=aM;
        this.Direccion=d;
    }

    public int getIdInmobiliaros() {
        return idInmobiliaros;
    }

    public void setIdInmobiliaros(int idInmobiliaros) {
        this.idInmobiliaros = idInmobiliaros;
    }

    public int getAreaMetros() {
        return AreaMetros;
    }

    public void setAreaMetros(int AreaMetros) {
        this.AreaMetros = AreaMetros;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

}