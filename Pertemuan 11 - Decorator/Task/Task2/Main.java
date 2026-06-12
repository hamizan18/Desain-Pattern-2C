package Task.Task2;

interface Orang {
    String getSituation();
    double getTemperature();
    int getPrice();
}

class OrangOutfitless implements Orang {
    @Override
    public String getSituation() {
        return "Aku kedinginan";
    }

    @Override
    public double getTemperature() {
        return 0.0;
    }

    @Override
    public int getPrice()  {
        return 000;
    }
}

abstract class OrangBanget implements Orang {
    protected Orang decoratedOrang;

    public OrangBanget(Orang decoratedOrang) {
        this.decoratedOrang = decoratedOrang;
    }

    @Override
    public String getSituation() {
        return decoratedOrang.getSituation();
    }

    @Override
    public double getTemperature() {
        return decoratedOrang.getTemperature();
    }

    @Override
    public int getPrice() {
        return decoratedOrang.getPrice();
    }
}

class SweaterDecorator extends OrangBanget {
    public SweaterDecorator(Orang decoratedOrang) {
        super(decoratedOrang);
    }

    @Override
    public String getSituation() {
        return decoratedOrang.getSituation() + ", ni lagi menghangatkan badan";
    }

    @Override
    public double getTemperature() {
        return decoratedOrang.getTemperature() + 18.0;
    }

    @Override
    public int getPrice() {
        return decoratedOrang.getPrice() + 150;
    }
}

class MantelDecorator extends OrangBanget {
    public MantelDecorator(Orang decoratedOrang) {
        super(decoratedOrang);
    }

    @Override
    public String getSituation() {
        return decoratedOrang.getSituation() + ", sambil melindungi diri dari hujan";
    }

    @Override
    public double getTemperature() {
        return decoratedOrang.getTemperature() + 4.00;
    }
    @Override
    public int getPrice() {
        return decoratedOrang.getPrice() + 190;
    }
}

public class Main {
    public static void main(String[] args) {
        // Ga pake baju
        Orang orang = new OrangOutfitless();
        System.out.println("--- STATUS KARAKTER ---");
        System.out.println("Kondisi Karakter\t: " + orang.getSituation());
        System.out.println("Suhu Karakter\t\t: " + orang.getTemperature() + "°");
        System.out.println("Pengeluaran Karakter\t: Rp" + orang.getPrice() + ".000,00");

        // Pake Sweater aja
        Orang orangBersweater = new SweaterDecorator(new OrangOutfitless());
        System.out.println("\n--- STATUS KARAKTER ---");
        System.out.println("Kondisi Karakter\t: " + orangBersweater.getSituation());
        System.out.println("Suhu Karakter\t\t: " + orangBersweater.getTemperature() + "°");
        System.out.println("Pengeluaran Karakter\t: Rp" + orangBersweater.getPrice() + ".000,00");

        // Pake Mantel aja
        Orang orangBermantel = new MantelDecorator(new OrangOutfitless());
        System.out.println("\n--- STATUS KARAKTER ---");
        System.out.println("Kondisi Karakter\t: " + orangBermantel.getSituation());
        System.out.println("Suhu Karakter\t\t: " + orangBermantel.getTemperature() + "°");
        System.out.println("Pengeluaran Karakter\t: Rp" + orangBermantel.getPrice() + ".000,00");        

        // Pake mantel + Sweater
        Orang orangBermantelPlusSweater = new MantelDecorator(new SweaterDecorator(new OrangOutfitless()));
        System.out.println("\n--- STATUS KARAKTER ---");
        System.out.println("Kondisi Karakter\t: " + orangBermantelPlusSweater.getSituation());
        System.out.println("Suhu Karakter\t\t: " + orangBermantelPlusSweater.getTemperature() + "°");
        System.out.println("Pengeluaran Karakter\t: Rp" + orangBermantelPlusSweater.getPrice() + ".000,00");

    }
}
