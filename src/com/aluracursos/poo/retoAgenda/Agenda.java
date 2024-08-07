package com.aluracursos.poo.retoAgenda;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Agenda {

    /*
    * 1.En este reto crearás una agenda telefónica simple.
    * 2.No es necesario crear objetos nuevos, sólo hacer uso de colecciones.
    * 3.En la primera versión permitirá asociar un número telefónico por persona.
    * 4.La agenda será estática, será necesario modificar el código fuente de la aplicación para agregar nuevas personas y números.
    * 5.En la segunda versión permitirá asociar más de un número a una persona.
    * 6.Se les dará una prioridad de los números de las personas y deberán mostrarse con base a esa prioridad.
    * 7.Para probar la agenda, ingresa los números de las personas, sin importar el orden en el que se ingresen, siempre deberán mostrarse de la misma forma:
    *   Abiigail: 6848-6573
    *             4152-6378
    *   Beto:   6185-7961
    *   Carlos:  5824-6397
    *            8271-9346
    *   Cesar:   7418-5296
    *   Fernando: 9753-8642
    *   Monica:   7698-1254
    *             1973-4682
    *
    *
    *
    * */


    public static void main(String[] args) {

        //Reto version statica

        Map<String,String> agenda = new TreeMap<>();

        agenda.put("Monica","7698-1254");
        agenda.put("Beto","6185-7961");
        agenda.put("Cesar","7418-5296");
        agenda.put("Fernando","9753-8642");
        agenda.put("Abigail","6848-6573");
        agenda.put("Carlos","5824-6397");

        /*for(Map.Entry<String, String> persona: agenda.entrySet()){

            String nombre = persona.getKey();
            String telefono = persona.getValue();

            System.out.println("Nombre: " +nombre + " -- Telefono: "+telefono);
        }
        */

        Iterator iterador = agenda.keySet().iterator();
        while(iterador.hasNext()){

            String nombre = (String) iterador.next();

            System.out.println("Name: " +nombre + "-- Telephone: " +agenda.get(nombre));

        }
        //Reto version 2 no statica

        System.out.println("/////////////////////////////////////////////////////");


    }
}
