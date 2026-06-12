package Case;
// Context CLass
class TravelContext {
    private TravelStrategy travelStrategy;

    // Constructor
    public TravelContext(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    // Setter untuk mengubah strategi
    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    // Perform Calculation
    public void performanceCalculation(double jarak) {
        travelStrategy.calculateTime(jarak);
        travelStrategy.calculatePrice(jarak);
    }
}

// Strategy Interface
interface TravelStrategy {
    void calculateTime(double jarak);
    void calculatePrice(double jarak);
}

// Concrete Strategy
// BikeStrategy
class BikeStrategy implements TravelStrategy {
    @Override
    public void calculateTime(double jarak) {
        System.out.println("Motor dengan kecepatan 30km/jam");
        System.out.println("Waktu tempuh: " + (jarak/30)*60 + " menit");
    }
    public void calculatePrice(double jarak) {
        System.out.println("Motor memiliki harga 2000/km");
        System.out.println("Harga naik ojek motor dengan jarak " + jarak + " Km adalah: " + jarak * 2000 + " Rupiah");

        System.out.println("==============================");
    }
}

// BusStrategy
class BusStrategy implements TravelStrategy {
    @Override
    public void calculateTime(double jarak) {
        System.out.println("Bus dengan kecepatan 40km/jam");
        System.out.println("Waktu tempuh: " + (jarak/40)*60 + " menit");
    }

    public void calculatePrice(double jarak) {
        System.out.println("Bus memiliki harga 800/km");
        System.out.println("Harga naik bus dengan jarak " + jarak + "Km adalah: " + jarak*800 + " Rupiah");
        System.out.println("==============================");
    }
}

// TaxiStrategy
class TaxiStrategy implements TravelStrategy {
    @Override
    public void calculateTime(double jarak) {
        System.out.println("Taxi dengan kecepatan 60km/jam");
        System.out.println("Waktu tempuh: " + (jarak/60)*60 + " menit");
    }

    public void calculatePrice(double jarak) {
        System.out.println("Bus memiliki harga 3500/km");
        System.out.println("Harga naik Taxi dengan jarak " + jarak + " Km adalah: " + jarak*3500 + " Rupiah");
        System.out.println("=============================");
    }
}

// Client
public class Client {
    public static void main(String[] args) {
        // Create TravelContext with BikeStrategy
        TravelContext travelContext = new TravelContext(new BikeStrategy());
        double jarak = 30;
        travelContext.performanceCalculation(jarak);

        // Change strategy to MergeSortStrategy
        travelContext.setTravelStrategy(new BusStrategy());
        travelContext.performanceCalculation(jarak);

        // Change strategy to QuickSortStrategy
        travelContext.setTravelStrategy(new TaxiStrategy());
        travelContext.performanceCalculation(jarak);
    }
}