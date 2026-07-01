
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Objetos
        Scanner input = new Scanner(System.in);

        // leitura de dados
        System.out.println("Enter product data: ");
        System.out.println();

        System.out.println("Name: ");
        String name = input.nextLine();

        System.out.println("Price: ");
        double price = input.nextDouble();

        System.out.println("Quantity: ");
        int quantity = input.nextInt();

        Product product = new Product(name, price, 0);

        // Saida de dados
        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = input.nextInt();
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
