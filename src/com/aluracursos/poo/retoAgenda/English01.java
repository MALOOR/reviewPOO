package com.aluracursos.poo.retoAgenda;

import java.util.Map;
import java.util.TreeMap;

public class English01 {

    //This is a repository of my class of english in the ENALLT, group 609, Teacher Margarita Ortega Romero
    //what's the main topic? it's very easy boys and girls developers, we gonna have a word with a sentence in question form.
    //sorry if there is a mistake but we gonna use a colllection of Java called Map with a treeMap like arrayList
    //Remember that first print the map with a iterator.
    //second point the order of each element has a logic secencial.
    //Third point, the map order in form natural.
    //if the key has integer values, the order is ascendent.

    public static void main(String[] args) {
        Map<String,String> wordQuestion = new TreeMap<>();

        wordQuestion.put("Computer Engineer","What is your profession?");
        wordQuestion.put("1.68","What is your height?");
        wordQuestion.put("the man light","What's your favorite book?");
        wordQuestion.put("dog-schnauzer","What kind of pet do you have?");
        wordQuestion.put("guitar","What instrument do you play?");
        wordQuestion.put("57","How much do you weight? or What is your weight?");
        wordQuestion.put("Mauricio","What's your name?");
        wordQuestion.put("Mexico City","Where are you from?");
        wordQuestion.put("1990","What year were you born?");
        wordQuestion.put("March","What month were you born?");
        wordQuestion.put("Basketball,Football","What sports do you practice?");
        wordQuestion.put("34","How old are you?");
        wordQuestion.put("Italian,Korean","What other languages do you speak besides English?");
        wordQuestion.put("creme caramel","What is your favorite dessert?");
        wordQuestion.put("Ford-expedition","What brand of car do you have?");
        wordQuestion.put("math","What is your favorite subject?");
        wordQuestion.put("Orange Juice","What is your favorite drink?");
        wordQuestion.put("30","What day were you born?");
        wordQuestion.put("Lopez","What is your last name?");
        wordQuestion.put("dancing, reading","What is your favorite hobby?");
        wordQuestion.put("Beyonce","What is your favorite singer?");
        wordQuestion.put("Pop and country","What is your favorite genre of music? or what kind of music do you listen to?");
        wordQuestion.put("Spider-man","What is your favorite movie?");

        for(Map.Entry<String, String> element: wordQuestion.entrySet()){

            String  word= element.getKey();
            String question = element.getValue();

            System.out.println("Word: " +word + " -- Question: " +question);
        }











    }



}
