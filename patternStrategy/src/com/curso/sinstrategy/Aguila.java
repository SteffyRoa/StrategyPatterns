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
public class Aguila extends Ave{
     public Aguila(String nombre) {
        super(nombre);
    }

    @Override
    void volar() {
        System.out.println("Puedo volar");

    }

}

