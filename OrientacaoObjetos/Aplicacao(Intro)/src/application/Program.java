package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double xA, xB, xC;
        double yA, yB, yC;

        System.out.println("Digite as medidas do triângulo X:");
        xA = input.nextDouble();
        xB = input.nextDouble();
        xC = input.nextDouble();

        System.out.println("Digite as medidas do triângulo Y:");
        yA = input.nextDouble();
        yB = input.nextDouble();
        yC = input.nextDouble();

        // Semiperímetro do triângulo X
        double pX = (xA + xB + xC) / 2.0;

        // Área do triângulo X
        double areaX = Math.sqrt(
                pX * (pX - xA) * (pX - xB) * (pX - xC));

        // Semiperímetro do triângulo Y
        double pY = (yA + yB + yC) / 2.0;

        // Área do triângulo Y
        double areaY = Math.sqrt(
                pY * (pY - yA) * (pY - yB) * (pY - yC));

        System.out.printf("Área do triângulo X = %.4f%n", areaX);
        System.out.printf("Área do triângulo Y = %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior área: X");
        } else {
            System.out.println("Maior área: Y");
        }

        input.close();
    }
}