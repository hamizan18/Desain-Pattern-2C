package Case1;
interface Lightning {
    public void chargeWithLightning();
}

interface UsbTypeC {
    void chargeWithUsbTypeC();
}

class MiCharger {
    private static MiCharger instance;

    private MiCharger() {}

    /* 
    Uses Singleton with thread-safee capability with lazy-loading
    */
    public synchronized static MiCharger getInstance() {
        if (instance == null) {
            instance = new MiCharger();
        }

        return instance;
    }
    /* 
    Charge using USB-C
    */
    public void charge(UsbTypeC port) {
        port.chargeWithUsbTypeC();
    }
}

class Xiaomi {
    private String storage, ram, batteryDuration;
    private final MiCharger charger;

    public Xiaomi() {
        charger = MiCharger.getInstance();
    }

    public Xiaomi(String storage, String ram, String batteryDuration) {
        this();
        this.storage = storage;
        this.ram = ram;
        this.batteryDuration = batteryDuration;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getBatteryDuration() {
        return batteryDuration;
    }

    public void setBatteryDuration(String batteryDuration) {
        this.batteryDuration = batteryDuration;
    }

    public MiCharger getCharger() {
        return charger;
    }

    public void charge(UsbTypeC port) {
        charger.charge(port);
    }

    @Override
    public String toString() {
        return "Xiaomi [storage=" + storage + ", ram=" + ram + ", batteryDuration=" + batteryDuration + "]";
    }
}

class IPhonePort implements Lightning {
    @Override
    public void chargeWithLightning() {
        System.out.println("The phone is charged with Lightning port");
    }
}

class MiPort implements UsbTypeC {
    @Override
    public void chargeWithUsbTypeC() {
        System.out.println("The phone is charged with USB Type C");
    }
}

class LightningUsbCAdapter implements UsbTypeC {
    private IPhonePort iPort;

    public LightningUsbCAdapter(IPhonePort iPort) {
        this.iPort = iPort;
    }

    @Override
    public void chargeWithUsbTypeC() {
        iPort.chargeWithLightning();
    }
}

public class Main {
    public Main() {
        // Define Phone Object
        Xiaomi redmiNote14 = new Xiaomi("512GB", "8GB", "6000MaH");
        System.out.println(redmiNote14.toString());
        chargeWithUsbTypeC(redmiNote14);
        chargeWithLightning(redmiNote14);
    }

    // Charger HP seharusnya
    private void chargeWithUsbTypeC(Xiaomi smartphone) {
        MiPort miPort = new MiPort();
        smartphone.charge(miPort);
    }

    // Charger dengan adapter
    private void chargeWithLightning(Xiaomi smartphone) {
        IPhonePort iPhonePort = new IPhonePort();
        LightningUsbCAdapter lightningAdapter = new LightningUsbCAdapter(iPhonePort);
        smartphone.charge(lightningAdapter);
    }

    public static void main(String[] args) {
        new Main();
    }
}