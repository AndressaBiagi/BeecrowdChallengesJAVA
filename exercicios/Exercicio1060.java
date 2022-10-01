//01-10-2022
package br.com.beecrowd.exercicios;

import java.util.Scanner;

/* Faça um programa que leia 6 valores. 
 * Estes valores serão somente negativos ou positivos 
 * (desconsidere os valores nulos). A seguir, mostre a 
 * quantidade de valores positivos digitados.
 * 
 * Entrada
 * Seis valores, negativos e/ou positivos.
 * 
 * Saída
 * Imprima uma mensagem dizendo quantos valores positivos 
 * foram lidos.*/
public class Exercicio1060 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int positivos=0;
        for (int i = 0; i < 6; i++) {
            float valor = teclado.nextFloat();
            if(valor > 0){
                positivos+= 1;
                
            }
            
        }
        System.out.println(positivos+" valores positivos");
        teclado.close();
    }
}
