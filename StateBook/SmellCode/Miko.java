package SmellCode;

// Context
public class Miko {
    // terpaksa harus menggunakan konstanta untuk tandain statusnya
    private static final int idleSate = 0;
    private static final int jumpingState = 1;
    private static final int crouchingState = 2;

    // Menimpan status aktif
    private int currentState;

    public Miko() {
        // Status awal: Miko nya berdiri
        this.currentState = idleSate;
    }

    // Function tombolAtas berserakan dengan percabangan bertingkatnyah
    public void tekanTombolAtas() {
        if (currentState == idleSate) {
            System.out.println("Miko melompat.");
            currentState = jumpingState; // Ganti ke melompat
        } else if (currentState == jumpingState) {
            System.out.println("Miko berada di udara, tidak dapat melompat lagi.");
            // Status sama
        } else if (currentState == crouchingState) {
            System.out.println("Miko terbagun dari tiarap nya.");
            currentState = idleSate; // Balik berdiri
        }
    }

    // Function tombolBawah juga berserakan
    public void tekanTombolBawah() {
        if (currentState == idleSate) {
            System.out.println("Miko tiarap.");
            currentState = crouchingState; // Ganti ke tiarapp
        } else if (currentState == jumpingState) {
            System.out.println("Miko berada di udara, tidak bisa tiarap.");
            // Status sama, ga berubah
        } else if (currentState == crouchingState) {
            System.out.println("Miko sedang tiarap.");
            // Gaada ngerubah status nya
        }
    }

    // function deteksi tanah yang harus cek status aktif saat ini
    public void kenaTanah() {
        if (currentState == idleSate) {
            System.out.println("Miko menyentuh tanah, Miko sedang berdiri.");
        } else if (currentState == jumpingState) {
            System.out.println("Miko menyentuh tanah, Miko kembali berdiri.");
            currentState = idleSate; // Balik berdiri lagi
        } else if (currentState == crouchingState) {
            System.out.println("Miko menyentuh tanah, Miko sedang tiarap.");
        }
    }
}