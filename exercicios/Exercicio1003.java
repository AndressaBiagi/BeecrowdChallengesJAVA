package br.com.beecrowd.exercicios;
import java.util.Scanner;

public class Exercicio1003 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int soma = a+b;
        
        System.out.println("SOMA = "+soma);
    }
}
