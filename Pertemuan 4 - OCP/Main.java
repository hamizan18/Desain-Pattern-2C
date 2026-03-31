import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama produk: ");
        String product = scanner.nextLine();
        
        System.out.print("Masukkan Jumlah: ");
        int quantity = scanner.nextInt();
        
        System.out.print("Masukkan harga satuan: ");
        double price = scanner.nextDouble();

        OrderManager order = new OrderManager();
        order.setProduct(product);
        order.setPrice(price);
        order.setQuantity(quantity);
        
        SaveOrder saveOrder = new SaveOrder(order);
        saveOrder.saveOrder();

        PrintReceipt printer = new PrintReceipt(order);
        printer.printReceipt();

        scanner.close();
    }
}