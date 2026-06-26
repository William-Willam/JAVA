package application;

import java.util.Scanner;

import entities.Rectangle;

public class App {
    public static void main(String[] args) throws Exception {
        // Objetos instanciados
        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        // Leitura de dados
        System.out.print("Enter rectangle width: ");
        rectangle.width = input.nextDouble();

        System.out.print("Enter rectangle height: ");
        rectangle.height = input.nextDouble();

        System.out.println();

        // Saída de dados
        System.out.printf("AREA = %.2f%n", rectangle.area());
        System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
        
        input.close();
    }
}