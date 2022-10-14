package br.com.beecrowd.exercicios;

import java.util.Scanner;

public class Exercicio1066 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int positivos=0;
        int negativos = 0;
        int pares=0;
        int impares=0;

        for (int i = 0; i < 5; i++) {
            int valor = teclado.nextInt();
            if(valor > 0){
                positivos+= 1;
                
            }else if (valor < 0 && valor != 0){
                negativos+=1;
            }
            if(valor%2==0){
                pares+=1;
            }else{
                impares+=1;
            }
            
        }
        System.out.println(pares+" valor(es) par(es)");
        System.out.println(impares+" valor(es) impar(es)");
        System.out.println(positivos+" valor(es) positivo(s)");
        System.out.println(negativos+" valor(es) negativo(s)");
        teclado.close();
    }
}
