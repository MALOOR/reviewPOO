package com.aluracursos.poo.colecciones.esempio_01;

import java.util.PriorityQueue;
import java.util.Queue;

public class Cola {

    public static void main(String[] args) {


        Queue<String> cola = new PriorityQueue<>();

        cola.add("uno");
        cola.add("dos");
        cola.add("tres");
        cola.add("cuatro");
        cola.add("cinco");


        for(String s: cola){

            System.out.println(s);
        }

        System.out.println("////////////////////////////////////////");

        String valor =null;

        while((valor= cola.poll()) != null){

            System.out.println(valor);
        }

        System.out.println("///////////////////////////////////////");

        Queue<Libro> colaLibro = new PriorityQueue<>();

        colaLibro.add(new Libro("uno", 10));
        colaLibro.add(new Libro("dos",5));
        colaLibro.add(new Libro("tres",0));

        Libro libro = null;

        while ((libro = colaLibro.poll())!=null){

            System.out.println(libro.getTitulo());

        }
    }
}
