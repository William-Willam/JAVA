import java.util.Scanner;

public class Atividade7 {
    /*
     * ==================================================
     *              EXERCÍCIO - QUADRANTE
     * ==================================================
     *
     * Enunciado:
     *
     * Leia dois valores reais (X e Y), representando as
     * coordenadas de um ponto no plano cartesiano.
     *
     * Em seguida, determine em qual quadrante o ponto
     * está localizado.
     *
     * Quadrantes:
     *
     *        Y
     *        |
     *    Q2  |  Q1
     * -------+------- X
     *    Q3  |  Q4
     *        |
     *
     * Regras:
     *
     * - Se X > 0 e Y > 0, o ponto está no Q1.
     * - Se X < 0 e Y > 0, o ponto está no Q2.
     * - Se X < 0 e Y < 0, o ponto está no Q3.
     * - Se X > 0 e Y < 0, o ponto está no Q4.
     *
     * Casos Especiais:
     *
     * - Se X = 0 e Y = 0, escrever:
     *   "Origem"
     *
     * - Se X = 0 e Y ≠ 0, escrever:
     *   "Eixo Y"
     *
     * - Se Y = 0 e X ≠ 0, escrever:
     *   "Eixo X"
     *
     * Exemplos:
     *
     * Entrada:
     * 4.5 -2.2
     *
     * Saída:
     * Q4
     *
     * ----------------------------------------
     *
     * Entrada:
     * 0.1 0.1
     *
     * Saída:
     * Q1
     *
     * ----------------------------------------
     *
     * Entrada:
     * 0.0 0.0
     *
     * Saída:
     * Origem
     *
     * Objetivo:
     *
     * Utilizar estruturas condicionais para identificar
     * a posição de um ponto no plano cartesiano,
     * verificando se ele está em um dos quadrantes,
     * sobre um dos eixos ou na origem.
     *
     */

    public static void main(String[] args) {
        // Leitura do teclado
        Scanner input = new Scanner(System.in);

        // Variaveis
        double x, y;

        // entrada de dados
        System.out.print("O número de X: ");
        x = input.nextDouble();

        System.out.print("O número de Y: ");
        y = input.nextDouble();

        // processamento e saída de dados
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("EIXO Y");
        } else if (y == 0) {
            System.out.println("EIXO X");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }

        input.close();
    }

}
