package br.com.zup;

import java.util.Scanner;

public class Lista4Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contador = 0;
        double soma = 0;
        double lendoUsuario;
        int qtdRepeticao = 5;

        while (contador <= qtdRepeticao) {
            System.out.println("Digite o numero " + contador);
            lendoUsuario = leitor.nextDouble();

            soma = soma + lendoUsuario;
            System.out.println("SOMA DEPOIS DE LER " + contador + "SOMA DOS NUMEROS :" + soma);
            contador++;
        }
        System.out.println();
        System.out.println("Você chegou ao fim");
        System.out.println("SOMA TOTAL: " + soma);

    }
}
