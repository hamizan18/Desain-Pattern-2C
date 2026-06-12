package SmellCode;

public class Main {
    public static void main(String[] args) {
        Miko miko = new Miko();

        System.out.println("=== Start game ===");

        miko.tekanTombolAtas();
        miko.tekanTombolBawah();
        miko.kenaTanah();
        miko.tekanTombolBawah();

        System.out.println("=== End game ===");
    }
}
