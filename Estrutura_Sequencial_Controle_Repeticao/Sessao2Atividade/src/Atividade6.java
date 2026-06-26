import java.util.Scanner;

public class Atividade6 {
    /*
     * ==================================================
     *              EXERCÍCIO - INTERVALOS
     * ==================================================
     *
     * Enunciado:
     *
     * Leia um valor numérico qualquer e informe em qual
     * dos intervalos abaixo ele se encontra:
     *
     * [0,25]
     * (25,50]
     * (50,75]
     * (75,100]
     *
     * Observação:
     *
     * - O símbolo [ significa que o limite está incluído.
     * - O símbolo ( significa que o limite não está incluído.
     *
     * Exemplos:
     *
     * Entrada:
     * 25.01
     *
     * Saída:
     * Intervalo (25,50]
     *
     * ----------------------------------------
     *
     * Entrada:
     * 25.00
     *
     * Saída:
     * Intervalo [0,25]
     *
     * ----------------------------------------
     *
     * Entrada:
     * 100.00
     *
     * Saída:
     * Intervalo (75,100]
     *
     * ----------------------------------------
     *
     * Entrada:
     * -25.02
     *
     * Saída:
     * Fora de intervalo
     *
     * Objetivo:
     *
     * Utilizar estruturas condicionais para verificar
     * em qual intervalo o valor informado pelo usuário
     * está localizado.
     *
     * Caso o valor não pertença a nenhum dos intervalos
     * especificados, exibir a mensagem:
     *
     * "Fora de intervalo"
     *
     */
    public static void main(String[] args) {
        // Leitura do Teclado
        Scanner input = new Scanner(System.in);

        // Variaveis
        double numero;

        // entrada de dados
        System.out.println("Digite um número: ");
        numero = input.nextDouble();
        
        // processamento e saida de dados
        if (numero < 0.0 || numero > 100.0) {
            System.out.println("Fora de intervalo");
        }
        else if (numero <= 25.0) {
            System.out.println("Intervalo [0,25]");
        }
        else if (numero <= 50.0) {
            System.out.println("Intervalo (25,50]");
        }
        else if (numero <= 75.0) {
            System.out.println("Intervalo (50,75]");
        }
        else {
            System.out.println("Intervalo (75,100]");
        }

        input.close();
    }
}
