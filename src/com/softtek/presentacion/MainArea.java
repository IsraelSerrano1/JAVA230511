package com.softtek.presentacion;


import com.softtek.modelo.Areas;

public class MainArea {

    public static void main(String[] args) {
        Areas poligono = new Areas(2,4,8);

        System.out.println("El area del circulo es: " + poligono.areaCirculo());
        System.out.println("El area del circulo es: " + poligono.areaRectangulo());
    }
}
