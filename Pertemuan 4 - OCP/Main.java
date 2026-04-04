import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int max = 15;
        int min = 2;
        char validate = 'Y';

        int discount = random.nextInt(max - min + 1) + 2; // biar diskonnya 2 - 15%
        
        while (true){

            try {
                if (validate == 'Y' || validate == 'y') {
                    System.out.println("Produk hari ini memiliki diskon sebesar " + discount + "% untuk total pembelian!!");
                    System.out.print("Masukkan nama produk: ");
                    String product = scanner.nextLine();
                    
                    System.out.print("Masukkan Jumlah: ");
                    int quantity = scanner.nextInt();
                    
                    System.out.print("Masukkan harga satuan: ");
                    double price = scanner.nextDouble();

                    scanner.nextLine(); // ntuk buang newline

                    OrderManager order = new OrderManager();
                    order.setProduct(product);
                    order.setPrice(price);
                    order.setQuantity(quantity);
                    order.setDiscount(discount);
                    
                    SaveOrder saveOrder = new SaveOrder(order);
                    saveOrder.saveOrder();

                    PrintReceipt printer = new PrintReceipt(order);
                    printer.printReceipt();
                    
                    System.out.println("Order lagi? (Y/N): ");
                    validate = scanner.next().charAt(0); // ni ntuk ambil Char bukan String
                } else if (validate == 'N' || validate == 'n') {
                    break;
                } else {
                    System.out.println("Mohon input 'Y' atau 'N'");
                    System.out.println("Order lagi? (Y/N): ");
                    validate = scanner.next().charAt(0);
                }
            }
        }
        scanner.close();
    }
}