/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moojaapka;

/**
 *
 * @author tmarz
 */
public abstract class Warzywo {
    
    private String nazwa;
    private int rozmiar;
    private boolean dojrzaly;

    

    public Warzywo(String nazwa, int rozmiar, boolean dojrzaly) {
        this.nazwa = nazwa;
        this.rozmiar = rozmiar;
        this.dojrzaly = dojrzaly;
    }

    public void setDojrzaly(boolean dojrzaly) {
        this.dojrzaly = dojrzaly;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setRozmiar(int rozmiar) {
        this.rozmiar = rozmiar;
    }

    
      public String getNazwa() {
        return nazwa;
    }

    public int getRozmiar() {
        return rozmiar;
    }

    public boolean isDojrzaly() {
        return dojrzaly;
    }
    
}
