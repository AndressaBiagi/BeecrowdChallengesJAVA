package br.com.beecrowd.exercicios;
import java.util.Scanner;

public class Exercicio1021 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        float num = teclado.nextFloat();
        int nota100 = (int)num/100;
        int nota50 =(int)(num % 100)/50;
        int nota20 =(int)(num % 100 % 50)/20;
        int nota10 =(int)(num % 100 % 50 % 20)/10;
        int nota5 = (int)(num % 100 % 50 % 20 % 10)/5;
        int nota2 = (int)(num % 100 % 50 % 20 % 10 % 5)/2;
        int moeda1 =(int)(num % 100 % 50 % 20 % 10 % 5 % 2);
        double moeda050 = (num % 100 % 50 % 20 % 10 % 5 % 2)*0.5;
        double moeda025 = (int) (num % 100 % 50 % 20 % 10 % 5 % 2)*0.25;
        double moeda010 = (int) (num % 100 % 50 % 20 % 10 % 5 % 2)*0.1;
        double moeda005 = (int) (num % 100 % 50 % 20 % 10 % 5 % 2)*0.05;
        double moeda001 = (int) (num % 100 % 50 % 20 % 10 % 5 % 2)*0.01;
        

        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");
        
        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda050 + " moeda(s) de R$ 0.50");
        System.out.println(moeda025 + " moeda(s) de R$ 0.25");
        System.out.println(moeda010 + " moeda(s) de R$ 0.10");
        System.out.println(moeda005 + " moeda(s) de R$ 0.05");
        System.out.println(moeda001 + " moeda(s) de R$ 0.01");
    }
}
//receber um valor monetario float .2f
// c