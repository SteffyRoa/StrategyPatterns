/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.strategy2;

import com.curso.strategy.*;
import com.curso.sinstrategy.*;

/**
 *
 * @author sroa
 */
public abstract class Ave {
    
    String nombre;
    //atributo comportamiento volar
     ComportamientoVolar cv;
     
     
    public Ave(String nombre){
        this .nombre= nombre;
    }
    
    void volar(){//delegamos que este metodo llame a comportamiento volar
    cv.ejecutaVuelo();//el ave le delega a comportamientoVolar el vuelo
    }
    
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();//para obtener la variable de referencia
    }
    
    
   
    
}
