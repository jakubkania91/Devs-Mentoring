package zaawansowane.Tematyka3.ProgramowanieFunkcyjneStrumienie.Task7;

public class Invoice {
    private String id;
    private double totalPrice;

    public String getId() {
        return id;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Invoice(String id, double totalPrice) {
        this.id = id;
        this.totalPrice = totalPrice;
    }
}
