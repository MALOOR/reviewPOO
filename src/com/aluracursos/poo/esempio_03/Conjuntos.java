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
    }
}
