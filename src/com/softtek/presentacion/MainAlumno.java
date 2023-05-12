package com.softtek.presentacion;

import com.softtek.modelo.Alumno;

public class MainAlumno {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Hector López", 3);

        alumno.setParcial(1,8);
        alumno.setParcial(2,7.5);
        alumno.setParcial(3,9);

        System.out.println("el promedio de: "+ alumno.getNombreCompleto() + " es: "+ alumno.promedio() );

        System.out.println("Calificaciones de " + alumno.getNombreCompleto() + ":\n" + alumno.calificaciones());
    }


}
