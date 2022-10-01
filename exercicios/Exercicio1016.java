package br.com.beecrowd.exercicios;
import java.util.Scanner;

public class Exercicio1016 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int distCarrosYParaX = teclado.nextInt();
        System.out.println(distCarrosYParaX*2 + " minutos");
        teclado.close();

    }
}


