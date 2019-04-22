/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt_pila;

/**
 *
 * @author jonas
 */
public class Item {
    
    private char propiedad;
    private Item siguiente;

    public Item(char propiedad) {
        this.propiedad = propiedad;
        this.siguiente=null;
    }

    public char getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(char propiedad) {
        this.propiedad = propiedad;
    }

    public Item getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Item siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
   
    
}
