/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.strategy;

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
