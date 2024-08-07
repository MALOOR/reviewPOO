package com.aluracursos.poo.colecciones.esempioMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapHash {

    public static void main(String[] args) {


        //HashMap

        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"Casillas");
        map.put(3,"Pique");
        map.put(11,"Capdevila");
        map.put(16,"Busquets");
        map.put(18,"Pedrito");
        map.put(7,"Vila");
        map.put(15,"Ramos");
        map.put(5,"Puyol");
        map.put(14,"Xabi Alonso");
        map.put(8,"Xavi Hernandez");
        map.put(6,"Iniesta");

        //Imprimimos el map con un iterador
        //El orden no importa en un HashMap
        //Los elementos que inserta en el map no tendrán un orden específico. No aceptan claves duplicadas ni valores nulos.
        Iterator it = map.keySet().iterator();
        while (it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave:" + key + " -> Valor: " +map.get(key));

        }
    }


}
