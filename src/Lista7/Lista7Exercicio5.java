package Lista7;

import java.util.Scanner;

public class Lista7Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double maiorNumero = 0;
        double valorLidoUsuario;
        int contador = 1;

        System.out.println("Quando for solicitado, digite 5 números aleatórios :");
        double qtdValores = 5;

        while (contador <= qtdValores) {
            System.out.println("Digite o numero " + contador + " : ");
            valorLidoUsuario = leitor.nextDouble();

            if (contador == 1) {
                maiorNumero = valorLidoUsuario;
            } else {
                if (valorLidoUsuario >= maiorNumero) {
                    maiorNumero = valorLidoUsuario;
                }
            }
            contador++;
        }

        System.out.println("O maior numero é: " + maiorNumero);

    }
}
