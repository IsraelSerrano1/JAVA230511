package com.softtek.presentacion;

import com.softtek.modelo.Multiplicar;

public class MainMultiplicar {

    public static void main(String[] args) {

        Multiplicar tablaNumero = new Multiplicar(5);

        System.out.println(tablaNumero.tablaMultiplicar());
    }
}
