//12-10-2022
package br.com.beecrowd.exercicios;

import java.util.Scanner;

/*Leia 2 valores com uma casa decimal (x e y), que devem representar as 
 * coordenadas de um ponto em um plano. A seguir, determine qual o quadrante 
 * ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na 
 * origem (x = y = 0). */
public class Exercicio1041 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float x = teclado.nextFloat();
        float y = teclado.nextFloat();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");

        } else if (x > 0 && y < 0) {
            System.out.println("Q4");

        } else if (y < 0 && x < 0) {
            System.out.println("Q3");

        } else if (y > 0 && x < 0) {
            System.out.println("Q2");

        }

    }
}
