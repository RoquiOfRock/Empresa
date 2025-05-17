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
public class InmueblesVivienda extends Inmueble {
    private int NumHabitaciones;
    private int NumBaños;
    public InmueblesVivienda(int i, int aM, String d, int NH, int NB) {
        super(i, aM, d);
        this.NumHabitaciones=NH;
        this.NumBaños=NB;
    }

    public int getNumHabitaciones() {
        return NumHabitaciones;
    }

    public void setNumHabitaciones(int NumHabitaciones) {
        this.NumHabitaciones = NumHabitaciones;
    }

    public int getNumBaños() {
        return NumBaños;
    }

    public void setNumBaños(int NumBaños) {
        this.NumBaños = NumBaños;
    }
}