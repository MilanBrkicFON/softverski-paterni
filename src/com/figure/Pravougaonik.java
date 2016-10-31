/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.figure;

import com.domen.Lista;

/**
 *
 * @author Milan
 */
public class Pravougaonik implements Oblik {

    private double a;
    private double b;
    private Lista<Pravougaonik> listaP;
    
    public Pravougaonik() {
    }

    public Pravougaonik(double a, double b) {
        this.a = a;
        this.b = b;
        listaP = new Lista<>();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Pravougaonik{" + "a=" + a + ", b=" + b + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pravougaonik other = (Pravougaonik) obj;
        if (Double.doubleToLongBits(this.a) != Double.doubleToLongBits(other.a)) {
            return false;
        }
        return Double.doubleToLongBits(this.b) == Double.doubleToLongBits(other.b);
    }

    @Override
    public double povrsina() {
        return a * b;
    }

    @Override
    public double obim() {
        return 2 * (a + b);
    }

    @Override
    public void ispisi() {
        System.out.println(this);
    }

    @Override
    public void kreiraj(double x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void kreiraj(double x, double y) {
        setA(x);
        setB(y);
    }

}
