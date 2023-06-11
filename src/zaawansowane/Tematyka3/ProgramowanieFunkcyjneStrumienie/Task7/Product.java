package zaawansowane.Tematyka3.ProgramowanieFunkcyjneStrumienie.Task7;

public class Product {
    private String id;
    private String name;
    private int quantity;
    private double price;
    private Type type;

    public Product(String id, String name, int quantity, double price, Type type){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;

    }

    public Product(String id, String learning_java, int quantity, double price) {

    }

    public double getTotalPrice(){
        double totalPrice = price * quantity;
        if (totalPrice < 100) {
            totalPrice += 10;
        }
        return totalPrice;
    }
    public String getId(){
        return id;
    }
    public double getPrice(){
        return price;
    }
}
