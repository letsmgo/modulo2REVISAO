package Lista7;

import java.util.Scanner;

// numeros primos só dividem por 1 e por ele mesmo;
// só existe  2 divisores em numeros primos ;
// preciso dividir

public class Lista7Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero;
        int contador = 0;
        System.out.println("Digite um numero: ");
        numero = leitor.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.println("O número digitado é primo.");
        } else {
            System.out.println("O número digitado não é primo.");
        }
    }
}