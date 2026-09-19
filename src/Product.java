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

    // Metodo para calcular y devolver el valor total de la venta actual
    public double calcVenta() {
        return this.price * this.quantity;
    }
}