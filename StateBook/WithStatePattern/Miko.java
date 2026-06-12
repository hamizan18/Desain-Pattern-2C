package WithStatePattern;

// Context Class
public class Miko {
    private MikoState state;

    public Miko() {
        // Status awal Miko berdiri
        this.state = new IdleState();
    }

    public void setState(MikoState state) {
        this.state = state;
    }

    // Fungsi-fungsi utama yang diakses diluar
    public void tekanTombolAtas() {
        state.tombolAtas(this);
    }

    public void tekanTombolBawah() {
        state.tombolBawah(this);
    }

    public void kenaTanah() {
        state.menyentuhTanah(this);
    }
}

class IdleState implements MikoState {
    @Override
    public void tombolAtas(Miko miko) {
        // Karena miko lagi di tanah, jadi dia bisa melompat
        System.out.println("Miko melompat.");
        miko.setState(new JumpingState());
    }

    @Override
    public void tombolBawah(Miko miko) {
        // Karena miko lagi berada di tanah, jadi dia bisa crouching (tiarap)
        System.out.println("Miko tiarap.");
        miko.setState(new CrouchingState());
    }

    @Override
    public void menyentuhTanah(Miko miko) {
        System.out.println("Miko menyentuh tanah, Miko sedang berdiri.");
    }
}

class JumpingState implements MikoState {
    @Override
    public void tombolAtas(Miko miko) {
        // Karena Miko udah di udara, jdi kalo di klik tombol atas ga akan ngerubah
        // state nya lagi
        System.out.println("Miko berada di udara, tidak dapat melompat lagi.");
    }

    @Override
    public void tombolBawah(Miko miko) {
        // Ketika Miko mencoba tiarap di udara, maka gaakan menghasilkan apapun
        System.out.println("Miko sedang melompat, tidak bisa tiarap.");
    }

    @Override
    public void menyentuhTanah(Miko miko) {
        // Kembali ke status berdiri ketika menyentuh tanah
        System.out.println("Miko menyentuh tanah, Miko kembali berdiri");
        miko.setState(new IdleState()); // Balik lgi ke state idle
    }
}

class CrouchingState implements MikoState {
    @Override
    public void tombolAtas(Miko miko) {
        // Karena Miko sedang tiarap, miko akan terbangun terlebih dahulu sebelum
        // melompat
        System.out.println("Miko terbangun dari tiarap nya.");
        miko.setState(new IdleState()); // Bangun dari tiarap (balik ke idle)
    }

    @Override
    public void tombolBawah(Miko miko) {
        // Karena Miko sedang tiarap, tidak akan merubah apapun
        System.out.println("Miko sedang tiarap.");
    }

    @Override
    public void menyentuhTanah(Miko miko) {
        // Status tetap sama, karena Miko sedang tiarap
        System.out.println("Miko menyentuh tanah, Miko sedang tiarap");
    }
}