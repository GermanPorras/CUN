import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sale {
    private int items;
    private List<Product> products;
    private double discount;

    public Sale() {
        this.products = new ArrayList<>();
        this.discount = 0;
        this.items = 0;
    }

    public void addingProd(Product product) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of items for this sale: ");
        items = scanner.nextInt();
        for (int i = 0; i < items; i++) {
            products.add(new Product(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt()));
        }

        scanner.close();
    }

}