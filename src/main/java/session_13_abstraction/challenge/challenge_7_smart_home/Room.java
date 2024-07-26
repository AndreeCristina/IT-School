package session_13_abstraction.challenge.challenge_7_smart_home;

import java.util.List;

public class Room {
    private String name;
    private String type;
    private List<Device> devices;

    public Room() {

    }

    public Room(String name, String type, List<Device> devices) {
        this.name = name;
        this.type = type;
        this.devices = devices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void removeDevice(Device device) {
        devices.remove(device);
    }

    public void turnOnAllLights() {
    }

    public void turnOffAllLights() {
    }
}

