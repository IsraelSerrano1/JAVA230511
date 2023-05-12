package com.softtek.modelo;

import static javafx.scene.input.KeyCode.X;

public class Campos {
    private int x;

    public Campos(int x) {
        this.x = x;
    }

    public void muestra(){
        System.out.println(this.x);
    }

    public int incrementa(){
        return x++;
    }
}
