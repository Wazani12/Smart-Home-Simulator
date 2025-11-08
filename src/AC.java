package SmartHomeSimulator;

class AC extends Device {
    private double temperature;

    public AC(String name, Room room, DeviceStatus status, double temperature) {
        super(name, room, status);
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        setStatus(DeviceStatus.ON);
        System.out.println(getName() + " in " + getRoom() + " is ON at " + temperature + "°C.");
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
        System.out.println(String.format("%-15s : %.1f°C", "Temperature", temperature));
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