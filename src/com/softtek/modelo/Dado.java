package com.softtek.modelo;

import java.util.Random;

public class Dado {
    private int resultado;

    public Dado() {

        this.resultado = resultado;
    }

    public int lanzar() {
        int numero = (int) (Math.random()*6) + 1;
        return numero;
    }

}
