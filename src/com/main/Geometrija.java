/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

import com.domen.Lista;
import com.figure.*;
import com.kreiranje.ShapeFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Milan
 */
public class Geometrija {

    public static void main(String[] args) {
        Oblik o1 = null;
        
        Lista<Krug> listaKrugova = new Lista<>();
        Lista<Pravougaonik> listaPr = new Lista<>();
        
        Lista<Oblik> krugovi = new Lista<>();
        krugovi.unesiNaKraj(new Pravougaonik(4, 5));
        krugovi.unesiNaKraj(new Krug(4));
        krugovi.unesiNaPocetak(new Krug(9));      
        krugovi.unesiNaPocetak(new Krug(11));
        
        krugovi.prikazi();
        
        System.out.println("Menu:\n1) Krug\n2) Pravougaonik\n3) Kraj");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String odg = br.readLine();
            String oblik = "";
            
            switch (odg) {
                case "1":
                    oblik = "KRUG";
                    break;
                case "2":
                    oblik = "PRAVOUGAONIK";
                    break;
                case "3":
                    System.out.println("Napustanje programa...");
                    new Thread().wait(1000);
                    System.exit(-1);
                default:
                    System.out.println("Pograsan unos. ");
                    System.exit(-1);
            }
            
            
            
            String drOdg = br.readLine();
            
            switch(drOdg){
                case "1":
                    o1 = ShapeFactory.getOblik(oblik);
                    
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                default: System.out.println("Pokusaj ponovo!"); break;
            }
        } catch (IOException ex) {
            Logger.getLogger(Geometrija.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Geometrija.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        krugovi.prikazi();
    }

    private static void ispisiPodmeni(String s) {
        System.out.println("-------------------------");
        System.out.printf("%s menu:\n1) Dodaj %s na pocetak\n2) Dodaj %s na kraj\n"
                + "3) Prikaz svih %sa\n4) Prikaz svih povrsina\n5) Prikaz svih obima\n6) Povratak na glavni menu", s, s, s, s.toLowerCase());
    }
    
    
}
