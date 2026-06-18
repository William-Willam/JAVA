import java.util.Scanner;

public class Atividade2 {

    // Fazer um programa para ler um número inteiro
    // e dizer se este número é par ou ímpar.

    public static void main(String[] args) {
        // Leitura de dados
        Scanner input = new Scanner(System.in);

        // Variaveis
        int numero;

        // entrada de dados
        System.out.println("Digite um numero: ");
        numero = input.nextInt();

        // processamento e saida de dados
        if (numero % 2 == 0){
            System.out.println("PAR");
        }
        else{
            System.out.println("IMPAR");
        }

        input.close();
    }
}
