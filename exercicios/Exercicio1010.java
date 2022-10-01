package br.com.beecrowd.exercicios;
import java.util.Scanner;

public class Exercicio1010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

		int codigoPeca = teclado.nextInt();
		int qtdPecas = teclado.nextInt();
		float valorPeca = teclado.nextFloat();
		int codigoPeca2 = teclado.nextInt();
		int qtdPecas2 = teclado.nextInt();
		float valorPeca2 = teclado.nextFloat();

		float totalCompra = (valorPeca*qtdPecas)+(valorPeca2*qtdPecas2);
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalCompra);
		
		teclado.close();

    }
}

