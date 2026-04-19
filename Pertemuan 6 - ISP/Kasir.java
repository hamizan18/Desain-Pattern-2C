public class Kasir implements Identitas, Shift, Posisi, Payment {
    public void identitas() {
        System.out.println("Nama karyawan");
    }

    public void shift() {
        System.out.println("Shift pagi/sore");
    }

    public void posisi() {
        System.out.println("frontline");
    }

    public void payment() {
        System.out.println("Pembayaran");
    }

}
