public class CondicionalTernaria {

    /*
     * ==================================================
     *              CONDICIONAL TERNÁRIA
     * ==================================================
     *
     * Conceito:
     *
     * A condicional ternária é uma forma simplificada
     * da estrutura if-else.
     *
     * Ela é utilizada quando desejamos atribuir
     * um valor a uma variável com base em uma condição.
     *
     *
     * ==================================================
     *                    SINTAXE
     * ==================================================
     *
     * (condicao) ? valorVerdadeiro : valorFalso;
     *
     *
     * Leitura:
     *
     * Se a condição for verdadeira:
     *     retorna valorVerdadeiro
     *
     * Senão:
     *     retorna valorFalso
     *
     *
     * ==================================================
     *                    EXEMPLOS
     * ==================================================
     *
     * Exemplo 1:
     *
     * (2 > 4) ? 50 : 80
     *
     * Resultado:
     *
     * 80
     *
     *
     * Exemplo 2:
     *
     * int idade = 20;
     *
     * String mensagem =
     *      (idade >= 18) ? "Maior de idade" : "Menor de idade";
     *
     *
     * ==================================================
     *               COMPARAÇÃO COM IF-ELSE
     * ==================================================
     *
     * Forma convencional:
     *
     * double desconto;
     *
     * if (preco < 20.0) {
     *     desconto = preco * 0.10;
     * }
     * else {
     *     desconto = preco * 0.05;
     * }
     *
     *
     * Utilizando operador ternário:
     *
     * double desconto =
     *     (preco < 20.0) ? preco * 0.10 : preco * 0.05;
     *
     *
     * ==================================================
     *                  QUANDO UTILIZAR
     * ==================================================
     *
     * Utilize quando houver apenas duas possibilidades
     * de resultado e a lógica for simples.
     *
     * Para situações mais complexas,
     * prefira utilizar if-else.
     *
     */

    public static void main(String[] args) {

        // Variáveis
        double preco = 34.5;

        /*
         * ==========================================
         *        JEITO CONVENCIONAL (IF-ELSE)
         * ==========================================
         */

        double desconto;

        if (preco < 20.0) {
            desconto = preco * 0.10;
        } else {
            desconto = preco * 0.05;
        }

        System.out.println("Desconto usando IF-ELSE: " + desconto);

        /*
         * ==========================================
         *          OPERADOR TERNÁRIO
         * ==========================================
         */

        double descontoTernario =
                (preco < 20.0) ? preco * 0.10 : preco * 0.05;

        System.out.println("Desconto usando operador ternário: "
                + descontoTernario);
    }
}