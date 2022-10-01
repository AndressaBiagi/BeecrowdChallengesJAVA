package br.com.beecrowd.exercicios;
import java.util.Scanner;

public class Exercicio1005 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double mediaA = (a*3.5);
        double mediaB = (b*7.5);
        
        System.out.printf("MEDIA = %.5f", (mediaA+mediaB)/11);
    }
}

