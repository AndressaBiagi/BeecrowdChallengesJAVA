//12-10-2022
package br.com.beecrowd.exercicios;

import java.util.Scanner;

/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar
 * uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando 
 * se os valores lidos são múltiplos entre si. */

public class Exercicio1044 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int A = teclado.nextInt();
        int B = teclado.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");

        }
    }
}
