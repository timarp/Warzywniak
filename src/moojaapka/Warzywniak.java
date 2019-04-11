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
public class Warzywniak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Warzywo p1 = new Pomidor("gienek", 15, false);
        Pomidor p2 = new Pomidor("jacek", 10, false);
        
        Warzywo m1 = new Marchewka("marynia", 4, true);
        Marchewka m2 = new Marchewka("alyna", 23, false);
        
        //Warzywo w1 = new Warzywo("jdjd", 0, true); 
        
        System.out.println(p1.getNazwa());
        
        System.out.println(m1.getNazwa());        
        
        System.out.println(p1.isDojrzaly());        
        
        System.out.println(m2.getRozmiar());
        
    }
    
    
}
