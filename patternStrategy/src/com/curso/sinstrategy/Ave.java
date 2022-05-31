/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.sinstrategy;

/**
 *
 * @author sroa
 */
public abstract class Ave {
    
    String nombre;
    public Ave(String nombre){
        this .nombre= nombre;
    }
    
    abstract void volar();//metodo abstracto

    @Override
    public String toString() {
        return this.getClass().getSimpleName();//para obtener la variable de referencia
    }
    
    
   
    
}
