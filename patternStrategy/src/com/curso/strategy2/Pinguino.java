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
public class Pinguino extends Ave {
     public Pinguino(String nombre) {
        super(nombre);
        
        cv= new NoVolar();
    }

   

}

