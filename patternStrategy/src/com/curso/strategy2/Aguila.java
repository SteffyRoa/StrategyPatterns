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
public class Aguila extends Ave{
     public Aguila(String nombre) {
        super(nombre);
        //cada vez que se crea un aguila se creara el comportamiento volar
        cv= new SiVolar();
    }

  

}

