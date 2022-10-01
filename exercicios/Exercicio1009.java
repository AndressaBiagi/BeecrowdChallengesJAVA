package br.com.beecrowd.exercicios;
import java.util.Scanner;

public class Exercicio1009 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		
		String nomeVendedor = teclado.nextLine();
		double salarioFixo = teclado.nextDouble(), totalVendas = teclado.nextDouble();


		System.out.printf("TOTAL = %.2f\n", (salarioFixo+(totalVendas*0.15))); 

		//receber o nome de um vendedor 
		//receber o salario fixo
		//receber o total de vendas
		//calcular a comissao de 15% que ele irá receber sobre o mes
    }
}
