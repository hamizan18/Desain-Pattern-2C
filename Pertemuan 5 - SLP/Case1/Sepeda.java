package Case1;

import java.util.Random;

public class Sepeda extends Delivery {
    @Override
    public void deliveryDetail() {
        Random random = new Random();

        String kendaraan = "Sepeda";
        int jarak = random.nextInt(10 - 1 + 1) + 1;
        int kecepatan = 15;
        int waktu = jarak * 60 / kecepatan;

        System.out.println("=== DELIVERY SEPEDA ===");
        System.out.println("Kendaraan: " + kendaraan);
        System.out.println("Jarak: " + jarak + " km");
        System.out.println("Waktu: " + waktu + " menit");
        System.out.println("Ramah lingkungan 🌱");
    }
}