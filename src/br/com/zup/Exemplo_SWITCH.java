package br.com.zup;

import java.util.Scanner;

public class Exemplo_SuitCase {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite os seguintes valores para seus respectivos dias da semana");
        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda");
        System.out.println("3 - Terça");
        System.out.println("4 - Quarta");
        System.out.println("5 - Quinta");
        System.out.println("6 - Sexta");
        System.out.println("7 - Sábado");

        System.out.println("Digite o dia que você deseja: ");

        double diaDesejado = leitor.nextDouble();
    }
}
