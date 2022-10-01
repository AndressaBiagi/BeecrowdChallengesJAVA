package br.com.beecrowd.exercicios;
import java.util.Scanner;

public class Exercicio1019 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int totalSeg = teclado.nextInt();

       int horas = totalSeg/3600;
       int minutos = (totalSeg % 3600)/60;
       int segundos = totalSeg % 3600 % 60;

       System.out.println(horas +":"+minutos+":"+segundos);

    }
}

//receber o tempo em segundos
//mostrar ele em horas:minutos:segundos