package Principal_Class;

import entities.Product;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Entre product data: ");
        System.out.print("Nome :");
        String nome = sc.next();        
        System.out.print("Price :");
        double price = sc.nextDouble();
        product = new Product(nome, price);
        
        System.out.print("Quantity in Stock: ");
        product.quantity = sc.nextInt();        
        System.out.println();
        
        System.out.println(product);
        
        System.out.println();
        System.out.println("Deseja adicionar ao estoque ?(y/n)");
        System.out.println();
        System.out.println("Entre com o numero do Stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();
        
        System.out.println("Update data" + product);

        System.out.println();
        System.out.println("Deseja remover algum produto (y/n) ");
        String n = sc.next();
        if (n.equalsIgnoreCase("y")) {
            System.out.println("Entre com o numero de produtos a serem removidos: ");
            quantity = sc.nextInt();
            product.removeProducts(quantity);
        } else {
            sc.close();
        }
        //quantity = sc.nextInt();
        //product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
