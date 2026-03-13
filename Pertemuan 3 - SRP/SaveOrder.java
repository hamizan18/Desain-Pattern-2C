import java.io.FileWriter;
import java.io.IOException;

public class SaveOrder {
    private OrderManager takeOrder;

    public SaveOrder(OrderManager takeOrder) {
        this.takeOrder = takeOrder;
    }
    
    public void saveOrder() {
        String product = takeOrder.getProduct();
        int quantity = takeOrder.getQuantity();
        double total = takeOrder.calculateTotal();

        try (FileWriter writer = new FileWriter("orders.txt", true)) {
            writer.write(product + " - " + quantity + " - Rp" + total + "\n");
            System.out.println("Pesanan telah disimpan!");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan pesanan" + e.getMessage());
        }
    }
}