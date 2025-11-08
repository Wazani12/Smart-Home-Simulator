package SmartHomeSimulator;

class Camera extends Device {
    private boolean isRecording;

    public Camera(String name, Room room, DeviceStatus status, boolean isRecording) {
        super(name, room, status);
        this.isRecording = isRecording;
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
        System.out.println(String.format("%-15s : %s", "Recording", isRecording));
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

    public boolean isRecording() { return isRecording; }
    public void setRecording(boolean recording) { isRecording = recording; }
}