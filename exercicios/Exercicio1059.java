/* 23-09-2022
*/
package br.com.beecrowd.exercicios;
/*Faça um programa que mostre os números pares entre 1 e 100, inclusive. */

public class Exercicio1059 {
    // 1060, 1064, 1061, 1066, 1067
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);

        }

    }
}
