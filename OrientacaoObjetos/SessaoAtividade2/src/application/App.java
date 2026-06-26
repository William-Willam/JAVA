package application;

import java.util.Scanner;

import entities.Employee;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = input.nextLine();

        System.out.print("Gross salary: ");
        employee.grossSalary = input.nextDouble();

        System.out.print("Tax: ");
        employee.tax = input.nextDouble();

        System.out.println();
        System.out.println("Employee: " + employee);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = input.nextDouble();

        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + employee);

        input.close();
    }
}