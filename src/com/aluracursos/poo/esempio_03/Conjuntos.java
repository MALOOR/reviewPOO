package com.aluracursos.poo.esempio_03;

import java.util.HashSet;
import java.util.Set;

public class Conjuntos {

    public static void main(String[] args) {

        Set<String> conjunto = new HashSet<>();

        conjunto.add("uno");
        conjunto.add("dos");
        conjunto.add("tres");
        conjunto.add("cuatro");
        conjunto.add("cuatro");

        for(String s: conjunto){
            System.out.println(s);
        }

        System.out.println("*************************************************");


      Set<Numeros> numero = new HashSet<>();

       numero.add(new Numeros("uno"));
       numero.add(new Numeros("dos"));
       numero.add(new Numeros("tres"));
       numero.add(new Numeros("cuatro"));
       numero.add(new Numeros("cuatro"));


       for(Numeros n: numero ){

           System.out.println(n.getNumero());
       }


    }
}
