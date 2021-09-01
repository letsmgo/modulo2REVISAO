package br.com.zup;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Lista3Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contadorDeRespostas = 0;

        //EXIBIR AS PERGUNTAS E ARMAZENAR AS RESPOSTAS
        System.out.println("Olá, sou agente do FBI");
        System.out.println("Vamos te fazer algumas perguntas.");
        System.out.println("Responda S para sim, e N para não");

        //FAZENDO A PRIMEIRA PERGUNTA
        System.out.println("Você telefonou para a vítima?");
        String resposta = leitor.nextLine();
        if (resposta.equals("S")){
            contadorDeRespostas = contadorDeRespostas + 1;
        }

        //FAZENDO SEGUNDA PERGUNTA
        System.out.println("Esteve no local do crime?");
        resposta = leitor.nextLine();
        if (resposta.equals("S")){
            contadorDeRespostas = contadorDeRespostas + 1;
        }

        //FAZENDO TERCEIRA PERGUNTA
        System.out.println("Mora perto da vítima?");
        resposta = leitor.nextLine();
        if (resposta.equals("S")){
            contadorDeRespostas = contadorDeRespostas + 1;
        }

        //FAZENDO QUARTA PERGUNTA
        System.out.println("Devia para a vítima?");
        resposta = leitor.nextLine();
        if (resposta.equals("S")){
            contadorDeRespostas = contadorDeRespostas + 1;
        }

        //FAZENDO A QUINTA PERGUNTA
        System.out.println("Já trabalhou com a vítima?");
        resposta = leitor.nextLine();
        if (resposta.equals("S")){
            contadorDeRespostas = contadorDeRespostas + 1;
        }
        switch (contadorDeRespostas){

            case 2:
                System.out.println("Preciso que você chame um advogado, você é considerado suspeito!");
                break;
            case 3:
                System.out.println("Você é considerado suspeito! Oriento que chame um advogado");
                break;
            case 4:
                System.out.println("Você é considerado cumplice! Oriento que chame um advogado");
                break;
            case 5:
                System.out.println("Você é considerado assassino! Oriento que chame um advogado");
                break;
            default:
                System.out.println("Você é inocente, perdoe o incomodo");
                break;
        }
    }
}
