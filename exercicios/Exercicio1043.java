//12-10-2022
package br.com.beecrowd.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. 
 * Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:
 * 
 * Perimetro = XX.X
 * Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, 
 * mostrando a mensagem
 * 
 * Area = XX.X */

public class Exercicio1043 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        float A = teclado.nextFloat();
        float B = teclado.nextFloat();
        float C = teclado.nextFloat();

        if (((A < B + C) && (B < A + C) && (C < B + A))) {
            System.out.println("Perimetro = " + df.format(A + B + C));

        } else {
            System.out.println("Area = " + df.format(((A + B) * C) / 2));
        }

    }
}
