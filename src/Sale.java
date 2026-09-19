import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sale {
    private int items;
    private List<Product> products;

    public Sale() {
        this.products = new ArrayList<>();
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

    public double subTotal(Product[] products) {
        double subTotalCalc = 0;
        for (Product product : products) {
            subTotalCalc += product.prodValue();
        }
        return subTotalCalc;
    }

    public double totalSale(Product[] products) {
        double discount = 0;
        double subTotal = subTotal(products);
        if (subTotal >= 200000) {
            discount = 0.1;
            return subTotal - (subTotal * discount);
        } else if (subTotal < 200000 && subTotal >= 0) {
            return subTotal;
        } else {
            System.out.println("Invalid sale xc");
            return 0;
        }
    }
}