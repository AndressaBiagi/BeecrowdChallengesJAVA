/*26-09-2022
 * Exercicio 1235, do site Beecrowd, feito durante os estudos 
 * da academia mesttra no programa 1000DEVS 2022.
 */
package br.com.beecrowd.exercicios;

import java.util.Scanner;
//1071,1075,1079
public class Exercicio1235 {
    
    public static String LerLinhasTeste(Scanner teclado) {

        String linhaTeste = teclado.nextLine(); // nextLine(): faz a leitura até a quebra da linha.
        return linhaTeste;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int N = teclado.nextInt();
        teclado.nextLine();
        String textoCorreto = "";
        int cont = 0;

        while (cont < N){
            cont++;
            String linha = LerLinhasTeste(teclado);
            int qtdeCaracteres = linha.length();

            for (int i = (qtdeCaracteres / 2) - 1; i >= 0; i--) {
                textoCorreto += linha.charAt(i);
            }
            for (int i = (qtdeCaracteres - 1); i >= (qtdeCaracteres / 2); i--) {
                textoCorreto += linha.charAt(i);
            }
            System.out.println(textoCorreto);
            textoCorreto = "";
        }


    }
}
