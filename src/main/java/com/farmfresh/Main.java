package com.farmfresh;
import com.farmfresh.model.Farmer;
import com.farmfresh.model.Consumer;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to FarmFresh!");

        System.out.println("Please select your role:");
        System.out.println("1. Farmer");
        System.out.println("2. Consumer");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You selected Farmer.");
                Farmer f1 = new Farmer("01", "Rahul", "rahul@example.com", "password", "product1");
                f1.addProductId("product2");
                f1.displayMenu();
                System.out.println("Product IDs: " + f1.getProductid());
                break;
            case 2:
                System.out.println("You selected Consumer.");
                Consumer c1 = new Consumer("01", "Priya", "priya@example.com", "password", Arrays.asList("order1"));
                c1.displayMenu();
                c1.addOrderId("order2");
                break;
            default:
                System.out.println("Invalid choice. Please select either 1 or 2.");
        }
    }
}