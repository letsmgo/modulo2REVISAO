package Lista7;

import java.util.Scanner;

public class Lista7Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int primeiroNumero;
        int segundoNumero;
        int contador = 0;

        System.out.println("Por favor, digite um numero: ");
        primeiroNumero = leitor.nextInt();

        System.out.println("Por favor, digite um numero maior que o anterior: ");
        segundoNumero = leitor.nextInt();

        for (int i = primeiroNumero; i < segundoNumero; i++) {
            System.out.println("Os números entre eles são: " + i);

            contador++;
        }
    }
}
