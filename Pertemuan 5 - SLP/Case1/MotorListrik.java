package Case1;

import java.util.Random;

public class MotorListrik extends Delivery {
    @Override
    public void deliveryDetail() {
        Random random = new Random();

        String kendaraan = "Motor Listrik";
        int jarak = random.nextInt(20 - 3 + 1) + 3;
        int kecepatan = 35;
        int waktu = jarak * 60 / kecepatan;

        System.out.println("=== DELIVERY MOTOR LISTRIK ===");
        System.out.println("Kendaraan: " + kendaraan);
        System.out.println("Jarak: " + jarak + " km");
        System.out.println("Waktu: " + waktu + " menit");
    }

    @Override
    public void energyCount() {
        Random random = new Random();

        int awal = random.nextInt(50) + 50; // 50 - 100 %
        int akhir = random.nextInt(awal - 1) + 1;

        int terpakai = awal - akhir;
        int estimasi = terpakai + random.nextInt(5);

        System.out.println("Baterai awal: " + awal + "%");
        System.out.println("Baterai akhir: " + akhir + "%");
        System.out.println("Estimasi: " + estimasi + "%");
        System.out.println("Terpakai: " + terpakai + "%");
    }
}