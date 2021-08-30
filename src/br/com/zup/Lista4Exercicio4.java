package br.com.zup;

import java.util.Scanner;

public class EstruturasDeRepeticaoExercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double quantidadeDeNumeros;
        double soma = 0;
        double media = 0;
        int contador = 0;

        System.out.println("Por favor, digite a quantidade de numeros");
        quantidadeDeNumeros = leitor.nextDouble();
        while (contador < quantidadeDeNumeros) {
            System.out.println("Digite um numero: ");
            double valorLidoPeloUsuario = leitor.nextDouble();
            soma = soma + valorLidoPeloUsuario;
            contador++;
        }
        media = soma / quantidadeDeNumeros;

        System.out.println("A média de todos os numeros é: " + media);
    }
}
