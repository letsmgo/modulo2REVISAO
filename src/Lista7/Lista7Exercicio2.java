package Lista7;

import java.util.Scanner;

public class Lista7Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite os seguintes valores para seus respectivos dias da semana");
        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda");
        System.out.println("3 - Terça");
        System.out.println("4 - Quarta");
        System.out.println("5 - Quinta");
        System.out.println("6 - Sexta");
        System.out.println("7 - Sábado");

        System.out.println("Digite o dia que você deseja: ");

        double diaDesejado = leitor.nextDouble();

        if (diaDesejado == 1){
            System.out.println("O dia selecionado foi o Domingo");
        }
        else if (diaDesejado == 2){
            System.out.println("O dia selecionado foi a Segunda");
        }
        else if (diaDesejado == 3){
            System.out.println("O dia selecionado foi a Terça");
        }
        else if (diaDesejado == 4){
            System.out.println("O dia selecionado foi a Quarta");
        }
        else if (diaDesejado == 5){
            System.out.println("O dia selecionado foi a Quinta");
        }
        else if (diaDesejado == 6){
            System.out.println("O dia selecionado foi a Sexta");
        }
        else if (diaDesejado == 7){
            System.out.println("O dia selecionado foi a Sábado");
        }
        else {
            System.out.println("Valor inválido, por favor digite novamente");
        }


    }
}
