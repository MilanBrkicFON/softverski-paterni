/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kreiranje;

import com.figure.Krug;
import com.figure.Oblik;
import com.figure.Pravougaonik;
import java.io.BufferedReader;

/**
 *
 * @author Milan
 */
public class ShapeFactory  {

    
    public static Oblik getOblik(String oblik, double... a) {
        if (oblik == null) {
            return null;
            
        }
        if (oblik.equalsIgnoreCase("KRUG")) {
            
            return new Krug(a[0]);
        }
        if (oblik.equalsIgnoreCase("PRAVOUGAONIK")) {
            return new Pravougaonik(a[0],a[1]);
        }
        return null;
    }
    
}
