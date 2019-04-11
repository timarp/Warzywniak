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
public class Pomidor extends Warzywo 
{
    //private Marchewka m;          // to jakbyśmy chcieli mieć marchewkę w pomidorze 
        
    public Pomidor(String nazwa, int rozmiar, boolean dojrzaly) {
        super(nazwa, rozmiar, dojrzaly);
        //m = new Marchewka(nazwa, rozmiar, dojrzaly);      // to jest bez sensu ale można
        // to by była marchewka w pomidorze - jakkolwiek to brzmi 
    }
        
    
}
