/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domen;

/**
 *
 * @author Milan
 */
public class Cvor<E> {
    public E cvor;
    public Cvor<E> sledeci;

    public Cvor(E cvor) {
        this.cvor = cvor;
    }
    
    public void prikazi(){
        System.out.println(cvor.toString());
    }
}
