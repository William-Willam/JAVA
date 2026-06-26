package Estrutura_Sequencial_Controle_Repeticao.Sessao3;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

    /*
     * ==================================================
     *              ESTRUTURA DO-WHILE
     * ==================================================
     *
     * Conceito:
     *
     * O do-while é uma estrutura de repetição
     * semelhante ao while.
     *
     * A diferença é que o bloco de comandos é
     * executado pelo menos uma vez antes da
     * condição ser testada.
     *
     *
     * ==================================================
     *                QUANDO UTILIZAR
     * ==================================================
     *
     * Utilizamos o do-while quando desejamos
     * garantir que o bloco de comandos seja
     * executado pelo menos uma vez.
     *
     *
     * ==================================================
     *                    SINTAXE
     * ==================================================
     *
     * do {
     *     comando1;
     *     comando2;
     * }
     * while (condicao);
     *
     *
     * ==================================================
     *                FUNCIONAMENTO
     * ==================================================
     *
     * 1 - Executa o bloco de comandos.
     *
     * 2 - Avalia a condição.
     *
     * 3 - Se a condição for verdadeira:
     *     volta para o início.
     *
     * 4 - Se a condição for falsa:
     *     encerra a repetição.
     *
     *
     * ==================================================
     *          DIFERENÇA ENTRE WHILE E DO-WHILE
     * ==================================================
     *
     * WHILE:
     *
     *   Testa primeiro e executa depois.
     *
     * DO-WHILE:
     *
     *   Executa primeiro e testa depois.
     *
     *
     * ==================================================
     *              EXEMPLO DE FIXAÇÃO
     * ==================================================
     *
     * Fazer um programa que leia uma temperatura
     * em Celsius e mostre o equivalente em Fahrenheit.
     *
     * Perguntar ao usuário se ele deseja repetir
     * a operação.
     *
     * Fórmula:
     *
     * F = 9.0 * C / 5.0 + 32.0
     *
     */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        // Variáveis
        char resposta;
        double celsius;
        double fahrenheit;

        do {

            // Entrada de dados
            System.out.print("Digite a temperatura em Celsius: ");
            celsius = input.nextDouble();

            // Processamento
            fahrenheit = 9.0 * celsius / 5.0 + 32.0;

            // Saída de dados
            System.out.printf("Equivalente em Fahrenheit: %.1f%n",
                    fahrenheit);

            System.out.print("Deseja repetir (s/n)? ");
            resposta = input.next().charAt(0);

        } while (resposta == 's' || resposta == 'S');

        System.out.println("Fim do programa.");

        input.close();
    }
}