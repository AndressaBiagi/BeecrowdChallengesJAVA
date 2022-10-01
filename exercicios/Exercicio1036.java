package br.com.beecrowd.exercicios;
import java.util.Scanner;

public class Exercicio1036 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double c = teclado.nextDouble();
        
        double delta = (b*b) - (4*a*c);
        //se delta = 0 --impossivel
        //se delta < 0 -- impossivel

        if ((a==0) || (delta > 0)) {
            System.out.println("Impossivel calcular");

        }else{
            double R1 =  (((-1*b) + Math.pow(delta, 0.5))/(2*a));
            double R2 =  (((-1*b) - Math.pow(delta, 0.5))/(2*a));

            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
            
        }

        
    

    }
}
//receber 3 valores double
//se possivel, calcular as raizes da equação bhaskara
//se nao mostrar 'impossivel calcular'