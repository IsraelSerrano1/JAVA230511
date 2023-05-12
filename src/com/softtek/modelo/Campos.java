package com.softtek.modelo;

public class Campos {
    private int x;

    public Campos(int x) {
        this.x = x;
    }

    public int muestra(){
        return x;
    }

    public void incrementa(){
        x++;
    }
}
