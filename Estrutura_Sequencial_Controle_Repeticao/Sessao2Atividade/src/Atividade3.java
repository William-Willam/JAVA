import java.util.Scanner;

public class Atividade3 {

        /*
        * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
        * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.
        * Atenção: os números devem poder ser digitados em
        * ordem crescente ou decrescente.
        */

    public static void main(String[] args) {
        // Leitura de Teclado
        Scanner input = new Scanner(System.in);

        // Variaveis
        int numeroA;
        int numeroB;

        // Entrada de dados
        System.out.println("Digite o primeiro número: ");
        numeroA = input.nextInt();
        input.nextLine();

        System.out.println("Digite o segundo número: ");
        numeroB = input.nextInt();

        // processamento e saída de dados
        if (numeroA % numeroB == 0 || numeroB % numeroA == 0) {
            System.out.println("SÃO MULTIPLOS!");
        } else {
            System.out.println("Não são MULTIPLOS!");
        }

        input.close();
    }
}
