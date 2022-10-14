//12-10-2022
package br.com.beecrowd.exercicios;

import java.util.Scanner;

/*Leia 3 valores inteiros e ordene-os em ordem crescente. 
 * No final, mostre os valores em ordem crescente, uma linha em branco 
 * e em seguida, os valores na sequência como foram lidos. */

public class Exercicio1042 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int primeiroValorLido = teclado.nextInt();
        int segundoValorLido = teclado.nextInt();
        int terceiroValorLido = teclado.nextInt();
        int maior = 0;
        int meio = 0;
        int menor = 0;

        if (primeiroValorLido > segundoValorLido && primeiroValorLido > terceiroValorLido) {
            maior = primeiroValorLido;
            if (segundoValorLido > terceiroValorLido) {
                meio = segundoValorLido;
                menor = terceiroValorLido;
            } else {
                meio = terceiroValorLido;
                menor = segundoValorLido;
            }
        } else if (segundoValorLido > primeiroValorLido && segundoValorLido > terceiroValorLido) {
            maior = segundoValorLido;
            if (primeiroValorLido > terceiroValorLido) {
                meio = primeiroValorLido;
                menor = terceiroValorLido;
            } else {
                meio = terceiroValorLido;
                menor = primeiroValorLido;
            }
        } else if (terceiroValorLido > primeiroValorLido && terceiroValorLido > segundoValorLido) {
            maior = terceiroValorLido;
            if (segundoValorLido > primeiroValorLido) {
                meio = segundoValorLido;
                menor = primeiroValorLido;
            } else {
                meio = primeiroValorLido;
                menor = segundoValorLido;
            }
        }
        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
        System.out.print("\n");
        System.out.println(primeiroValorLido);
        System.out.println(segundoValorLido);
        System.out.println(terceiroValorLido);
    }
}