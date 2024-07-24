package com.aluracursos.poo.esempio_01;

public class ProfesorInterino extends Profesor{

    private String fechaContratacion;

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public ProfesorInterino(String nombre, String apellido, String idProfesor, String fechaContratacion){

        super(nombre, apellido, idProfesor);
        this.fechaContratacion = fechaContratacion;

    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Fecha de Contratacion: "+getFechaContratacion());
    }
}
