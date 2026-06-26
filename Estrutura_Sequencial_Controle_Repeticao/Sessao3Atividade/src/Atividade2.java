/*
 * ==================================================
 *          EXERCÍCIO - COORDENADAS E QUADRANTES
 * ==================================================
 *
 * Enunciado:
 *
 * Escreva um programa para ler as coordenadas (X, Y)
 * de uma quantidade indeterminada de pontos no sistema
 * cartesiano.
 *
 * Para cada ponto, escrever o quadrante ao qual ele
 * pertence:
 *
 * - Primeiro Quadrante  : X > 0 e Y > 0
 * - Segundo Quadrante   : X < 0 e Y > 0
 * - Terceiro Quadrante  : X < 0 e Y < 0
 * - Quarto Quadrante    : X > 0 e Y < 0
 *
 * O algoritmo será encerrado quando pelo menos uma
 * das coordenadas for igual a zero.
 *
 * Nesta situação, nenhuma mensagem deverá ser exibida
 * e o programa deverá terminar.
 *
 * --------------------------------------------------
 * O que o exercício pede?
 * --------------------------------------------------
 *
 * 1. Ler duas coordenadas inteiras (X e Y).
 *
 * 2. Verificar em qual quadrante o ponto está.
 *
 * 3. Exibir o nome do quadrante correspondente.
 *
 * 4. Continuar lendo novas coordenadas até que
 *    X ou Y seja igual a zero.
 *
 * 5. Encerrar o programa sem exibir mensagem
 *    quando uma das coordenadas for zero.
 *
 * --------------------------------------------------
 * Exemplo
 * --------------------------------------------------
 *
 * Entrada:
 *  2  2
 *  3 -2
 * -8 -1
 * -7  1
 *  0  2
 *
 * Saída:
 * Primeiro
 * Quarto
 * Terceiro
 * Segundo
 *
 * --------------------------------------------------
 * Conceitos praticados
 * --------------------------------------------------
 *
 * - Estrutura de repetição while
 * - Operadores relacionais
 * - Operadores lógicos (&& e ||)
 * - Estruturas condicionais (if / else if)
 * - Plano cartesiano
 *
 */

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int coordenadaX;
        int coordenadaY;

        System.out.print("Digite a coordenada X: ");
        coordenadaX = input.nextInt();

        System.out.print("Digite a coordenada Y: ");
        coordenadaY = input.nextInt();

        while (coordenadaX != 0 && coordenadaY != 0) {

            if (coordenadaX > 0 && coordenadaY > 0) {
                System.out.println("Primeiro");
            } else if (coordenadaX < 0 && coordenadaY > 0) {
                System.out.println("Segundo");
            } else if (coordenadaX < 0 && coordenadaY < 0) {
                System.out.println("Terceiro");
            } else {
                System.out.println("Quarto");
            }

            System.out.print("Digite a coordenada X: ");
            coordenadaX = input.nextInt();

            System.out.print("Digite a coordenada Y: ");
            coordenadaY = input.nextInt();
        }

        System.out.println("Programa encerrado.");

        input.close();
    }
}