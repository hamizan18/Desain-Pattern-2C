public class Koki implements Identitas, Shift, Posisi, Cooking {
    public void identitas() {
        System.out.println("Nama karyawan");
    }

    public void shift() {
        System.out.println("Shift pagi/sore");
    }

    public void posisi() {
        System.out.println("kitchen");
    }

    public void cooking() {
        System.out.println("masak order ke:");
    }
}
