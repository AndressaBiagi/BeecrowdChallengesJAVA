package br.com.beecrowd.exercicios;
import java.util.Scanner;

public class Exercicio1008 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

	   int numFuncionario = teclado.nextInt(), horasTrabalhadas = teclado.nextInt();
		float valorHora = teclado.nextFloat();

		System.out.println("NUMBER = " + numFuncionario);
		System.out.printf("SALARY = U$ %.2f\n", (valorHora*horasTrabalhadas)); 


	   //receber numero de funcionario
	   //receber o numero de horas trabalhadas
	   //receber o valor da hora
	   //calcular o salario total
    }
}

