
package com.curso.sinstrategy;

import java.util.ArrayList;
import java.util.*;

public class Principal {

    public static void main(String[] args) {
        
        
        //creamos nuestros objetos
        Pato pato = new Pato("Lucas");
        Pinguino pinguino = new Pinguino("Willy");
        Aguila aguila = new Aguila("Aguila Calva");
        System.out.println("Ejemplo sin Patron Strategy");
        //creamos lista de aves ArrayList
        List<Ave> listaAves = new ArrayList<>();
        
        //añadimos las aves a nuestro arraylist
        listaAves.add(pato);
        listaAves.add(pinguino);
        listaAves.add(aguila);
        
        //itermoas nuestra Lista
        for(Ave ave: listaAves){//por cada ave que voy obteniendo se mete al arraylist
            aplicaVuelo(ave); 
            
            
        }        
        
        
    }
    
    /*
    definimos el metodo estatico donde va recibir como parametro un ave
    quien es? que ave es?
    */
    static void aplicaVuelo(Ave ave){
        System.out.println(ave);
        ave.volar();
        
    }
    
}
