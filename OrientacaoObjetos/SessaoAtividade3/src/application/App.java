package application;

import java.util.Scanner;

import entities.Student;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student estudante = new Student();

        System.out.print("Name of student: ");
        estudante.name = input.nextLine();

        System.out.print("1° GRADE: ");
        estudante.grade1 = input.nextDouble();

        System.out.print("2° GRADE: ");
        estudante.grade2 = input.nextDouble();

        System.out.print("3° GRADE: ");
        estudante.grade3 = input.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", estudante.finalGrade());

        if (estudante.finalGrade() >= 60.0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", estudante.missingPoints());
        }

        input.close();
    }
}
