import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<Product> products;
    private double discount;

    public Sale() {
        this.products = new ArrayList<>();
        this.discount = 0; 
    }

}
