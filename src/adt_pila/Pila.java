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
public class Pila {
    
    private Item primero;

    public Pila() {
    }
    
 
    public boolean EsPilaVacia(){ //será instanciado por un objeto del tipo pila
        Item aux=this.primero;
            if(aux==null){
                return true;
            }else return false;
    }
    
    
    public void Push(Item algo){ // recibe algo del tipo item y lo agrega a la pila que instancia el metodo
        algo.setSiguiente(this.primero);
        this.primero=algo;
    }
    
    public Item Top(){// devuelve el ultimo elemento en el tope de la pila actual
           if(this.primero==null){
              System.out.println("Lista vacía, no es posible devolver ningun elemento");
              return null; // null representaria el item indefinido
           }else{
              Item aux=this.primero;
              return aux; // por las dudas trabajo con un auxiliar}  
           }
    }
    
    
    public void Pop(){// retorna la la lista menos el elemento del tope
         if(this.primero==null){
              System.out.println("Lista vacía, no es posible eliminar ningun elemento");
           }else{
              this.primero=this.primero.getSiguiente(); // seteo el puntero primero en el 2do item
           }
    }
    
    
   
    
    public void verPila(){  //ver los elementos cargados en la pila que instancia el metodo
            if(this.primero==null){
             System.out.println("Lista vacía");
            }else{
              Item aux=this.primero;
              System.out.println("Items cargados en la pila: ");
                while(aux!=null){
                    System.out.println("    Item: "+aux.getPropiedad());
                    aux=aux.getSiguiente();
                 }
            }
            
    }
    
    
}
