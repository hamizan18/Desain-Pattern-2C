package Case1;

import java.util.Random;

public class Motor extends Delivery {
    @Override
    public void deliveryDetail() {
        Random random = new Random();

        String kendaraan = "Motor";
        int jarak = random.nextInt(20 - 3 + 1) + 3; // 3 - 20 km
        int kecepatan = 40; // km/jam
        int waktu = jarak * 60 / kecepatan; // menit

        System.out.println("=== DELIVERY MOTOR ===");
        System.out.println("Kendaraan: " + kendaraan);
        System.out.println("Jarak: " + jarak + " km");
        System.out.println("Waktu: " + waktu + " menit");
    }

    @Override
    public void energyCount() {
        Random random = new Random();

        int awal = random.nextInt(5) + 5; // 5 - 10 liter
        int akhir = random.nextInt(awal - 1) + 1;

        int terpakai = awal - akhir;
        int estimasi = terpakai + random.nextInt(3);

        System.out.println("Bahan bakar awal: " + awal + " L");
        System.out.println("Bahan bakar akhir: " + akhir + " L");
        System.out.println("Estimasi: " + estimasi + " L");
        System.out.println("Terpakai: " + terpakai + " L");
    }
}