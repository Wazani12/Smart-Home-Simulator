package SmartHomeSimulator;

class Door extends Device {
    private boolean isLocked;

    public Door(String name, Room room, DeviceStatus status, boolean isLocked) {
        super(name, room, status);
        this.isLocked = isLocked;
    }

    @Override
    public void turnOn() {
        setStatus(DeviceStatus.ON);
        System.out.println(getName() + " in " + getRoom() + " is OPEN.");
    }

    @Override
    public void turnoff() {
        setStatus(DeviceStatus.OFF);
        System.out.println(getName() + " in " + getRoom() + " is CLOSED.");
    }

    @Override
    public void statusReport() {
        System.out.println("------------------------------");
        System.out.println(String.format("%-15s : %s", "Device", getName()));
        System.out.println(String.format("%-15s : %s", "Room", getRoom()));
        System.out.println(String.format("%-15s : %s", "Status", getStatus()));
        System.out.println(String.format("%-15s : %s", "Locked", isLocked));
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

    public boolean isLocked() { return isLocked; }
    public void setLocked(boolean locked) { isLocked = locked; }
}