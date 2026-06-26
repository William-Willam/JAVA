import java.util.Scanner;

public class Atividade4 {
    /*
        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
        o valor que recebe por hora e calcula o salário desse funcionário.
        A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

        Exemplo:
            entrada: 25, 100, 5.50
            saída: number = 25, salary = U$ 550.00


    */
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Variáveis
        int numeroFuncionario;
        double horasTrabalhadas;
        double salario, salarioHora;

        // entrada de dados
        System.out.println("Digite o número do funcionário: ");
        numeroFuncionario = input.nextInt();
        input.nextLine();

        System.out.println("Horas trabalhadas: ");
        horasTrabalhadas = input.nextDouble();

        System.out.println("Salário hora: ");
        salarioHora = input.nextDouble();

        // processamento de dados
        salario =  horasTrabalhadas * salarioHora;

        // Saída
        System.out.println("Número do Funcionário: "+numeroFuncionario);
        System.out.printf("Salário: %.2f%n",salario);

    }
}
