package com.softtek.modelo;

public class Areas {
    private double radio;
    private double base;
    private double altura;

    public Areas() {
    }

    public Areas(double radio, double base, double altura) {
        this.radio = radio;
        this.base = base;
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Areas{" +
                "radio=" + radio +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double areaCirculo() {

        return + Math.PI * Math.pow(this.radio, 2);
    }

    public double areaRectangulo() {

        return this.base * this.altura;
    }

}
