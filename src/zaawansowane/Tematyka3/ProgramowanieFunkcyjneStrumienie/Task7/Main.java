package zaawansowane.Tematyka3.ProgramowanieFunkcyjneStrumienie.Task7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static <Pair> void main(String[] args) {

        List<Product> orders = new ArrayList<>(List.of(
                new Product("34587", "Learning Java", 4, 40.95),
                new Product("98762", "Programming Java", 5, 56.80),
                new Product("77226", "Head First Java", 3, 32.95),
                new Product("88112", "Java for beginners", 3, 24.99)
        ));

     List<Invoice> invoices = new ArrayList<>();
        for (Product product:orders) {
            double totalPrice = product.getTotalPrice();
            invoices.add(new Invoice(product.getId(), totalPrice));
        }
        invoices.sort(Comparator.comparing(Invoice::getTotalPrice));

        System.out.println("FV:");
        for (Invoice invoice:invoices) {
            System.out.println(invoice.getId() + ": " + invoice.getTotalPrice());

        }
    }
}


