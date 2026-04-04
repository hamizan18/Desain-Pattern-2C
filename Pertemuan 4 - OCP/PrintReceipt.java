import java.text.NumberFormat;
import java.util.Locale;

public class PrintReceipt {
    OrderManager takeProduct;

    public PrintReceipt(OrderManager takeProduct) {
        this.takeProduct = takeProduct;
    }

    public void printReceipt() {
        // biarr jadi rupiah
        Locale localeID = Locale.forLanguageTag("id-ID");
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(localeID);
        rupiah.setMaximumFractionDigits(0); // biar diujongnya gaada ,00

        System.out.println("\nStruk Pesanan:");
        System.out.println("Produk\t\t\t: " + takeProduct.getProduct());
        System.out.println("Jumlah Diskon\t\t: " + takeProduct.getDiscount());
        System.out.println("Jumlah\t\t\t: " + takeProduct.getQuantity());
        System.out.println("Harga Awal\t\t: " + rupiah.format(takeProduct.calculateTotal()));
        System.out.println("Total Harga\t\t: " + rupiah.format((takeProduct.calculateTotal() - (takeProduct.calculateTotal() * takeProduct.getTotalDiscount()))));
        System.out.println("===============================");
    }
}
