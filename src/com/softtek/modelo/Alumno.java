package com.softtek.modelo;

import java.util.ArrayList;

public class Alumno {

    private String nombreCompleto;
    private ArrayList<Double> parciales;

    public Alumno() {
    }
    public Alumno(String nombreCompleto, int parciales) {
        this.nombreCompleto = nombreCompleto;
        this.parciales = new ArrayList<Double>(parciales);
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public ArrayList<Double> getParciales() {
        return parciales;
    }

    public void setParciales(ArrayList<Double> parciales) {
        this.parciales = parciales;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombreCompleto=" + nombreCompleto + ", parciales=" + parciales + '}';
    }

    public void setParcial(int parcial, double calificacion) {
        this.parciales.add(parcial - 1, calificacion);
    }
    public double promedio() {
        int total = 0;
        for (double calificacion : this.parciales) {
            total += calificacion;
        }
        return total / this.parciales.size();

    }

    public ArrayList<String> calificaciones() {
        ArrayList<String> cals = new ArrayList<>();
        for (int i = 0; i < this.parciales.size(); i++) {
           cals.add("Parcial " + (i+1)  + ": " + this.parciales.get(i) + "\n");
        }
        return cals;
    }
}
