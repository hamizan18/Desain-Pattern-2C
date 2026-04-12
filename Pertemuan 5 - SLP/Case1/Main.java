package Case1;

public class Main {
    public static void main(String[] args) {
        Delivery d1 = new Motor();
        Delivery d2 = new MotorListrik();
        Delivery d3 = new Sepeda();

        d1.deliveryDetail();
        d1.energyCount();

        System.out.println();

        d2.deliveryDetail();
        d2.energyCount();

        System.out.println();

        d3.deliveryDetail();
        d3.energyCount(); 
    }
}