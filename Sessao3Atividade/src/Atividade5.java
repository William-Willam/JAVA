import java.util.Scanner;

public class Atividade5 {
    /*
     * ==================================================
     *          EXERCÍCIO - DENTRO E FORA DO INTERVALO
     * ==================================================
     *
     * Enunciado:
     *
     * Leia um valor inteiro N. Este valor representa a
     * quantidade de números inteiros X que serão lidos
     * em seguida.
     *
     * Para cada valor lido, verificar se ele pertence ao
     * intervalo [10,20].
     *
     * Ao final, mostrar:
     *
     * - Quantos valores estão dentro do intervalo ("in")
     * - Quantos valores estão fora do intervalo ("out")
     *
     * --------------------------------------------------
     * O que o exercício pede?
     * --------------------------------------------------
     *
     * 1. Ler a quantidade de números (N).
     *
     * 2. Ler N valores inteiros.
     *
     * 3. Contar quantos valores estão entre 10 e 20
     *    (inclusive).
     *
     * 4. Contar quantos valores estão fora desse intervalo.
     *
     * 5. Exibir os resultados.
     *
     * --------------------------------------------------
     * Exemplo
     * --------------------------------------------------
     *
     * Entrada:
     * 5
     * 14
     * 123
     * 10
     * -25
     * 20
     *
     * Saída:
     * 3 in
     * 2 out
     *
     * --------------------------------------------------
     * Conceitos praticados
     * --------------------------------------------------
     *
     * - Estrutura de repetição for
     * - Estruturas condicionais (if/else)
     * - Contadores
     * - Operadores relacionais (>= e <=)
     * - Entrada de dados com Scanner
     *
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N;
        int in = 0;
        int out = 0;

        System.out.println("Quantos números: ");
        N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            int X = input.nextInt();
            if (X >= 10 && X <= 20) {
                in++; // in = in + 1;
            }else {
                out++; // out = out + 1;
            }
        }

        System.out.println("IN: " + in);
        System.out.println("OUT: " + out);

        input.close();

    }
}
