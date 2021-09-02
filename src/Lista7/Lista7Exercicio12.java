package Lista7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista7Exercicio12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int contador = 1;
        int numeroTotal = 5;
        int numeroInf;
        int soma = 0;
        int mult = 1;
        System.out.println("\n Bem vinde a programação inicial!\n");
        System.out.println("Me informe 5 numeros!");

        while (contador <= numeroTotal){
            System.out.println("Digite o numero: " + contador);
            numeroInf = leitor.nextInt();
            numeros.add(numeroInf);

            contador++;
        }

        for ( Integer referencia: numeros) {
            soma = soma + referencia;
            mult = mult * referencia;
        }
        System.out.println("\n A soma dos numeros é: ");
        System.out.println(soma + "\n");

        System.out.println("A multiplicação dos números é: ");
        System.out.println(mult + "\n");

        System.out.println("E os numero informados foram: ");
        System.out.println(numeros);
    }
}
