package Lista7;

import java.util.HashMap;
import java.util.Scanner;

public class Lista7ExercicioLEVELUP {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        HashMap<String, String> alunos = new HashMap<>();
        int contador = 1;
        int maximoDeAlunos = 100;
        String email;
        String nomes;
        String recebidos = "";


        System.out.println("\n Bem vinde ao gerenciador de Alunos do Colégio Estrelas!");
        System.out.println("Aqui você pode checar dados, incluir dados e excluir dados. \n");

        System.out.println("Deseja incluir um alune? Digite:  'sim' para adicionar e 'não' para encerrar; ");
        recebidos = leitor.nextLine();

        while (contador <= maximoDeAlunos) {
            if (recebidos.equals("sim")) {
                System.out.println("Digite o e-mail do aluno; ");
                email = leitor.nextLine();
                System.out.println("Digite o nome e o telefone do aluno");
                nomes = leitor.nextLine();
                alunos.put(email, nomes);
                System.out.println("O aluno foi incluído e o gerenciador encontra-se com as seguintes informações: ");
                System.out.println(alunos);
                System.out.println("\n Deseja incluir outro aluno? Digite 'sim' caso queira adicionar, 'remover' para" +
                        " remover um aluno ou 'não' para encerrar o gerenciador. ");
                recebidos = leitor.nextLine();
            }
            else if (recebidos.equals("remover")) {
                System.out.println("Digite o e-mail do aluno que você deseja remover: ");
                email = leitor.nextLine();
                alunos.get(email);
                System.out.println(alunos.get(email));
                System.out.println("Confirme os dados e digite novamente o e-mail do aluno para remover ou digite 'não'" +
                        "para encerrar o gerenciador. ");
                email = leitor.nextLine();
                alunos.remove(email);
                System.out.println("Aluno removido com sucesso!");
                System.out.println("O gerenciador encontra-se com as seguintes informações: ");
                System.out.println(alunos);
                System.out.println("Deseja remover mais algum aluno? Digite 'remover' para continuar ou 'não' para sair");
                recebidos = leitor.nextLine();
            }
            contador++;
        }
        if (recebidos.equals("não")) {
            System.out.println("Gerenciador finalizado com sucesso");
        }


    }
}
