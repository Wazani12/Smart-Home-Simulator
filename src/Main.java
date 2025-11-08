package SmartHomeSimulator;

public class Main {
    public static void main(String[] args) {
        SmartHome home = new SmartHome();

        Light light1 = new Light("Living Room Light ", Room.LIVING_ROOM, DeviceStatus.OFF, 75);
        AC ac1 = new AC("Bedroom AC", Room.BEDROOM, DeviceStatus.OFF, 22.5);
        Door door1 = new Door("Front Door", Room.LIVING_ROOM, DeviceStatus.OFF, true);
        Camera cam1 = new Camera("Entrance Camera", Room.LIVING_ROOM, DeviceStatus.OFF, false);

        home.addDevice(light1);
        home.addDevice(ac1);
        home.addDevice(door1);
        home.addDevice(cam1);

        light1.turnOn();
        ac1.turnOn();
        door1.turnOn();
        cam1.turnOn();

        home.showAllDevices();

        // Using scheduler
        SmartHome.Scheduler scheduler = home.new Scheduler();
        scheduler.schedule(light1, DeviceStatus.OFF);
        scheduler.schedule(ac1, DeviceStatus.OFF);

        home.showAllDevices();
        System.out.println("Total devices: " + Device.getDeviceCount());
    }
}
