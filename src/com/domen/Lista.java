/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domen;

/**
 *
 * @author Milan
 * @param <E>
 */
public class Lista<E> implements GeometrijskaLista<E> {

    private  Cvor<E> prvi = null;
    private int kapacitet;
    private int glava;

    public Lista() {
       prvi = null;
    }

    public int getKapacitet() {
        return kapacitet;
    }

    public void setKapacitet(int kapacitet) {
        this.kapacitet = kapacitet;
    }

    public int getGlava() {
        return glava;
    }

    public void setGlava(int glava) {
        this.glava = glava;
    }

    @Override
    public void unesiNaPocetak(E objekat) {
        Cvor<E> novi = new Cvor<>(objekat);
        
        if (prvi == null) {
            prvi = novi;
        }else{
           novi.sledeci = prvi;
           prvi = novi;
        }
    }

    public Cvor<E> getPrvi() {
        return prvi;
    }

    public void setPrvi(Cvor<E> prvi) {
        this.prvi = prvi;
    }

    @Override
    public void unesiNaKraj(E objekat) {
        Cvor<E> novi = new Cvor<>(objekat);
        Cvor<E> temp = prvi;
        
        if (prvi == null) {
            prvi = novi;
        }else{
            while (temp.sledeci != null) {                
                temp = temp.sledeci;
            }
            temp.sledeci = novi;
        }
    }

    @Override
    public void prikazi() {
        System.out.println("-------------");
        Cvor<E> temp = prvi;
        while (temp != null) {            
            temp.prikazi();
            temp = temp.sledeci;
        }
        System.out.println("-------------");
    }

}
