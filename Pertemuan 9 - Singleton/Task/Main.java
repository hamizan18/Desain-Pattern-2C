package Task;

class Configure {
    private static Configure instance;

    private String warnaPage;
    private String font;
    private int ukuranGrid;

    private Configure() {
        System.out.println("Setting aplikasi dibuat.. ");

        warnaPage = "Dark Blue";
        font = "Poppins";
        ukuranGrid = 4;
    }

    public static Configure getInstance() {
        if (instance == null) {
            instance = new Configure();
        }
        return instance;
    }

    public void showSetting(String halaman) {
        System.out.println("\n== " + halaman + " ==");

        System.out.println("Warna Halaman\t: " + warnaPage);
        System.out.println("Ukuran Grid\t: " + ukuranGrid);
        System.out.println("Font\t\t: " + font);
    }
}

public class Main {
    public static void main(String[] args) {
        Configure home = Configure.getInstance();
        home.showSetting("Homeopage");

        Configure product = Configure.getInstance();
        product.showSetting("Product Page");

        Configure detail = Configure.getInstance();
        detail.showSetting("Product Detail Page");

        Configure cart = Configure.getInstance();
        cart.showSetting("Cart Page");

        if (home == product && product == detail && detail == cart) {
            System.out.println("\nSemua halaman menggunakan konfigurasi yg sama.");
        }
    }
}
