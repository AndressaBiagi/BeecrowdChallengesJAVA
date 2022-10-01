package br.com.beecrowd.exercicios;
import java.util.Scanner;

public class Exercicio1017 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int tempoViagem = teclado.nextInt();
        int velocidadeMedia = teclado.nextInt();

        double distTotal = tempoViagem*velocidadeMedia;


        System.out.printf("%.3f", distTotal/12);
        teclado.close();

    }
}
