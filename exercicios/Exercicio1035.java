package br.com.beecrowd.exercicios;
import java.util.Scanner;

public class Exercicio1035 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int d = teclado.nextInt();

        if (b > c && d > a && c+d > a+b && c >= 0 && d >= 0 && a % 2 == 0){
        
            System.out.println("Valores aceitos");
        }else {
            System.out.println("Valores nao aceitos");
        }

    }
}
//receber 4 valores inteiros
//se B for maior que C && D for maior que A &&
// C+D for maior que A+B && C e D forem positivos && A for par 
// mostrar 'valores aceitos'
// se não, valores não aceitos