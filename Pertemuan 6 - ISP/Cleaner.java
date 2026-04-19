public class Cleaner implements Identitas, Shift, Posisi, Cleaning {
    public void identitas() {
        System.out.println("Nama karyawan");
    }

    public void shift() {
        System.out.println("Shift pagi/sore");
    }

    public void posisi() {
        System.out.println("kitchen");
    }

    public void cleaning() {
        System.out.println("bersihkan meja nomor:");
    }
}
