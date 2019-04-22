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
public class ADT_PILA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Item algo1=new Item('a');
        Item algo2=new Item('b');
        
        //creacion de una pila vacia
        Pila p1=new Pila();
       
        
        p1.Push(algo1);
        p1.Push(algo2);
        
         if(p1.EsPilaVacia()){
            System.out.println("La pila se encuentra vacía");
        }else{
            System.out.println("La pila no se encuentra vacía");
        }
        
        p1.verPila();
        
        System.out.println("El elemento ubicado en el tope de la pila es: "+p1.Top().getPropiedad());
        
        System.out.println("Se produjo la eliminacion del elemento tope de la lista (POP): ");
        p1.Pop();
        p1.verPila();
        
        
        Pila p2=new Pila();
        
        p2.verPila();
        p2.Top();
        p2.Pop();
        
        
    }
    
}
