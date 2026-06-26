package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class App {

    /*
     * ==================================================
     *              MEMBROS ESTÁTICOS (static)
     * ==================================================
     *
     * Conceito:
     *
     * Membros estáticos pertencem à classe,
     * e não aos objetos.
     *
     * Portanto, podem ser acessados diretamente
     * pelo nome da classe, sem criar um objeto.
     *
     *
     * ==================================================
     *                    EXEMPLO
     * ==================================================
     *
     * Classe utilitária:
     *
     * public class Calculator {
     *
     *     public static final double PI = 3.14159;
     *
     *     public static double circumference(double r){
     *         return 2.0 * PI * r;
     *     }
     *
     *     public static double volume(double r){
     *         return 4.0 * PI * Math.pow(r,3) / 3.0;
     *     }
     * }
     *
     *
     * Utilização:
     *
     * double c = Calculator.circumference(3.0);
     * double v = Calculator.volume(3.0);
     *
     * Observe que NÃO foi necessário criar:
     *
     * Calculator calc = new Calculator();
     *
     * Os métodos pertencem à própria classe.
     *
     */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        // Variável
        double radius;

        // Entrada de dados
        System.out.print("Enter radius: ");
        radius = input.nextDouble();

        // Processamento
        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        // Saída de dados
        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        input.close();
    }
}