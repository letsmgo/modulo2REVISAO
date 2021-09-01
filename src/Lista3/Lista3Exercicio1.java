package br.com.zup;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Lista3Exercicio1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        float qtdHoras;
        float vlrHora;
        float salarioBruto;


        System.out.println("Bem-vinde ao cálculo de folha de pagamento");
        System.out.println("Por gentileza, infome a quantidade de horas trabalhadas: ");
        qtdHoras = leitor.nextFloat();
        System.out.println("Obrigado pela informação!");
        System.out.println("Digite agora, o valor pago por cada hora trabalhada");
        vlrHora = leitor.nextFloat();
        System.out.println("Computei suas informações, sua folha de pagamento é: ");

        salarioBruto = qtdHoras * vlrHora;

       float impostoRenda5 = salarioBruto * 5 / 100;
       float impostoRenda10 = salarioBruto *10 /100;
       float impostoRenda20 = salarioBruto *20 /100;
       float descontoINSS = salarioBruto * 10 /100;
       float fgts = salarioBruto * 11 /100;
       float descontos;
       float salarioLiquido;

        System.out.printf("Salário bruto:  ");
        System.out.printf("(");
        System.out.printf("%.0f", qtdHoras);
        System.out.printf(" * ");
        System.out.printf("%.0f", vlrHora);
        System.out.printf(")");
        System.out.printf("                 :");
        System.out.printf("R$");
        System.out.printf("%.2f",salarioBruto);
        System.out.println();

        if (salarioBruto <= 900){
            System.out.println("(-) IR                                    :  ISENTO");
            System.out.println("(-) INSS  (10%)                           :  R$" + descontoINSS);
            System.out.println("FGTS (11%)                                :  R$" + fgts);
            descontos = descontoINSS;
            System.out.println("Total de descontos                        :  R$" + descontos);
            salarioLiquido = salarioBruto - descontos;
            System.out.println("Salário líquido                           :  R$" + salarioLiquido);

        }
        else if (salarioBruto <= 1500){

            System.out.println("(-) IR  (5%)                              :  R$" + impostoRenda5);
            System.out.println("(-) INSS  (10%)                           :  R$" + descontoINSS);
            System.out.println("FGTS (11%)                                :  R$" + fgts);
            descontos = impostoRenda5 + descontoINSS;
            System.out.println("Total de descontos                        :  R$" + descontos);
            salarioLiquido = salarioBruto - descontos;
            System.out.println("Salário líquido                           :  R$" + salarioLiquido);


        }
        else if (salarioBruto <= 2500){

            System.out.println("(-) IR  (10%)                             :  R$" + impostoRenda10);
            System.out.println("(-) INSS  (10%)                           :  R$" + descontoINSS);
            System.out.println("FGTS (11%)                                :  R$" + fgts);
            descontos = impostoRenda10 + descontoINSS;
            System.out.println("Total de descontos                        :  R$" + descontos);
            salarioLiquido = salarioBruto - descontos;
            System.out.println("Salário líquido                           :  R$" + salarioLiquido);


        }
        else if (salarioBruto > 2500){

            System.out.println("(-) IR  (20%)                               :  R$" + impostoRenda20);
            System.out.println("(-) INSS  (10%)                             :  R$" + descontoINSS);
            System.out.println("FGTS (11%)                                  :  R$" + fgts);
            descontos = impostoRenda20 + descontoINSS;
            System.out.println("Total de descontos                          :  R$" + descontos);
            salarioLiquido = salarioBruto - descontos;
            System.out.println("Salário líquido                             :  R$" + salarioLiquido);


        }
    }
}
