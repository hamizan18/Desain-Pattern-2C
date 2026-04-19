public class KokiFactory implements Identitas, Shift, Posisi, Cooking {
    public void identitas() {
        System.out.println("Nama karyawan");
    }

    public void shift() {
        System.out.println("Shift pagi");
    }
    
    public void posisi() {
        System.out.println("Factory");
    }

    public void cooking() {
        System.out.println("masak batch ke:");
    }
}
