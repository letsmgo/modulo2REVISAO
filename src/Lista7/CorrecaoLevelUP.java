package Lista7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CorrecaoLevelUP {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String, String> alunos = new HashMap<String, String>();
        boolean chave = true;

        System.out.println("Seja bem vindo ao Estrelas Classroom \n");
        int opcao = 0;

        while (chave == true) {
            //Menu - apresentar uma série de opcoes pro usuario
            System.out.println("\n Digite 1: Para cadastrar um aluno;");
            System.out.println("Digite 2: Para visualizar os alunos do gerenciador.");
            System.out.println("Digite 3: Para remover um aluno");
            System.out.println("Digite 4: Para sair do gerenciador.");

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
                alunos.put(" " + email + " ", " Nome: " + nome + " Telefone: " + telefone);
                System.out.println(alunos);

            } else if (opcao == 2) {
                for (String chaveAluno : alunos.keySet()) {
                    System.out.println("Contato: " + alunos.get(chaveAluno) + "Email: " + chaveAluno);
                }
            } else if (opcao == 3) {
                System.out.println("Digite o e-mail a ser deletado: ");
                String emailDeletado = "";
                String emailASerDeletado = leitor.nextLine();
                for (String emailAluno : alunos.keySet()) {
                    if (emailAluno.equals(emailASerDeletado)) {
                        System.out.println("E-mail deletado com sucesso!");
                        emailDeletado =emailASerDeletado;
                        // break; possibilidade para parar o loop
                    }
                }
                alunos.remove(emailASerDeletado);
            }
            else if (opcao == 4) {
                // sair do menu
                chave = false;
                System.out.println("Gerenciador finalizado com sucesso");
            } else {
                System.out.println("Digite um valor válido");
            }
        }


    }

}