class Device {
    protected String deviceId;
    protected String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

// Subclass Thermostat with additional attributes
class Thermostat extends Device {
    private int temperatureSetting;

    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class to demonstrate single inheritance
public class SmartHomeDevice {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("T1001", "ON", 22);
        thermostat.displayStatus();
    }
}