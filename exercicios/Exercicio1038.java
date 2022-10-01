package br.com.beecrowd.exercicios;
import java.util.Scanner;

public class Exercicio1038 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int codigoItem = teclado.nextInt();
        int quantidadeItens = teclado.nextInt();
        
        if (codigoItem == 1) {
            double valorConta = quantidadeItens*4;
            System.out.printf("Total: R$ %.2f\n", valorConta);
        }else if (codigoItem == 2) {
            double valorConta = quantidadeItens*4.50;
            System.out.printf("Total: R$ %.2f\n", valorConta);
        }else if (codigoItem == 3) {
            double valorConta = quantidadeItens*5;
            System.out.printf("Total: R$ %.2f\n", valorConta);
        }else if (codigoItem == 4) {
            double valorConta = quantidadeItens*2;
            System.out.printf("Total: R$ %.2f\n", valorConta);
        }else if (codigoItem == 5) {
            double valorConta = quantidadeItens*1.50;
            System.out.printf("Total: R$ %.2f\n", valorConta);
        }

        
    }
}
//receber o código do item
//receber a quantidade do item
//somar a quantidade e o valor do item correspondente
//mostrar o total da conta .2f
