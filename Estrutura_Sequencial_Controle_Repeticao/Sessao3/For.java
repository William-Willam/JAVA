package Estrutura_Sequencial_Controle_Repeticao.Sessao3;

import java.util.Scanner;

public class For {

    /*
     * ==================================================
     *                ESTRUTURA FOR
     * ==================================================
     *
     * Conceito:
     *
     * O FOR é uma estrutura de repetição que executa
     * um bloco de comandos para um determinado número
     * de vezes ou dentro de um intervalo de valores.
     *
     *
     * ==================================================
     *                QUANDO UTILIZAR
     * ==================================================
     *
     * Utilizamos o FOR quando sabemos previamente:
     *
     *   - A quantidade de repetições; ou
     *   - O intervalo de valores a ser percorrido.
     *
     *
     * ==================================================
     *                    SINTAXE
     * ==================================================
     *
     * for (inicio; condicao; incremento) {
     *     comando1;
     *     comando2;
     * }
     *
     *
     * ==================================================
     *                FUNCIONAMENTO
     * ==================================================
     *
     * Início:
     *
     *   Executado apenas uma vez,
     *   no começo da repetição.
     *
     *
     * Condição:
     *
     *   Se for verdadeira (true),
     *   executa o bloco de comandos.
     *
     *   Se for falsa (false),
     *   encerra a repetição.
     *
     *
     * Incremento/Decremento:
     *
     *   Executado ao final de cada volta.
     *
     *
     * ==================================================
     *                    EXEMPLO
     * ==================================================
     *
     * for (int i = 0; i < 5; i++) {
     *     System.out.println(i);
     * }
     *
     * Saída:
     *
     * 0
     * 1
     * 2
     * 3
     * 4
     *
     *
     * ==================================================
     *              EXEMPLO DE FIXAÇÃO
     * ==================================================
     *
     * Problema:
     *
     * Fazer um programa que lê um valor inteiro N
     * e depois lê N números inteiros.
     *
     * Ao final, mostrar a soma dos N números lidos.
     *
     *
     * Exemplo:
     *
     * Entrada:
     *   4
     *   10
     *   20
     *   30
     *   40
     *
     * Saída:
     *   100
     *
     */

    public static void main(String[] args) {

        // Leitura do teclado
        Scanner input = new Scanner(System.in);

        // Variáveis
        int N;
        int soma = 0;

        // Entrada de dados
        System.out.print("Quantos números serão digitados? ");
        N = input.nextInt();

        // Processamento
        for (int i = 1; i <= N; i++) {

            System.out.print("Digite o " + i + "º número: ");
            int x = input.nextInt();

            soma += x;
        }

        // Saída de dados
        System.out.println("Soma = " + soma);

        // Fechar Scanner
        input.close();
    }
}
