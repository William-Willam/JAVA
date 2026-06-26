/*
 * =========================================================
 *                ESTRUTURA SEQUENCIAL
 * =========================================================
 *
 * 1 - Operadores Aritméticos
 * ---------------------------------------------------------
 * Operadores:
 *
 *   +  -> soma
 *   -  -> subtração
 *   *  -> multiplicação
 *   /  -> divisão
 *   %  -> resto da divisão (módulo)
 *
 * Nas operações existe ordem de precedência.
 *
 * Exemplos:
 *
 *   2 * 6 / 3
 *   3 + 2 * 4
 *   (3 + 2) * 4
 *   14 % 3   // resto = 2
 *
 *
 * 2 - Variáveis
 * ---------------------------------------------------------
 * Variável é uma porção de memória utilizada
 * para armazenar dados durante a execução
 * dos programas.
 *
 * As variáveis precisam ser declaradas.
 *
 * Sintaxe:
 *
 *   <TIPO> <NOME> = <VALOR_INICIAL>;
 *
 * Exemplos:
 *
 *   int idade = 25;
 *   double altura = 1.68;
 *   char sexo = 'F';
 *
 *
 * Uma variável possui:
 *
 *   - Nome
 *   - Tipo
 *   - Valor
 *   - Endereço
 *
 *
 * Existem 8 tipos primitivos em Java:
 * ---------------------------------------------------------
 *
 * Tipos numéricos inteiros:
 *
 *   - byte
 *   - short
 *   - int
 *   - long
 *
 *
 * Tipos numéricos com ponto flutuante:
 *
 *   - float
 *   - double
 *
 *
 * Um caractere Unicode:
 *
 *   - char
 *
 *
 * Valor lógico:
 *
 *   - boolean
 *
 *
 * String
 * ---------------------------------------------------------
 * String representa cadeias de caracteres,
 * como palavras ou textos.
 *
 *
 * =========================================================
 *                    REGRA PRINCIPAL
 * =========================================================
 *
 * Regras para nomes de variáveis:
 *
 *   - Não pode começar com dígito
 *   - Use letra ou "_"
 *   - Não pode ter espaço em branco
 *   - Não usar acentos ou til
 *
 * Sugestão:
 *
 *   - Use o padrão camelCase
 *
 *
 * ERRADO:
 *
 *   int 5minutos;
 *   int salário;
 *   int salário do funcionario;
 *
 *
 * CERTO:
 *
 *   int _5minutos;
 *   int salario;
 *   int salarioDoFuncionario;
 *
 *
 * =========================================================
 *                  OPERAÇÕES BÁSICAS
 * =========================================================
 *
 * Entrada de dados:
 *   - Receber dados do teclado
 *
 * Processamento de dados:
 *   - Aplicar a lógica do programa
 *
 * Saída de dados:
 *   - Exibir resultados
 *
 *
 * =========================================================
 *                     FORMATAÇÕES
 * =========================================================
 *
 * %d  -> inteiro
 * %s  -> texto
 * %n  -> quebra de linha
 * \n  -> quebra de linha
 * %f  -> ponto flutuante
 * %c  -> caractere
 *
 */

import java.util.Locale;

public class Intro {

    public static void main(String[] args) {

        // Entrada de dados
        int a = 32;
        double b = 10.35784;
        String nome = "Maria";
        int idade = 31;
        double salario = 4000.00;

        // Saída de dados
        System.out.println("TESTE!");
        System.out.println(a);

        // Formatação com 2 casas decimais
        System.out.printf("%.2f%n", b);

        // Formatação com 4 casas decimais
        System.out.printf("%.4f%n", b);

        // Define padrão americano (ponto ao invés de vírgula)
        Locale.setDefault(Locale.US);

        // Concatenação - juntar elementos
        System.out.println("Resultado: " + b + " metros.");

        // Saída formatada
        System.out.printf("Resultado: %.2f metros%n", b);

        // Exibindo várias variáveis
        System.out.printf(
                "%s tem %d anos e ganha R$ %.2f%n",
                nome,
                idade,
                salario
        );
    }
}