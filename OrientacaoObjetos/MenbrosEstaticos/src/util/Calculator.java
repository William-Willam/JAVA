package util;

public class Calculator {

    // Constante estática
    public static final double PI = 3.14159;

    // Método estático
    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    // Método estático
    public static double volume(double radius) {
        return 4.0 * PI * Math.pow(radius, 3) / 3.0;
    }
}