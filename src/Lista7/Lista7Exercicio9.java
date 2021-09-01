package Lista7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();

        int contador = 1;
        int contadorExibicao = 9;
        int finalDeExibicao = 0;
        int totalDeNumeros = 10;
        int valorDigitadoUsuario = 0;

        while (contador <= totalDeNumeros) {
            System.out.println("Digite o número " + contador + " :");
            valorDigitadoUsuario = leitor.nextInt();
            numeros.add(valorDigitadoUsuario);
            contador++;
        }
        System.out.println(numeros);

        while (contadorExibicao >= finalDeExibicao) {
            System.out.println(numeros.get(contadorExibicao));
            contadorExibicao--;
        }


    }
}
