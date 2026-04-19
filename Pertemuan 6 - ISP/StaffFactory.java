public class StaffFactory implements Identitas, Shift, Posisi, Packing, Storing {
    public void identitas() {
        System.out.println("Nama karyawan");
    }

    public void shift() {
        System.out.println("Shift pagi");
    }

    public void posisi() {
        System.out.println("Factory");
    }

    public void packing() {
        System.out.println("Packing item nomor:");
    }

    public void storing() {
        System.out.println("simpan batch nomor:_ ke warehouse");
    }
}
