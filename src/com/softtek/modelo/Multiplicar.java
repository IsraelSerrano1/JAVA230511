package com.softtek.modelo;

public class Multiplicar {

    private int num;

    public Multiplicar(int num) {
        this.num = num;
    }

    public Multiplicar() {
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public String tablaMultiplicar() {
        String tabla = "";
        for (int i = 1; i <= 10; i++) {
            int resultado = this.num * i;
            tabla += this.num + " x " + i + " = " + resultado + "\n";
        }
        return tabla;
    }
}
