package SmartHomeSimulator;
import java.util.ArrayList;

class SmartHome {
    private ArrayList<Device> devices;

    public SmartHome() {
        devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void showAllDevices() {
        for (Device d : devices) {
            d.statusReport();
        }
    }

    // Inner class Scheduler
    class Scheduler {
        public void schedule(Device device, DeviceStatus status) {
            device.setStatus(status);
            System.out.println("Scheduled: " + device.getName() + " set to " + status);
        }
    }
}
