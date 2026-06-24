package application;

import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Objetos
        Scanner input =  new Scanner(System.in);
        Product product =  new Product();

        // leitura de dados
        System.out.println("Enter product data: ");
        
        System.out.println("Name: ");
        product.name = input.nextLine();
        
        System.out.println("Price: ");
        product.price = input.nextDouble();

        System.out.println("Quantity: ");
        product.quantity = input.nextInt();

        //

        input.close();
    }
}
