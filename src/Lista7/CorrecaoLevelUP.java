package Lista7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CorrecaoLevelUP {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String, String> alunos = new  HashMap<String, String>();
        boolean chave = true;

        System.out.println("Seja bem vindo ao Estrelas Classroom");
        int opcao = 0;

        while (chave == true) {
            //Menu - apresentar uma série de opcoes pro usuario
            System.out.println("Digite 1: Para cadastrar um aluno;");
            System.out.println("Digite 2: Para sair do gerenciador.");
            opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1) {
                //cadastrar um aluno
                System.out.println("Digite o nome completo do aluno: ");
                String nome = leitor.nextLine();
                System.out.println("Digite o seu telefone: ");
                String telefone = leitor.nextLine();
                System.out.println("Digite seu e-mail: ");
                String email = leitor.nextLine();

                //fazendo o cadastro
                alunos.put(email + " ", " Nome: " + nome + " Telefone: " + telefone);
                System.out.println(alunos);

            }else if (opcao == 2) {
                // sair do menu
                chave = false;
            }else {
                System.out.println("Digite um valor válido");
            }
        }


    }

}