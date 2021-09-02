package Lista7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista7Exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int contador = 1;
        int totalDeNumeros = 5;
        int valorDigitadoUsuario;

        while (contador <= totalDeNumeros) {
            System.out.println("Por favor, digite o numero " + contador + " :");
            valorDigitadoUsuario = leitor.nextInt();
            numeros.add(valorDigitadoUsuario);
            contador++;
        }
        System.out.println(numeros);

        for (Integer referencia: numeros) {
            System.out.println(referencia);
        }
    }
}
