public class Courier implements Identitas, Shift, Posisi, Delivery {
    public void identitas() {
        System.out.println("Nama karyawan");
    }

    public void shift() {
        System.out.println("Shift pagi");
    }

    public void posisi() {
        System.out.println("Delivery");
    }

    public void delivery() {
        System.out.println("Tarik data dari Class Delivery");
    }
}
