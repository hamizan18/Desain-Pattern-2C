public class Waiter implements Identitas, Shift, Posisi, Cooking {
    public void identitas() {
        System.out.println("Nama karyawan");
    }

    public void shift() {
        System.out.println("Shift pagi/sore");
    }

    public void posisi() {
        System.out.println("frontline");
    }

    public void cooking() {
        System.out.println("antar order ke:");
    }
}
