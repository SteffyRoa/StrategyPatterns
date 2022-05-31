/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.strategy2;

import com.curso.strategy.*;

/**
 *
 * @author sroa
 */
public class AleatorioVolar implements ComportamientoVolar {

    @Override
    public void ejecutaVuelo() {
        System.out.println("Si quiero volar");
    }
    
}
