
package base;
import java.util.ArrayList;
import java.util.List;

public class Sensor {
    /**
     * List of devices subscribed.
     */
    private List<Device> devices;
    /**
     * constructor.
     */
    public Sensor() {
        devices = new ArrayList<Device>();
    }

    /**
     * This a send message Method.
     * @param message any data type that the sensor can send.
     */
    public void setMessage(Message message) {
        notifyAllDevices(message);
    }

    /**
     * This method aloud users to susbcribe to this sensor.
     * @param device Its a device that will subscribe to this sensor.
     */
    public void subscribe(Device device) {
        devices.add(device);
    }
    public void removeDevice(Device device){
        devices.remove(device);
    }

    public void notifyAllDevices(Message message){
        for (Device device : devices) {
            device.update(message);
        }
    }

}
