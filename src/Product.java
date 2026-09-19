//  Definimos la clase de la cual crearemos objetos
public class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor de la clase que permitira asignar las variables al crear el
    // objeto
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    // Metodo para calcular y devolver el valor total de la venta actual
    public double prodValue() {
        return this.price * this.quantity;
    }
}