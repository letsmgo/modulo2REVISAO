package Lista7;

public class Lista7Exercicio6 {
    public static void main(String[] args) {

        System.out.println("Segue abaixo os numeros ímpares que existem entre 1 e 50 :\n" );

        for (int i = 0; i < 50; i++) {
            if( i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
