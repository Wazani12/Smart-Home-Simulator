package SmartHomeSimulator;

public class Light extends Device{
    private int brightness;

    public Light(String name, Room room, DeviceStatus status, int brightness) {
        super(name, room, status);
        this.brightness = brightness;
    }

    @Override
    public void turnOn() {
        setStatus(DeviceStatus.ON);
        System.out.println(getName() + " in " + getRoom() + " is ON.");
    }

    @Override
    public void turnoff() {
        setStatus(DeviceStatus.OFF);
        System.out.println(getName() + " in " + getRoom() + " is OFF.");
    }

    @Override
    public void statusReport() {
        System.out.println("------------------------------");
        System.out.println(String.format("%-15s : %s", "Device", getName()));
        System.out.println(String.format("%-15s : %s", "Room", getRoom()));
        System.out.println(String.format("%-15s : %s", "Status", getStatus()));
        System.out.println(String.format("%-15s : %d", "Brightness", brightness));
        System.out.println("------------------------------");
    }

    @Override
    public void manualControl() {
        System.out.println("Manual control of " + getName());
    }

    @Override
    public void autoControl() {
        System.out.println("Automatic control of " + getName());
    }
}
