/*
 Otra forma de imnplementacon del Patron Strategy
 */
package com.curso.strategy2;

import com.curso.strategy.*;

/**
 *
 * @author sroa
 */
public class NoVolar implements ComportamientoVolar{

    @Override
    public void ejecutaVuelo() {
        System.out.println("No puedo volar");
    }
    
}
