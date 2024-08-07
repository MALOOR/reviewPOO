package com.aluracursos.poo.colecciones.esempio_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Persona dakota = new Persona("Dakota","Jhonson",1.71F);
        Persona lily = new Persona("Lily","James",1.70F);
        Persona scarlet = new Persona("Scarlett","Johansson",1.62F);
        Persona aitana = new Persona("Aitana", "Ocaña",1.61F);

        List<Persona> lista = new ArrayList<>();
        lista.add(dakota);
        lista.add(lily);
        lista.add(scarlet);
        lista.add(aitana);

        Collections.sort(lista);

        for (Persona p: lista){
            System.out.println(p.getNombre() +" "+ p.getEstatura());
        }
    }

    
}
