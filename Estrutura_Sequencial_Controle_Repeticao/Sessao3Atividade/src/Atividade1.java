/*
 * ==================================================
 *           EXERCÍCIO - VALIDAÇÃO DE SENHA
 * ==================================================
 *
 * Enunciado:
 *
 * Escreva um programa que repita a leitura de uma senha
 * até que ela seja válida.
 *
 * Para cada senha incorreta informada, exiba a mensagem:
 *
 * "Senha Invalida"
 *
 * Quando a senha correta for digitada, exiba a mensagem:
 *
 * "Acesso Permitido"
 *
 * e encerre o programa.
 *
 * Considere que a senha correta é:
 *
 * 2002
 *
 * Exemplos:
 *
 * Entrada:
 * 2200
 * 1020
 * 2022
 * 2002
 *
 * Saída:
 * Senha Invalida
 * Senha Invalida
 * Senha Invalida
 * Acesso Permitido
 *
 * ----------------------------------------
 *
 * Entrada:
 * 2002
 *
 * Saída:
 * Acesso Permitido
 *
 * Objetivo:
 *
 * Utilizar uma estrutura de repetição para continuar
 * solicitando a senha ao usuário até que o valor correto
 * seja informado.
 *
 * Conceitos praticados:
 *
 * - Estrutura de repetição while
 * - Estrutura de repetição do-while
 * - Operadores relacionais (== e !=)
 * - Entrada de dados com Scanner
 * - Validação de dados
 *
 */

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int senha;

        System.out.print("Digite a senha: ");
        senha = input.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida");
            System.out.print("Digite a senha: ");
            senha = input.nextInt();
        }

        System.out.println("Acesso Permitido");

        input.close();
    }
}