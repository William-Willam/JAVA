/*
 * ==================================================
 *       EXERCÍCIO - PESQUISA DE COMBUSTÍVEL
 * ==================================================
 *
 * Enunciado:
 *
 * Um posto de combustíveis deseja determinar qual de
 * seus produtos tem a preferência de seus clientes.
 *
 * Escreva um algoritmo para ler o tipo de combustível
 * abastecido, utilizando os seguintes códigos:
 *
 * 1 - Álcool
 * 2 - Gasolina
 * 3 - Diesel
 * 4 - Fim
 *
 * Caso o usuário informe um código inválido
 * (fora da faixa de 1 a 4), o programa deve ignorá-lo
 * e continuar solicitando novos códigos.
 *
 * O programa será encerrado quando o código informado
 * for igual a 4.
 *
 * Ao final, deve ser exibida a mensagem:
 *
 * MUITO OBRIGADO
 *
 * seguida da quantidade de clientes que abasteceram
 * cada tipo de combustível.
 *
 * --------------------------------------------------
 * O que o exercício pede?
 * --------------------------------------------------
 *
 * 1. Ler repetidamente o código do combustível.
 *
 * 2. Contabilizar:
 *    - Álcool
 *    - Gasolina
 *    - Diesel
 *
 * 3. Ignorar códigos inválidos.
 *
 * 4. Encerrar quando o código for 4.
 *
 * 5. Exibir a quantidade de abastecimentos de cada
 *    combustível.
 *
 * --------------------------------------------------
 * Exemplo
 * --------------------------------------------------
 *
 * Entrada:
 * 8
 * 1
 * 7
 * 2
 * 2
 * 4
 *
 * Saída:
 * MUITO OBRIGADO
 * Alcool: 1
 * Gasolina: 2
 * Diesel: 0
 *
 * --------------------------------------------------
 * Conceitos praticados
 * --------------------------------------------------
 *
 * - Estrutura de repetição while
 * - Estruturas condicionais
 * - Contadores
 * - Validação de dados
 * - Entrada de dados com Scanner
 *
 */

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigo;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("============ Tabela =============");
        System.out.println("1 - Álcool");
        System.out.println("2 - Gasolina");
        System.out.println("3 - Diesel");
        System.out.println("4 - Fim");
        System.out.println("==================================");

        System.out.println("Escolha a opção: ");
        codigo = input.nextInt();

        while (codigo != 4){

            if (codigo == 1){
                alcool = alcool + 1;
            } else if (codigo == 2) {
                gasolina = gasolina + 1;
            } else if (codigo == 3) {
                diesel = diesel + 1;
            }

            System.out.println("Escolha a opção: ");
            codigo = input.nextInt();
        }

        System.out.println();
        System.out.println("MUITO OBRIGADO");

        System.out.println("============= Resultado dos combustiveis ! ============");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        input.close();
    }
}
