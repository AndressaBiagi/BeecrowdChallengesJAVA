package br.com.beecrowd.exercicios;
import java.util.Scanner;

public class Exercicio1011 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

		int raio = teclado.nextInt();
		double pi = 3.14159;
		double volume = (4/3.0)*pi*Math.pow(raio, 3);

		System.out.printf("VOLUME = %.3f\n", volume);

		teclado.close();


    }
}

