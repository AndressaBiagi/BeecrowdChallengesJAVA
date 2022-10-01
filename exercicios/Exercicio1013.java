package br.com.beecrowd.exercicios;
import java.util.Scanner;

public class Exercicio1013 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();

        int maiorAB = (a+b+Math.abs(a-b))/2;
        int maiorTodos = (maiorAB+c+Math.abs(maiorAB-c))/2;
        System.out.println(maiorTodos+ " eh o maior");
        teclado.close();

    }
}

//receber a, b e c; 
//usar a formula para caucular o maior entre a e b
// achar o maior entre o resultado e c
