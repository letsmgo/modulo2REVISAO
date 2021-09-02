package Lista7;

import java.util.Scanner;

public class Lista7Exercicio13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double kgDePeixe;
        double kgMaximo = 50;
        double kgExcedente;
        double multaEstado = 4;
        double vlrMulta;

        System.out.println("Olá senhor João Papo-de-Pescador, bem vindo ao cálculo do seu rendimento diário, vamos começar?");
        System.out.println("\n Me informe a quantia em quilos de pescados de hoje: ");
        kgDePeixe = leitor.nextDouble();



        System.out.println("Baseado nas informações senhor João Papo-de-Pescador, foi pescado: " + kgDePeixe +"kg");

        if (kgDePeixe > kgMaximo) {
            kgExcedente = kgDePeixe - kgMaximo;
            vlrMulta = kgExcedente * multaEstado;
            System.out.println("O senhor trouxe um excedente de: " + kgExcedente + "kg");
            System.out.println("Deste modo foi gerado uma multa no valor de : R$" + vlrMulta + " a ser pago ao Estado de São Paulo.");
        }
        else {
            System.out.println("Não houve excedentes no dia de hoje! Até a proxima.");
        }

    }
}
