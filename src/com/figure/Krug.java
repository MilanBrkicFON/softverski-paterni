/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.figure;

import java.util.LinkedList;
import com.domen.*;

/**
 *
 * @author Milan
 */
public class Krug implements Oblik{

    private double r;
    private Lista<Krug> listaKrugova;
    
    public Krug() {
    }

    public Krug(double r) {
        this.r = r;
        listaKrugova = new Lista<>();
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Krug{" + "r=" + r + '}';
    }
    
    @Override
    public double povrsina() {
        return r*r*Math.PI;
    }

    @Override
    public double obim() {
        return 2*r*Math.PI;
    }

    @Override
    public void ispisi() {
        System.out.println(this);
    }

    @Override
    public void kreiraj(double x) {
        setR(x);
    }

    @Override
    public void kreiraj(double x, double y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
