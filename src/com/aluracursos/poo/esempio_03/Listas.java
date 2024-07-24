package com.aluracursos.poo.esempio_03;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static void main(String[] args) {

        List<String> numeros = new ArrayList<>();


        numeros.add("uno");
        numeros.add("dos");
        numeros.add("tres");
        numeros.add("cuatro");
        numeros.add("cinco");

       /* for (int i = 0; i<numeros.size(); i++){

            System.out.println(numeros.get(i));

        }

        */

        for(String s: numeros){
            System.out.println(s);
        }
    }
}
