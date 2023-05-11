package com.softtek.presentacion;

import com.softtek.modelo.Campos;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

            Campos num = new Campos(5);

            System.out.println(num.muestra());
            num.incrementa();
            num.incrementa();
            System.out.println(num.muestra());


    }
}
