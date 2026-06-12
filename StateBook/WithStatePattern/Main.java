package WithStatePattern;

public class Main {
    public static void main(String[] args) {
        // Object utama
        Miko miko = new Miko();

        System.out.println("=== Start game ====");

        miko.tekanTombolAtas();
        miko.tekanTombolBawah();
        miko.kenaTanah();
        miko.tekanTombolBawah();

        System.out.println("=== End game ===");
    }
}