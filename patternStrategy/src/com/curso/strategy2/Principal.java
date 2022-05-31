/**
 * En este ejemplo cuando naces los objetos al mismo tiempo nace el comportamiento
 * Patron Strategy lo podemos cambiar en tiempo de ejecucion
 */
package com.curso.strategy2;

import com.curso.strategy.*;
import com.curso.sinstrategy.*;
import java.util.ArrayList;
import java.util.*;

public class Principal {

    public static void main(String[] args) {
        
        
        //creamos nuestros objetos
        Pato pato = new Pato("Lucas");
       
        
        Pinguino pinguino = new Pinguino("Willy");
       
        
        Aguila aguila = new Aguila("Aguila Calva");
       
        
        //creamos lista de aves ArrayList
        List<Ave> listaAves = new ArrayList<>();
        
        //añadimos las aves a nuestro arraylist
        listaAves.add(pato);
        listaAves.add(pinguino);
        listaAves.add(aguila);
        
        
        System.out.println("PatronStrategy implementacion en clases");
        //itermoas nuestra Lista
        for(Ave ave: listaAves){//por cada ave que voy obteniendo se mete al arraylist
            aplicaVuelo(ave); 
            
             System.out.println("-------------------------"); 
        }        
        
        
        System.out.println("-------------------------");
        //cambios en tiempo de ejecucion
        pato.cv=new SiVolar();
        aguila.cv= new AleatorioVolar();
        pinguino.cv= new NoVolar();
        
        
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
