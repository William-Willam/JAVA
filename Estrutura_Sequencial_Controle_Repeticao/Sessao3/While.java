package Estrutura_Sequencial_Controle_Repeticao.Sessao3;

import java.util.Scanner;

public class While {

    /*
     * ==================================================
     *                ESTRUTURA WHILE
     * ==================================================
     *
     * Conceito:
     *
     * O while é uma estrutura de repetição que executa
     * um bloco de comandos enquanto uma condição for
     * verdadeira.
     *
     *
     * ==================================================
     *                QUANDO UTILIZAR
     * ==================================================
     *
     * Utilizamos o while quando NÃO sabemos
     * previamente quantas repetições serão realizadas.
     *
     *
     * ==================================================
     *                    SINTAXE
     * ==================================================
     *
     * while (condicao) {
     *     comando1;
     *     comando2;
     * }
     *
     *
     * ==================================================
     *                FUNCIONAMENTO
     * ==================================================
     *
     * 1 - Avalia a condição.
     *
     * 2 - Se a condição for verdadeira:
     *     executa o bloco de comandos.
     *
     * 3 - Retorna para a condição.
     *
     * 4 - Se a condição continuar verdadeira:
     *     executa novamente.
     *
     * 5 - Quando a condição for falsa:
     *     encerra a repetição.
     *
     *
     * ==================================================
     *                     EXEMPLO
     * ==================================================
     *
     * Problema:
     *
     * Fazer um programa que leia números inteiros
     * até que o valor 0 seja digitado.
     *
     * Ao final, mostrar a soma dos números lidos.
     *
     *
     * Exemplo:
     *
     * Entrada:
     *   5
     *   3
     *   2
     *   0
     *
     * Saída:
     *   Soma = 10
     *
     */

    public static void main(String[] args) {

        // Leitura do teclado
        Scanner input = new Scanner(System.in);

        // Variáveis
        int numero;
        int soma = 0;

        // Entrada de dados
        System.out.print("Digite um número (0 para parar): ");
        numero = input.nextInt();

        // Processamento
        while (numero != 0) {

            soma += numero;

            System.out.print("Digite um número (0 para parar): ");
            numero = input.nextInt();
        }

        // Saída de dados
        System.out.println("Valor da soma: " + soma);
        System.out.println("Fim da repetição.");

        // Fechar Scanner
        input.close();
    }
}