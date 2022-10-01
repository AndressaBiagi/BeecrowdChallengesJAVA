package br.com.beecrowd.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1040 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double N1 = teclado.nextDouble();
        double N2 = teclado.nextDouble();
        double N3 = teclado.nextDouble();
        double N4 = teclado.nextDouble();

        double media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

        System.out.println("Media: " + df.format(media));

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");

        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");

            double notaExame = teclado.nextDouble();
            System.out.println("Nota do exame: " + df.format(notaExame));

            double mediaFinal = (media + notaExame) / 2;

            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + df.format(mediaFinal));
            
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        }

    }
}
