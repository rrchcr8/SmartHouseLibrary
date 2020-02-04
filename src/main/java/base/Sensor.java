
package base;
import java.util.ArrayList;
import java.util.List;

public abstract class Sensor {
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
     * You can use this method or implement one by your one.
     * @param message any data type that the sensor can send.
     */
    public void setMessage(final Message message) {
        notifyAllDevices(message);
    }

    /**
     * This method aloud users to subscribe to this sensor.
     * @param device Its a device that will subscribe to this sensor.
     */
    public void subscribe(final Device device) {
        devices.add(device);
    }

    /**
     * This method aloud users to unsubscribe to this sensor.
     * @param device
     */
    public void removeDevice(final Device device) {
        devices.remove(device);
    }

    /**
     * This method notifies to all de subscribe devices.
     * @param message can be any data type.
     */
    public void notifyAllDevices(final Message message) {
        for (Device device : devices) {
            device.update(message);
        }
    }

}
