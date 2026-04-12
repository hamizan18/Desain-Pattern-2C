public class Delivery {
    public void deliveryDetail();
    public void energyCount();
}

public class Motor extends Delivery {
    public void deliveryDetail() {
        // Detail dari pengantaran
    }

    public void energyCount() {
        // Energi sebelum berangkat dan setalh kembali
        // Kalkulasi selisih estimasi energi dan energi yang terpakai
    }
}

public class MotorListrik extends Delivery {
    public void deliveryDetail() {
        // Detail dari pengantaran
    }

    public void energyCount() {
        // Energi sebelum berangkat dan setelah kembali
        // Kalkulasi selisih estimasi energi dan energi yang terpakai
    }
}

public class Sepeda extends Delivery {
    public void deliveryDetail() {
        // Detail dari pengantaran
    }

    public void energyCount() {
        throw new UnsupportedOperationException("Sepeda tidak menggunakan bahan bakar");
    }
}