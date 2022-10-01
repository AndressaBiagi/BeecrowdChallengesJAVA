package br.com.beecrowd.exercicios;
import java.util.Scanner;

public class Exercicio1014 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int distTotal = teclado.nextInt();
        float combustivelGasto = teclado.nextFloat();

        float consumoMedio = (distTotal/combustivelGasto);

        System.out.printf("%.3f km/l\n", consumoMedio);

    }
}
//receber a distancia total
//receber o total de combustivel gasto
//calcular o consumo medio .3f