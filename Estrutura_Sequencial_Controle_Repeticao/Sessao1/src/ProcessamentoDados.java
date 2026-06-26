public class ProcessamentoDados {

    /*
     * ===========================================
     *           PROCESSAMENTO DE DADOS
     * ===========================================
     *
     * Comando de atribuição:
     *
     *   <Variável> = <Expressão>
     *
     * O símbolo "=" lê-se como:
     *
     *   "recebe"
     *
     *
     * Exemplo:
     *
     *   int x, y;
     *
     *   x = 5;
     *   y = 2 * x;
     *
     *   System.out.println(x);
     *   System.out.println(y);
     *
     *
     * ===========================================
     *             CASTING DE DADOS
     * ===========================================
     *
     * Casting significa conversão de valores.
     *
     * Exemplo:
     *
     *   int -> double
     *
     *   int a = 5;
     *   int b = 2;
     *
     *   double resultado;
     *   double resultado1;
     *
     *   resultado = a / b;
     *   resultado1 = (double) a / b;
     *
     *   System.out.println(resultado);
     *   System.out.println(resultado1);
     *
     */

    public static void main(String[] args) {

        // Entrada de dados
        int x, y;

        int a = 5;
        int b = 2;
        double numero = 5.0;
        int numero2 = (int) numero;

        double resultado;
        double resultado1;

        x = 5;
        y = 2 * x;

        resultado = a / b;
        resultado1 = (double) a / b;

        // Saída de dados
        System.out.println(x);
        System.out.println(y);

        System.out.println("Resultado: " + resultado);
        System.out.println("Resultado com conversão: " + resultado1);
        System.out.println(numero2);
    }
}