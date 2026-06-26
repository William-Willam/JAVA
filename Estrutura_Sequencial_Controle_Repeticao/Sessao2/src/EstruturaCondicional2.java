import java.util.Scanner;

public class EstruturaCondicional2 {

    /*
     * ==================================================
     *      OPERADORES DE ATRIBUIÇÃO ACUMULATIVA
     * ==================================================
     *
     * São operadores que realizam uma operação
     * matemática e armazenam o resultado na mesma
     * variável.
     *
     *
     * Forma tradicional:
     *
     *     x = x + 5;
     *
     * Forma acumulativa:
     *
     *     x += 5;
     *
     *
     * ==================================================
     *                OPERADORES
     * ==================================================
     *
     * +=  Soma e atribui
     *
     *     x += 5;
     *     Equivale a:
     *     x = x + 5;
     *
     *
     * -=  Subtrai e atribui
     *
     *     x -= 3;
     *     Equivale a:
     *     x = x - 3;
     *
     *
     * *=  Multiplica e atribui
     *
     *     x *= 2;
     *     Equivale a:
     *     x = x * 2;
     *
     *
     * /=  Divide e atribui
     *
     *     x /= 4;
     *     Equivale a:
     *     x = x / 4;
     *
     *
     * %=  Resto da divisão e atribui
     *
     *     x %= 3;
     *     Equivale a:
     *     x = x % 3;
     *
     *
     * ==================================================
     *                   EXEMPLO
     * ==================================================
     *
     * int x = 10;
     *
     * x += 5;   // x = 15
     * x -= 2;   // x = 13
     * x *= 3;   // x = 39
     * x /= 3;   // x = 13
     * x %= 5;   // x = 3
     *
     */

    // Exemplo: quando estoura o limite de chamada(minutos)
    // limite: R$ 50 para ter 100 minutos
    // porem usou 103 minutos, a cada minuto depois do limite cobra R$ 2.00

    public static void main(String[] args) {
        // Leitura do teclado
        Scanner input = new Scanner(System.in);

        // Variaveis
        int minutos;
        double conta = 50.0;

        // entrada de dados
        System.out.println("Quantos minutos foram usados? ");
        minutos = input.nextInt();

        // processamento e saida de dados
        if (minutos <= 100 && minutos >= 0) {
            System.out.println("O valor a cobrar é: R$ " + conta);
        } else {
            conta += (minutos - 100) * 2.0;
            System.out.println("O valor a cobrar é: R$ " + conta);
        }

        input.close();
    }

}