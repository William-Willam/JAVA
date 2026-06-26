import java.util.Scanner;

public class EntradaDados {

    /*
     * =========================================================
     *                    ENTRADA DE DADOS
     * =========================================================
     *
     * Entrada de dados:
     *
     *   - Receber dados do teclado
     *
     *
     * =========================================================
     *                    COMO UTILIZAR
     * =========================================================
     *
     * Para ler dados do teclado em Java,
     * utiliza-se a classe Scanner.
     *
     *
     * Sintaxe:
     *
     *   Scanner sc = new Scanner(System.in);
     *
     *
     * =========================================================
     *                 MÉTODOS DO SCANNER
     * =========================================================
     *
     * EX1 - Ler um texto sem espaços:
     *
     *   x = sc.next();
     *
     *
     * EX2 - Ler um número inteiro:
     *
     *   x = sc.nextInt();
     *
     *
     * EX3 - Ler um número com ponto flutuante:
     *
     *   x = sc.nextDouble();
     *
     *
     * EX4 - Ler um caractere:
     *
     *   x = sc.next().charAt(0);
     *
     *
     * EX5 - Ler um texto até a quebra de linha:
     *
     *   x = sc.nextLine();
     *
     *
     * =========================================================
     *               LIMPEZA DO BUFFER
     * =========================================================
     *
     * Quando usamos:
     *
     *   nextInt()
     *   nextDouble()
     *   next()
     *
     * o ENTER do teclado fica armazenado
     * no buffer de leitura.
     *
     * Para limpar o buffer:
     *
     *   sc.nextLine();
     *
     */

    public static void main(String[] args) {

        // Criação do objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis
        String nomeCompleto;
        int idade;
        double altura;
        char sexo;

        /*
         * =========================================
         *          ENTRADA DE DADOS
         * =========================================
         */

        // nextInt() -> lê número inteiro
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();

        // Limpeza do buffer de leitura
        sc.nextLine();

        // nextLine() -> lê texto com espaços
        System.out.print("Digite seu nome completo: ");
        nomeCompleto = sc.nextLine();

        // nextDouble() -> lê número decimal
        System.out.print("Digite sua altura: ");
        altura = sc.nextDouble();

        // next().charAt(0) -> lê um caractere
        System.out.print("Digite seu sexo: ");
        sexo = sc.next().charAt(0);

        /*
         * =========================================
         *           SAÍDA DE DADOS
         * =========================================
         */

        System.out.println();
        System.out.println("===== DADOS INFORMADOS =====");
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Sexo: " + sexo);

        // Fechar Scanner
        sc.close();
    }
}