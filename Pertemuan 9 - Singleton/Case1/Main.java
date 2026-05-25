package Case1;

class Logger {
    // 1. Static Variables untuk menyimpan satu-satunya instance dalam class
    private static Logger instance;

    // 2. Private Constructor agar tidak bisa di instantiate dari luar
    private Logger() {
        System.out.println("Sistem Logger diaktifkan.. ");
    }

    // 3. Public Method untuk memberikan akses Instance ini
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Buat jika belum ada
        }
        return instance;
    }

    // Method pesan logger
    public void log(String pesan) {
        System.out.println("[LOG]: " + pesan);
    }
}

public class Main {
    public static void main(String[] args) {

        // Call Instance 1
        Logger logger1 = Logger.getInstance();
        logger1.log("User A login,");

        // Call Instance 2
        Logger logger2 = Logger.getInstance();
        logger2.log("User B mengunduh file.");

        // Call Instance 3
        Logger logger3 = Logger.getInstance();
        logger3.log("User C Logout.");

        // Membuktikan bahwa keduanya adalah objek yang SAMA
        if (logger1 == logger2) {
            System.out.println("logger1 dan logger2 adalah objek yang identik.");
        }
        if ((logger1 == logger2) && (logger2 == logger3) && (logger1 == logger3)) {
            System.out.println("logger1, logger2, dan logger3 adalah objek yang identik.");
        }
    }
}
