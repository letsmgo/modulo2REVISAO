package br.com.zup;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor digite o numero 1");
        double numero1 = leitor.nextDouble();

        System.out.println("Por favor digite o numero 2");
        double numero2 = leitor.nextDouble();

        if(numero1 > numero2){
            System.out.println("O numero 1 é o maior");
        }

        else{
            System.out.println("O numero 2 é o maior");
        }
    }
}
