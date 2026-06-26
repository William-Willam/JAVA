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
        System.out.println();

        System.out.println("Name: ");
        product.name = input.nextLine();
        
        System.out.println("Price: ");
        product.price = input.nextDouble();

        System.out.println("Quantity: ");
        product.quantity = input.nextInt();

        // Saida de dados
        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = input.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = input.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Product data: " + product);
        
        input.close();
    }
}
