public class FuncoesMatematicas {

    /*
     * =========================================================
     *                FUNÇÕES MATEMÁTICAS
     * =========================================================
     *
     * Algumas funções matemáticas em Java:
     *
     *
     * EX1 - Raiz quadrada
     * ---------------------------------------------------------
     *
     *   A = Math.sqrt(x);
     *
     * Exemplo:
     *
     *   double resultado;
     *   resultado = Math.sqrt(25.0);
     *
     *
     * EX2 - Potência
     * ---------------------------------------------------------
     *
     *   A = Math.pow(x, y);
     *
     * Exemplo:
     *
     *   double resultado;
     *   resultado = Math.pow(2.0, 3.0);
     *
     *
     * EX3 - Valor absoluto
     * ---------------------------------------------------------
     *
     *   A = Math.abs(x);
     *
     * Exemplo:
     *
     *   double resultado;
     *   resultado = Math.abs(-10.5);
     *
     */

    public static void main(String[] args) {

        double x = 25.0;
        double y = 2.0;
        double z = -10.5;

        double raizQuadrada;
        double potencia;
        double valorAbsoluto;

        // Raiz quadrada
        raizQuadrada = Math.sqrt(x);

        // Potência
        potencia = Math.pow(x, y);

        // Valor absoluto
        valorAbsoluto = Math.abs(z);

        // Saída de dados
        System.out.println("Raiz quadrada: " + raizQuadrada);
        System.out.println("Potência: " + potencia);
        System.out.println("Valor absoluto: " + valorAbsoluto);
    }
}