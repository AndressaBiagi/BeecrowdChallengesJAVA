package br.com.beecrowd.exercicios;
import java.util.Scanner;

public class Exercicio1020 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int totaldias = teclado.nextInt();

       int anos = totaldias/365;
       int meses = (totaldias % 365)/30;
       int dias = totaldias % 365 % 30;

       System.out.println(anos+ " ano(s)\n" +meses+ " mes(es)\n" +dias+ " dia(s)");
       teclado.close();

    }
}
//
