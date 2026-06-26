/*

Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.

Fórmula da área: area = π . raio2

Considere o valor de π = 3.14159

Exemplos:
    entrada: 2, saida: Area= 12.5664
    entrada: 100.64, saida: Area= 31819.3103
    entrada: 150.00, saida: Area=70685.7750

*/

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Variaveis
        double PI = 3.14159;
        double raio, area;

        // entrada de dados
        System.out.println("Digite o raio do seu area: ");
        raio = input.nextDouble();
        input.nextLine();

        // processamento de dados
        area = PI * (raio * raio);

        // Saída de dados
        System.out.printf("O valor da área: %.4f%n", area);
    }
}
