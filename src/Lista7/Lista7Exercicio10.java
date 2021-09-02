package Lista7;

import java.util.Scanner;

public class Lista7Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double mediaFinal;
        double soma;


        System.out.println("Bem vindo ao gerenciador de notas! \n Aqui iremos realizar a média de suas notas.");
        System.out.println("Por favor digite a primeira nota: ");
        nota1 = leitor.nextDouble();

        System.out.println("Registrei a informação, por favor, digite a segunda nota: ");
        nota2 = leitor.nextDouble();

        System.out.println("Registrei a informação, por favor, digite a terceira nota: ");
        nota3 = leitor.nextDouble();

        System.out.println("Registrei a informação, por favor, digite a quarta nota: ");
        nota4 = leitor.nextDouble();

        soma = nota1 + nota2 + nota3 + nota4;

        mediaFinal = soma / 4;

        System.out.println("Após verificar suas notas foram: " + nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4 + ".\n");
        System.out.println("E a média final é: " + mediaFinal + ".");

    }
}
