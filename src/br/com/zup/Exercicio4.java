package br.com.zup;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        // Os gestores da Zup resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calcula os reajustes. Portanto, faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
        //Salários até R$ 280,00 (incluindo), receberão aumento de 20%
        //Salários entre R$ 280,00 e R$ 700,00 (incluindo), receberão aumento de 15%
        //Salários entre R$ 700,00 e R$ 1500,00 (incluindo), receberão aumento de 10%
        //Salários de R$ 1500,00 em diante, receberão aumento de 5%

        Scanner leitor = new Scanner(System.in);

        System.out.println("Olá, estou aqui para te ajudar a entender o seu aumento de salário, vamos lá?");
        System.out.println("Informe pra mim o valor do seu salário atual");
        double valorAtual = leitor.nextDouble();
        System.out.println("Ok, baseado na sua resposta:");

        double aumento20 = 0.20;
        double soma20 = valorAtual * aumento20;
        double valorCorrigido20 = valorAtual + soma20;

        double aumento15 = 0.15;
        double soma15 = valorAtual * aumento15;
        double valorCorrigido15 = valorAtual + soma15;

        double aumento5 = 0.05;
        double soma5 = valorAtual * aumento5;
        double valorCorrigido5 = valorAtual + soma5;

        if (valorAtual <= 280){
            System.out.println("O seu salário era: R$" + valorAtual);
            System.out.println("Você recebeu um aumento de 20%");
            System.out.println("Em números, foi um aumento de R$" + soma20);
            System.out.println("O que resultou em um salário corrigido de: R$" + valorCorrigido20);
        }
        else if (valorAtual > 280 & valorAtual <= 700){
            System.out.println("O seu salário era: R$" + valorAtual);
            System.out.println("Você recebeu um aumento de 15%");
            System.out.println("Em números, foi um aumento de R$" + soma15);
            System.out.println("O que resultou em um salário corrigido de: R$" + valorCorrigido15);
        }
        else if (valorAtual > 1500){
            System.out.println("O seu salário era: R$" + valorAtual);
            System.out.println("Você recebeu um aumento de 5%");
            System.out.println("Em números, foi um aumento de R$" + soma5);
            System.out.println("O que resultou em um salário corrigido de: R$" + valorCorrigido5);
        }
    }
}
