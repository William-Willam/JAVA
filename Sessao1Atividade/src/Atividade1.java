/*
    Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
    mensagem explicativa, conforme exemplos.

    Exemplos:

    entrada: 10, 40
    saida: soma 40

    entrada: -30,10
    saida: soma: -20

    entrada: 0, 0
    saida: soma = 0

*/

import java.util.Scanner;

public class Atividade1{
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Variaveis
        int num1, num2;
        int soma;

        // entrada de dados
        System.out.println("Primeiro numero: ");
        num1= input.nextInt();
        input.nextLine();

        System.out.println("Segundo numero: ");
        num2 = input.nextInt();
        input.nextLine();

        // processamento de dados
        soma = num1 + num2;

        // Saída de dados
        System.out.println("Soma: "+soma);

        // fechar o scanner
        input.close();
    }

}
