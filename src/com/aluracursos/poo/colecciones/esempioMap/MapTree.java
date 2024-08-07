package com.aluracursos.poo.colecciones.esempioMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapTree {


    public static void main(String[] args) {


        //TreeMap

        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "Casillas");
        map.put(3, "Pique");
        map.put(11, "Capdevila");
        map.put(16, "Busquets");
        map.put(18, "Pedrito");
        map.put(7, "Villa");
        map.put(15, "Ramos");
        map.put(5, "Puyol");
        map.put(14, "Xabi Alonso");
        map.put(8, "Xavi Hernandez");
        map.put(6, "Iniesta");


        //Imprimimos el map con un iterador
        //El orden tiene una secuencia logica
        //El Mapa lo ordena de forma "natural".
        //Por ejemplo, si la clave son valores enteros (como luego veremos), los ordena de menos a mayor.

        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
        }

        System.out.println("********* Trabajando con los métodos de Map *********");
        System.out.println("Mostramos el numero de elementos que tiene el TreeMap: treeMap.size() = "+map.size());
        System.out.println("Vemos si el TreeMap esta vacio : treeMap.isEmpty() = "+map.isEmpty());
        System.out.println("Obtenemos un elemento del Map pasandole la clave 6: treeMap.get(6) = "+map.get(6));
        System.out.println("Borramos un elemento del Map el 18 (porque fue sustituido): treeMap.remove(18) = "+map.remove(18));
        System.out.println("Vemos que pasa si queremos obtener la clave 18 que ya no existe: treeMap.get(18) = "+map.get(18));
        System.out.println("Vemos si existe un elemento con la clave 18: treeMap.containsKey(18) = "+map.containsKey(18));
        System.out.println("Vemos si existe un elemento con la clave 1: treeMap.containsKey(1) = "+map.containsKey(1));
        System.out.println("Vemos si existe el valo 'Villa' en el Map: treeMap.containsValue(Villa) = "+map.containsValue("Villa"));
        System.out.println("Vemos si existe el valo 'Ricardo' en el Map: treeMap.containsValue(Ricardo) = "+map.containsValue("Ricardo"));
        System.out.println("Borramos todos los elementos del Map: treeMap.clear()");map.clear();
        System.out.println("Comprobamos si lo hemos eliminado viendo su tamaño: treeMap.size() = "+map.size());
        System.out.println("Lo comprobamos tambien viendo si esta vacio treeMap.isEmpty() = "+map.isEmpty());


    }
}
