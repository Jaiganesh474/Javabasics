package productmanagementsystem;


import productmanagementsystem.dao.ProductDAO;
import productmanagementsystem.model.Product;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductDAO dao = new ProductDAO();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Product Management System ---");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Product Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Price: ");
                        double price = scanner.nextDouble();
                        System.out.print("Quantity: ");
                        int quantity = scanner.nextInt();
                        dao.addProduct(new Product(name, price, quantity));
                        System.out.println("Product added successfully.");
                        break;
                    case 2:
                        List<Product> products = dao.getAllProducts();
                        System.out.println("--- Product List ---");
                        for (Product p : products) {
                            System.out.printf("ID: %d | Name: %s | Price: %.2f | Quantity: %d%n",
                                    p.getId(), p.getName(), p.getPrice(), p.getQuantity());
                        }
                        break;
                    case 3:
                        System.out.print("Enter Product ID to Update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("New Name: ");
                        String newName = scanner.nextLine();
                        System.out.print("New Price: ");
                        double newPrice = scanner.nextDouble();
                        System.out.print("New Quantity: ");
                        int newQuantity = scanner.nextInt();
                        dao.updateProduct(new Product(updateId, newName, newPrice, newQuantity));
                        System.out.println("Product updated successfully.");
                        break;
                    case 4:
                        System.out.print("Enter Product ID to Delete: ");
                        int deleteId = scanner.nextInt();
                        dao.deleteProduct(deleteId);
                        System.out.println("Product deleted successfully.");
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
