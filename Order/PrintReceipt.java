public class PrintReceipt {
    OrderManager takeProduct;

    public PrintReceipt(OrderManager takeProduct) {
        this.takeProduct = takeProduct;
    }

    public void printReceipt() {
        System.out.println("\nStruk Pesanan:");
        System.out.println("Produk: " + takeProduct.getProduct());
        System.out.println("Jumlah: " + takeProduct.getQuantity());
        System.out.println("Total Harga: " + takeProduct.calculateTotal());
        System.out.println("==========================");
    }
}
