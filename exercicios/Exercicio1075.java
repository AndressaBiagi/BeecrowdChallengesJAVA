package br.com.beecrowd.exercicios;
import java.util.Scanner;

public class Exercicio1075 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();

        for (int i = 1; i <= 10000; i++){
            if (i % n == 2){
                System.out.println();

                // o proprio exemplo de saida, nao faz sentido nenhum
            }
        }
    }
}
