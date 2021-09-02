package Lista7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista7Exercicio11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        int contador = 1;
        int numeroTotal = 20;
        int valorDado;

        System.out.println("Bem vindo a programação inicial, aqui vamos testar nossos conhecimentos! ");

        while (contador <= numeroTotal) {
            System.out.println("Digite o numero : " + contador);
            valorDado = leitor.nextInt();
            numeros.add(valorDado);
            if (valorDado % 2 == 0) {
                pares.add(valorDado);
            } else {
                impares.add(valorDado);
            }
            contador++;
        }
        System.out.println("Os numeros informados foram: ");
        System.out.println(numeros);
        System.out.println("Destes são pares: ");
        System.out.println(pares);
        System.out.println("Destes são ímpares: ");
        System.out.println(impares);
    }
}
