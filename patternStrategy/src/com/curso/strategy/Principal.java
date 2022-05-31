
package com.curso.strategy;

import com.curso.sinstrategy.*;
import java.util.ArrayList;
import java.util.*;

public class Principal {

    public static void main(String[] args) {
        //creamos estos tres comportamientos
        ComportamientoVolar cv1 = new SiVolar();
        ComportamientoVolar cv2= new NoVolar();
        ComportamientoVolar cv3 = new AleatorioVolar();
        
        
        //creamos nuestros objetos
        Pato pato = new Pato("Lucas");
        pato.cv=cv2;//asignando comportamientos
        
        Pinguino pinguino = new Pinguino("Willy");
        pinguino.cv=cv2;
        
        Aguila aguila = new Aguila("Aguila Calva");
        aguila.cv=cv2;
        
        //creamos lista de aves ArrayList
        List<Ave> listaAves = new ArrayList<>();
        System.out.println("PatronStrategy implementacion desde Principal");
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
