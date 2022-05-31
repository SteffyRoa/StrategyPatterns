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
public class Pato extends Ave {

    public Pato(String nombre) {
        super(nombre);
    }

    @Override
    void volar() {
        System.out.println("No puedo volar");//si nos piden cambiar esto tendriamos que ir clase por clase
        //por eso ocupamos el patron strategy

    }

}
