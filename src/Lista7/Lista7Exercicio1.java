package Lista7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista7Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Double> valores = new ArrayList<>();

        double contador = 1;
        double qtdProdutos = 3;
        double valorProdutos;

        System.out.println();
        System.out.println("Bem vinde ao economizando mais! Seu parceiro para decidir qual produtor comprar, com o melhor valor");


        while (contador <= qtdProdutos) {
            System.out.println("Digite o valor do produto " + contador + " :");
            valorProdutos = leitor.nextDouble();
            valores.add(valorProdutos);

            contador++;
        }
        if (valores.get(0) < valores.get(1) & valores.get(0) < valores.get(2)){
            System.out.println("O Primeiro produto é o mais barato, sende assim, opte pela compra dele");
        }
        else if (valores.get(1) < valores.get(0) & valores.get(1) < valores.get(2)) {
            System.out.println("O segundo produto é o mais barato, sendo assim, opte pela compra dele");
        }
        else {
            System.out.println("O terceiro produto é o mais barato, sendo assim, opte pela compra dele");
        }
    }
}
