/*
    Fazer um programa para ler quatro valores inteiros A, B, C e D.
    A seguir, calcule e mostre a diferença do produto
    de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
*/

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Variaveis
        int A,B,C,D;
        int DIFERENCA;

        // entrada de dados
        System.out.println("Digite o primeiro valor: ");
        A = input.nextInt();
        input.nextLine();

        System.out.println("Digite o segundo valor: ");
        B = input.nextInt();

        System.out.println("Digite o terceiro valor: ");
        C = input.nextInt();

        System.out.println("Digite o quarto valor: ");
        D = input.nextInt();

        // processamento de dados
        DIFERENCA = (A*B-C*D);

        // saída de dados
        System.out.println("DIFERENCA: "+DIFERENCA);
    }
}
