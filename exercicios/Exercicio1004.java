package br.com.beecrowd.exercicios;
import java.util.Scanner;

public class Exercicio1004 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
       int a = teclado.nextInt();
       int b = teclado.nextInt();
       System.out.println("PROD = "+ a*b);
       teclado.close();

    }
}

