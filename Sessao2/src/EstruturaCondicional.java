import java.util.Scanner;

/*
 * ==================================================
 *              ESTRUTURA CONDICIONAL
 * ==================================================
 *
 * Conceito:
 *
 * Estruturas condicionais são estruturas de controle
 * que permitem executar determinados blocos de código
 * somente quando uma condição for satisfeita.
 *
 *
 * Exemplo:
 *
 *   Se a condição for verdadeira:
 *       executa um bloco de comandos.
 *
 *   Senão:
 *       executa outro bloco de comandos.
 *
 *
 * Regra:
 *
 * Se a condição for verdadeira (true),
 * o compilador executará o bloco do if.
 *
 * Se a condição for falsa (false),
 * o bloco será ignorado.
 *
 *
 * ==================================================
 *        ESTRUTURA CONDICIONAL SIMPLES
 * ==================================================
 *
 * Sintaxe:
 *
 * if (condicao) {
 *     comando1;
 *     comando2;
 * }
 *
 *
 * ==================================================
 *       ESTRUTURA CONDICIONAL COMPOSTA
 * ==================================================
 *
 * Sintaxe:
 *
 * if (condicao) {
 *     comando1;
 * }
 * else {
 *     comando2;
 * }
 *
 *
 * ==================================================
 *          MAIS DE DUAS POSSIBILIDADES
 * ==================================================
 *
 * Exemplo:
 *
 * hora < 12
 *     Bom dia!
 *
 * 12 <= hora < 18
 *     Boa tarde!
 *
 * hora >= 18
 *     Boa noite!
 *
 *
 * ==================================================
 *   ENCADEAMENTO DE ESTRUTURAS CONDICIONAIS
 * ==================================================
 *
 * Quando existem várias possibilidades,
 * podemos encadear estruturas if/else.
 *
 * Exemplo:
 *
 * if (condicao1) {
 *     comando1;
 *     comando2;
 * }
 * else {
 *     if (condicao2) {
 *         comando3;
 *         comando4;
 *     }
 *     else {
 *         comando5;
 *         comando6;
 *     }
 * }
 *
 *
 * Forma mais utilizada:
 *
 * if (condicao1) {
 *     comando1;
 * }
 * else if (condicao2) {
 *     comando2;
 * }
 * else {
 *     comando3;
 * }
 *
 */
public class EstruturaCondicional{
    public static void main(String[] args) {


            // Teclado
            Scanner input = new Scanner(System.in);

            // Variável
            int hora;

            // Entrada de dados
            System.out.print("Quantas horas? ");
            hora = input.nextInt();

            // Processamento e saída de dados
            if (hora < 12) {
                System.out.println("BOM DIA");
            }
            else if (hora < 18) {
                System.out.println("BOA TARDE");
            }
            else {
                System.out.println("BOA NOITE");
            }

            // Fechar Scanner
        input.close();
    }
}
