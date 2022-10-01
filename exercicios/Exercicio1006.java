package br.com.beecrowd.exercicios;
import java.util.Scanner;

public class Exercicio1006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
       double a = teclado.nextDouble();
       double b = teclado.nextDouble();
       double c = teclado.nextDouble();
       double mediaA = (a*2);
       double mediaB = (b*3);
       double mediaC = (c*5);
       
       System.out.printf("MEDIA = %.1f", (mediaA+mediaB+mediaC)/10);
       teclado.close();

    }
}

