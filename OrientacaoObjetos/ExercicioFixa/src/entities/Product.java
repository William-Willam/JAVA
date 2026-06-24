package entities;

public class Product {
    
    // atriutos

    public String name;
    public double price;
    public int quantity;

    // metodos
    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity +=  quantity; 
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }



}
