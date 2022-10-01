package br.com.beecrowd.exercicios;
import java.util.Scanner;

public class Exercicio1015 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        float x = teclado.nextFloat();
        float y = teclado.nextFloat();
        float x2 = teclado.nextFloat();
        float y2 = teclado.nextFloat();

        float distancia = (x2-x)*(x2-x) + (y2-y)*(y2-y);
        
        System.out.printf("%.4f", Math.sqrt(distancia));
        
    }
}
//receber x e y floats
//receber x2 e y2 float
// calcular usando a formula
//mostrar .4f
/* float x = teclado.nextFloat();
float y = teclado.nextFloat();
float x2 = teclado.nextFloat();
float y2 = teclado.nextFloat();

double p1 = x2-x;
double p2 = y2-y;

double distancia = (Math.pow(p1, 2) + Math.pow(p2, 2)); */