package com.softtek.presentacion;

import com.softtek.modelo.Dado;

import java.util.Scanner;

public class MainDado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tirar;
        int numero;
        Dado dado = new Dado();
        numero = dado.lanzar();
        dibujar(numero);
        do {
            System.out.println("¿quieres lanzar de nuevo? (s/n)");
            tirar = sc.next();
            if (tirar.equals("s")) {
                numero = dado.lanzar();
                dibujar(numero);
            }
        }while (!tirar.equals("n")) ;

        sc.close();
    }

    private static void dibujar(int numero) {
        switch (numero) {
            case 1:
                System.out.println(" ------- ");
                System.out.println("|       |");
                System.out.println("|   X   |");
                System.out.println("|       |");
                System.out.println(" ------- ");
                break;
            case 2:
                System.out.println(" ------- ");
                System.out.println("| X     |");
                System.out.println("|       |");
                System.out.println("|     X |");
                System.out.println(" ------- ");
                break;
            case 3:
                System.out.println(" ------- ");
                System.out.println("| X     |");
                System.out.println("|   x   |");
                System.out.println("|     x |");
                System.out.println(" ------- ");
                break;
            case 4:
                System.out.println(" ------- ");
                System.out.println("| x   x |");
                System.out.println("|       |");
                System.out.println("| x   x |");
                System.out.println(" ------- ");
                break;
            case 5:
                System.out.println(" ------- ");
                System.out.println("| x   x |");
                System.out.println("|   x   |");
                System.out.println("| x   x |");
                System.out.println(" ------- ");
                break;
            case 6:
                System.out.println(" ------- ");
                System.out.println("| x   x |");
                System.out.println("| x   x |");
                System.out.println("| x   x |");
                System.out.println(" ------- ");
                break;
            default:
                System.out.println("Número inválido.");
                break;
        }
    }
}








