package br.com.beecrowd.exercicios;
import java.util.Scanner;

public class Exercicio1037 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        float num = teclado.nextFloat();

        if (num >= 0 && num <= 25){
            System.out.println("Intervalo [0,25]");
        }else if (num >= 25.00001 && num <= 50.0000) {
            System.out.println("Intervalo (25,50]");

        }else if (num >= 50.00001 && num <= 75.0000) {
            System.out.println("Intervalo (50,75]");

        }else if (num >= 75.00001 && num <= 100.0000) {
            System.out.println("Intervalo (75,100]");
        
        }else {
            System.out.println("Fora de intervalo");
        }

    }
}
//receber um valor
// se o num for de 0 a 25.0000 mostrar