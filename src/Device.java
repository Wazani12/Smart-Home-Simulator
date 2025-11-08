package SmartHomeSimulator;

import jdk.jshell.Snippet;

public abstract class Device implements Controllable{
    private  String name;
    private Room room;
    private DeviceStatus status ;
    static private int deviceCount = 0;

    public Device(String name, Room room, DeviceStatus status) {
        this.name = name;
        this.room = room;
        this.status = status;
        deviceCount++;
    }

    public abstract void turnOn();
    public abstract  void turnoff();
    public abstract  void statusReport();

    public final DeviceStatus geStatus() {
        return this.status; // returns "ON", "OFF", or "STANDBY"
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
    public void setStatus(DeviceStatus status) { this.status = status; }

    public static int getDeviceCount() { return deviceCount; }

    public DeviceStatus getStatus() {
        return status;
    }
}
