package br.com.beecrowd.exercicios;
import java.util.Scanner;

public class Exercicio1007 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
	   
	   int a = teclado.nextInt();
       int b = teclado.nextInt();
       int c = teclado.nextInt();
       int d = teclado.nextInt();

	   System.out.println("DIFERENÇA = " + (a*b - c*d));
    }
}
