import java.util.Scanner;

public class EstruturaSwitch {
    /*
     * ==================================================
     *                  SWITCH CASE
     * ==================================================
     *
     * Conceito:
     *
     * A estrutura switch-case é utilizada quando
     * precisamos tomar decisões com base no valor
     * de uma variável.
     *
     * Ela pode substituir vários if-else encadeados,
     * deixando o código mais organizado e legível.
     *
     *
     * ==================================================
     *                    SINTAXE
     * ==================================================
     *
     * switch (variavel) {
     *
     *     case valor1:
     *         comando1;
     *         break;
     *
     *     case valor2:
     *         comando2;
     *         break;
     *
     *     case valor3:
     *         comando3;
     *         break;
     *
     *     default:
     *         comandoPadrao;
     *         break;
     * }
     *
     *
     * ==================================================
     *                  FUNCIONAMENTO
     * ==================================================
     *
     * 1 - O switch avalia o valor da variável.
     *
     * 2 - O programa procura um case com o mesmo valor.
     *
     * 3 - Quando encontra:
     *     executa os comandos daquele case.
     *
     * 4 - O comando break encerra o switch.
     *
     * 5 - Se nenhum case for encontrado,
     *     o bloco default será executado.
     *
     *
     * ==================================================
     *                     EXEMPLO
     * ==================================================
     *
     * int dia = 3;
     *
     * switch (dia) {
     *
     *     case 1:
     *         System.out.println("Domingo");
     *         break;
     *
     *     case 2:
     *         System.out.println("Segunda-feira");
     *         break;
     *
     *     case 3:
     *         System.out.println("Terça-feira");
     *         break;
     *
     *     default:
     *         System.out.println("Dia inválido");
     *         break;
     * }
     *
     *
     * Saída:
     *
     * Terça-feira
     *
     *
     * ==================================================
     *                IMPORTÂNCIA DO BREAK
     * ==================================================
     *
     * O break interrompe a execução do switch.
     *
     * Sem ele, o programa continuará executando
     * os próximos cases, mesmo que eles não sejam
     * correspondentes ao valor informado.
     *
     *
     * Exemplo:
     *
     * int x = 2;
     *
     * switch (x) {
     *
     *     case 1:
     *         System.out.println("Um");
     *
     *     case 2:
     *         System.out.println("Dois");
     *
     *     case 3:
     *         System.out.println("Três");
     * }
     *
     *
     * Saída:
     *
     * Dois
     * Três
     *
     * Isso acontece porque não existem break's.
     *
     *
     * ==================================================
     *                    DEFAULT
     * ==================================================
     *
     * O default funciona como o else
     * da estrutura if-else.
     *
     * Ele será executado quando nenhum
     * dos cases for atendido.
     *
     * Exemplo:
     *
     * switch(opcao){
     *
     *     case 1:
     *         System.out.println("Cadastrar");
     *         break;
     *
     *     case 2:
     *         System.out.println("Excluir");
     *         break;
     *
     *     default:
     *         System.out.println("Opção inválida");
     * }
     *
     */
    public static void main(String[] args) {

        // Leitura do teclado
        Scanner input = new Scanner(System.in);

        // Variável
        int diaSemana;

        // Entrada de dados
        System.out.print("Digite um número de 1 a 7: ");
        diaSemana = input.nextInt();

        // Processamento e saída de dados
        switch (diaSemana) {

            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda-feira");
                break;

            case 3:
                System.out.println("Terça-feira");
                break;

            case 4:
                System.out.println("Quarta-feira");
                break;

            case 5:
                System.out.println("Quinta-feira");
                break;

            case 6:
                System.out.println("Sexta-feira");
                break;

            case 7:
                System.out.println("Sábado");
                break;

            default:
                System.out.println("Dia inválido!");
                break;
        }

        // Fechar Scanner
        input.close();
    }
}
