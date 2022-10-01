package br.com.beecrowd.exercicios;

import java.util.Scanner;

public class Exercicio1070 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x = teclado.nextInt();
        int i = 0;

        while (i < 6) {

            if (x % 2 != 0) {
                System.out.println(x);
                i++;
            }
            x++;
        }

    }
}
