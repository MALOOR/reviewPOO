package com.aluracursos.poo.esempio_02;

public class Principal {

    public static void main(String[] args) {

        Formula formula;

        formula = new Triangulo();
        formula.calcularArea();
        formula = new Rectangulo();
        formula.calcularArea();
        formula = new Cuadrado();
        formula.calcularArea();
    }
}
