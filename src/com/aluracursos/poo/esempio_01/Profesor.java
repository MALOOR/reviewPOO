package com.aluracursos.poo.esempio_01;

public class Profesor extends Persona{

    private String idProfesor;

    public String getIdProfesor() {
        return idProfesor;
    }

    public Profesor(String nombre, String apellido, String idProfesor){
        super(nombre,apellido);
        this.idProfesor = idProfesor;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("I.D : "+getIdProfesor());
    }
}
