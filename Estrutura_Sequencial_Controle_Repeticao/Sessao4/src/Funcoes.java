public class Funcoes {

    /*
     * ==================================================
     *                    FUNÇÕES
     * ==================================================
     *
     * Conceito:
     *
     * Funções representam um processamento que possui
     * um significado específico.
     *
     * Elas são utilizadas para executar tarefas
     * determinadas dentro de um programa.
     *
     *
     * Exemplos:
     *
     *   Math.sqrt(double)
     *   System.out.println(String)
     *
     *
     * ==================================================
     *                  VANTAGENS
     * ==================================================
     *
     * Modularização:
     *
     *   Divide o programa em partes menores,
     *   facilitando a organização.
     *
     *
     * Delegação:
     *
     *   Permite delegar responsabilidades
     *   para funções específicas.
     *
     *
     * Reaproveitamento:
     *
     *   Uma função pode ser utilizada várias vezes
     *   sem a necessidade de repetir código.
     *
     *
     * ==================================================
     *             ENTRADA E SAÍDA DE DADOS
     * ==================================================
     *
     * As funções podem receber dados de entrada
     * chamados parâmetros ou argumentos.
     *
     * Exemplo:
     *
     *   soma(10, 20);
     *
     *   10 e 20 são argumentos.
     *
     *
     * As funções também podem retornar
     * um resultado.
     *
     * Exemplo:
     *
     *   int resultado = soma(10, 20);
     *
     *
     * ==================================================
     *                ESTRUTURA BÁSICA
     * ==================================================
     *
     * public static tipoRetorno nomeFuncao(parametros){
     *
     *     comandos;
     *
     *     return valor;
     * }
     *
     *
     * ==================================================
     *            FUNÇÃO SEM RETORNO (void)
     * ==================================================
     *
     * public static void mensagem(){
     *     System.out.println("Olá Mundo");
     * }
     *
     *
     * ==================================================
     *            FUNÇÃO COM RETORNO
     * ==================================================
     *
     * public static int soma(int a, int b){
     *     return a + b;
     * }
     *
     *
     * ==================================================
     *          FUNÇÕES EM ORIENTAÇÃO A OBJETOS
     * ==================================================
     *
     * Em Programação Orientada a Objetos (POO),
     * funções dentro de classes recebem o nome de:
     *
     * MÉTODOS
     *
     */

    public static void main(String[] args) {

        int resultado = soma(10, 20);

        System.out.println("Resultado da soma: " + resultado);

        mensagem();
    }

    // Método sem retorno
    public static void mensagem() {
        System.out.println("Olá Mundo!");
    }

    // Método com retorno
    public static int soma(int a, int b) {
        return a + b;
    }
}