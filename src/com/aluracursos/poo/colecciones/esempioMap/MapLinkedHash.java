package com.aluracursos.poo.colecciones.esempioMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapLinkedHash {

    public static void main(String[] args) {


        Map<Integer,String> linkedMap = new LinkedHashMap<Integer,String>();

        linkedMap.put(1, "Casillas");
        linkedMap.put(3, "Pique");
        linkedMap.put(11, "Capdevila");
        linkedMap.put(16, "Busquets");
        linkedMap.put(18, "Pedrito");
        linkedMap.put(7, "Vila");
        linkedMap.put(15, "Ramos");
        linkedMap.put(5, "Puyol");
        linkedMap.put(14, "Xabi Alonso");
        linkedMap.put(8, "Xavi Hernandez");
        linkedMap.put(6, "Iniesta");

        //imprimimos el Map con un Iterador que ya hemos instanciado anteriormente
        //El resultado que tenemos es el siguiente en el que vemos que nos ordena los objetos tal y como los hemos ido introduciendo:
        Iterator it = linkedMap.keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key+ " -> Valor: " + linkedMap.get(key));
        }

        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Foreach: Forma alternativa para recorrer los Map mostrando la Clave y el valor:");
        for(Map.Entry<Integer,String> jugador: linkedMap.entrySet()){
            Integer clave = jugador.getKey();
            String valor = jugador.getValue();

            System.out.println(clave + " -> " +valor);
        }

    }
}
