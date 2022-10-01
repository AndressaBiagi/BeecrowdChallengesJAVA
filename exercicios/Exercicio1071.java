package br.com.beecrowd.exercicios;
import java.util.Scanner;

public class Exercicio1071 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x = teclado.nextInt();
        int y = teclado.nextInt();
        int soma=0;
        
        if(x < y){
            if (x % 2 != 0){
                for (int i = x+1; i < y; i++){
                    if(i % 2 != 0){
                        soma+=i;
                    }
                }
            }else{
                for (int i = x; i < y; i++){
                    if(i % 2 != 0){
                        soma+=i;
                    }
                }
            }
            
        }else if (y < x){
            if (y % 2 != 0){
                for (int i = y+1; i < x; i++){
                    if(i % 2 != 0){
                        soma+=i;
                    }
                }
            }else{
                for (int i = y; i < x; i++){
                    if(i % 2 != 0){
                        soma+=i;
                    }
                }
            }
        }
        System.out.println(soma);
    }
}
