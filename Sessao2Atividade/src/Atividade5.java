import java.util.Scanner;

public class Atividade5 {
    /*
     * ==================================================
     *              EXERCÍCIO - LANCHONETE
     * ==================================================
     *
     * Enunciado:
     *
     * Com base na tabela abaixo, leia o código de um item
     * e a quantidade desejada. Em seguida, calcule e mostre
     * o valor total da conta.
     *
     * Tabela de Produtos:
     *
     * Código | Especificação     | Preço
     * -------|-------------------|--------
     *    1   | Cachorro Quente   | R$ 4,00
     *    2   | X-Salada          | R$ 4,50
     *    3   | X-Bacon           | R$ 5,00
     *    4   | Torrada Simples   | R$ 2,00
     *    5   | Refrigerante      | R$ 1,50
     *
     * Exemplos:
     *
     * Entrada:
     * Código: 3
     * Quantidade: 2
     *
     * Saída:
     * Total: R$ 10.00
     *
     * ----------------------------------------
     *
     * Entrada:
     * Código: 2
     * Quantidade: 3
     *
     * Saída:
     * Total: R$ 13.50
     *
     * Objetivo:
     *
     * Utilizar estruturas condicionais para identificar
     * o produto escolhido, calcular o valor total da compra
     * multiplicando o preço pela quantidade informada e
     * exibir o resultado ao usuário.
     *
     */

    public static void main(String[] args) {
        // leitura do teclado
        Scanner input = new Scanner(System.in);

        // Variaveis
        int codigo;
        int  quantidade;
        double total =0 ;

        // entrada de dados
        System.out.print("Qual o codigo do pedido: ");
        codigo = input.nextInt();
        input.nextLine();

        System.out.print("Qual o quantidade do pedido: ");
        quantidade = input.nextInt();

        // processamento de dados
        if (codigo == 1){
            total = quantidade * 4.00;
        } else if (codigo == 2) {
            total = quantidade * 4.50;
        } else if (codigo == 3) {
            total =  quantidade * 5.00;
        } else if (codigo == 4) {
            total = quantidade * 2.00;
        } else if (codigo == 5) {
            total = quantidade * 1.50;
        }else {
            System.out.println("Não existe este codigo!");
        }

        // Saida de dados
        System.out.printf("Valor total do seu pedido é R$: %.2f", total);
    }
}
