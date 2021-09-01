package Lista7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista7Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> tabuada = new ArrayList<>();

        int valorInformado;

        System.out.println("Digite o numero que você deseja conhecer a tabuada :");
        valorInformado = leitor.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(valorInformado + " x " + i + " = " + (valorInformado * i));

        }



    }
}
