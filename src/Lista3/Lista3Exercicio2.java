package br.com.zup;

import java.util.Scanner;

public class Lista3Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double valorTotal = 0;
        double valorDoDesconto = 0; //valor do desconto do valor total

        System.out.println("Seja bem vinde ao posto da Comul");
        System.out.println("Por favor, digite G para gasolina e A para álcool");
        String tipoDeCombustivel = leitor.nextLine();
        System.out.println("Digite o valor em litros do quanto você quer abastecer");
        double valorEmL = leitor.nextDouble();

        if (tipoDeCombustivel.equals("G") | tipoDeCombustivel.equals("g")) {
            valorTotal = valorEmL * 2.5f; // o quanto a pessoa vai ter que pagar

            if (valorEmL <= 20 & valorEmL > 0) {
                //calcular o desconto de <20l

                valorDoDesconto = (0.04 * valorTotal);
            } else {
                //calcular o desconto > 20L

                valorDoDesconto = (0.06 * valorTotal);
            }

        } else if (tipoDeCombustivel.equals("A") | tipoDeCombustivel.equals("a")) {

            valorTotal = valorEmL * 1.9f;
            if (valorEmL <= 20 & valorEmL > 0) {
                //calcular valor desconto <20L

                valorDoDesconto = 0.03 * valorTotal;
            } else {
                //calcular o desconto > maior que L

                valorDoDesconto = 0.05 * valorTotal;
            }
            System.out.println("Você precisará pagar: ");
            double valorTotalComDescontos = valorTotal - valorDoDesconto;
            System.out.printf("%.2f", valorTotalComDescontos);

        }
    }


}

