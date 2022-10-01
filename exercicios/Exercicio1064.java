package br.com.beecrowd.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;
/*Leia 6 valores. Em seguida, mostre quantos destes valores digitados
 foram positivos. Na próxima linha, deve-se mostrar a média de todos os 
 valores positivos digitados, com um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante.
 Pelo menos um destes números será positivo.

Saída
O primeiro valor de saída é a quantidade de valores positivos. A próxima 
linha deve mostrar a média dos valores positivos digitados. */
public class Exercicio1064 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        int positivos=0;
        float soma=0;
        float media;
        for (int i = 0; i < 6; i++) {
            float valor = teclado.nextFloat();
            if(valor > 0){
                positivos+= 1;
                soma+=valor;
            }
            
        }
        media = soma/positivos;
        System.out.println(positivos+" valores positivos");
        System.out.printf("%.1f\n", media);
        teclado.close();     
        
    }
}
