import java.util.Scanner;

public class Atividade1 {

    // Fazer um programa para ler um número inteiro,
    // e depois dizer se este número é negativo ou não.

    public static void main(String[] args) {
        // Leitura do teclado
        Scanner input = new Scanner(System.in);

        // Variaveis
        int numero;

        // entrada de dados
        System.out.println("Digite um numero: ");
        numero = input.nextInt();

        // processamento e saida de dados
        if (numero > 0){
            System.out.println("Não é negativo!");
        }
        else{
            System.out.println("É negativo!");
        }

        input.close();
    }
}
