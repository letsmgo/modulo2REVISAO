package br.com.zup;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //Faça um programa que receba duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
        //A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
        //A mensagem "Reprovado", se a média for menor do que sete;
        //A mensagem "Aprovado com Distinção", se a média for igual a dez.

        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem vindo ao cálculo de suas notas!");
        System.out.println("Por gentileza, digite sua primeira nota: ");
        double primeiraNota = leitor.nextDouble();

        System.out.println("Recebi a informação, por gentileza digite sua segunda nota: ");
        double segundaNota = leitor.nextDouble();

        double soma = primeiraNota + segundaNota;
        double media = soma / 2;

        if (media >= 7 & media <= 9){
            System.out.println("Parabéns você foi APROVADO");
        }
        if (media < 7){
            System.out.println("Que pena, voce foi REPROVADO");
        }
        else if (media == 10){
            System.out.println("Parabéns, voce foi APROVADO com distinção!");
        }
    }
}
