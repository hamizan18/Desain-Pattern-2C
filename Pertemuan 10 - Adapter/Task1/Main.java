package Task1;

interface Lightning {
    public void chargeWithLightning();
}

interface MicroUSB {
    void chargeWithMicroUSB();
}

interface UsbTypeC {
    void chargeWithUsbTypeC();
}

class MiCharger {
    private static MiCharger instance;

    private MiCharger() {
    }

    /*
     * Uses Singleton with thread-safe capability with lazy-loading
     */
    public synchronized static MiCharger getInstance() {
        if (instance == null) {
            instance = new MiCharger();
        }

        return instance;
    }

    /*
     * Charge using USB-C
     */
    public void charge(UsbTypeC port) {
        port.chargeWithUsbTypeC();
    }
}

class SamsungCharger {
    private static SamsungCharger instance;

    private SamsungCharger() {
    }

    public synchronized static SamsungCharger getInstance() {
        if (instance == null) {
            instance = new SamsungCharger();
        }

        return instance;
    }

    public void charge(MicroUSB port) {
        port.chargeWithMicroUSB();
    }
}

class Samsung {
    private String storage, ram, batteryDuration;
    private final SamsungCharger charger;

    public Samsung() {
        charger = SamsungCharger.getInstance();
    }

    public Samsung(String storage, String ram, String batteryDuration) {
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

    public SamsungCharger getCharger() {
        return charger;
    }

    public void charge(MicroUSB port) {
        charger.charge(port);
    }

    @Override
    public String toString() {
        return "Samsung [storage=" + storage + ", ram=" + ram + ", batteryDuration=" + batteryDuration + "]";
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

class SamsungPort implements MicroUSB {
    @Override
    public void chargeWithMicroUSB() {
        System.out.println("The phone is charged with MicroUSB port");
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

class LightningMicroUSBAdapter implements MicroUSB {
    private IPhonePort iPort;

    public LightningMicroUSBAdapter(IPhonePort iPort) {
        this.iPort = iPort;
    }

    @Override
    public void chargeWithMicroUSB() {
        iPort.chargeWithLightning();
    }
}

class TypeCLightningAdapter implements Lightning {
    private MiPort miPort;

    public TypeCLightningAdapter(MiPort miPort) {
        this.miPort = miPort;
    }

    @Override
    public void chargeWithLightning() {
        miPort.chargeWithUsbTypeC();
    }
}

class TypeCMicroUSBAdapter implements MicroUSB {
    private MiPort miPort;

    public TypeCMicroUSBAdapter(MiPort miPort) {
        this.miPort = miPort;
    }

    @Override
    public void chargeWithMicroUSB() {
        miPort.chargeWithUsbTypeC();
    }
}

public class Main {
    public Main() {
        // Define Phone Object
        Xiaomi redmiNote14 = new Xiaomi("512GB", "8GB", "6000MaH");
        Samsung samsungJ2 = new Samsung("160GB", "10GB", "8000MaH");

        System.out.println(redmiNote14.toString());
        System.out.println(samsungJ2.toString());

        System.out.println("\n--- XIAOMI REDMI NOTE 14 ---");
        chargeWithUsbTypeC(redmiNote14);
        chargeWithLightning(redmiNote14);
        chargeWithTypeC_Lightning(redmiNote14);

        System.out.println("\n--- SAMSUNG J2 PRIME ---");
        chargeWithMicroUSB(samsungJ2);
        chargeWithTypeC_MicroUSB(samsungJ2);
    }

    // Charger HP seharusnya
    private void chargeWithUsbTypeC(Xiaomi smartphone) {
        MiPort miPort = new MiPort();
        System.out.println("\nCharging dengan USB Type-C port:");
        smartphone.charge(miPort);
    }

    // Charger dengan adapter
    private void chargeWithLightning(Xiaomi smartphone) {
        IPhonePort iPhonePort = new IPhonePort();
        LightningUsbCAdapter lightningAdapter = new LightningUsbCAdapter(iPhonePort);
        System.out.println("\nCharging dengan Lightning to USB Type-C Adapter:");
        smartphone.charge(lightningAdapter);
    }

    private void chargeWithTypeC_Lightning(Xiaomi smartphone) {
        MiPort miPort = new MiPort();
        TypeCLightningAdapter typeCAdapter = new TypeCLightningAdapter(miPort);
        System.out.println("\nCharging dengan Type-C to Lightning Adapter:");
        typeCAdapter.chargeWithLightning();
    }

    private void chargeWithMicroUSB(Samsung smartphone) {
        IPhonePort iPhonePort = new IPhonePort();
        LightningMicroUSBAdapter lightningAdapter = new LightningMicroUSBAdapter(iPhonePort);
        System.out.println("\nCharging dengan Lightning to MicroUSB Adapter:");
        smartphone.charge(lightningAdapter);
    }

    private void chargeWithTypeC_MicroUSB(Samsung smartphone) {
        MiPort miPort = new MiPort();
        TypeCMicroUSBAdapter typeCAdapter = new TypeCMicroUSBAdapter(miPort);
        System.out.println("\nCharging dengan Type-C to MicroUSB Adapter:");
        smartphone.charge(typeCAdapter);
    }

    public static void main(String[] args) {
        new Main();
    }
}

// jujur skit kepala..