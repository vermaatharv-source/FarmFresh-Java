import java.util.Scanner;

class Farmer {
    int id;
    String name;

    Farmer(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Product {
    int id;
    String name;
    int quantity;
    int farmerId;

    Product(int id, String name, int quantity, int farmerId) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.farmerId = farmerId;
    }
}

public class AgricultureMarket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Agriculture Market");
        System.out.println("------------------");

        System.out.print("Enter farmer ID: ");
        int farmerId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter farmer name: ");
        String farmerName = sc.nextLine();

        Farmer farmer = new Farmer(farmerId, farmerName);

        System.out.print("Enter product ID: ");
        int productId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter product name: ");
        String productName = sc.nextLine();

        System.out.print("Enter product quantity: ");
        int quantity = sc.nextInt();

        Product product = new Product(
            productId, productName, quantity, farmerId
        );

        System.out.println("\nProduct Added Successfully!");
        System.out.println("Farmer: " + farmer.name);
        System.out.println("Product: " + product.name);
        System.out.println("Quantity: " + product.quantity);

        System.out.print("\nEnter quantity to add: ");
        int add = sc.nextInt();

        product.quantity = product.quantity + add;

        System.out.println("New Quantity: " + product.quantity);

        sc.close();
    }
}
