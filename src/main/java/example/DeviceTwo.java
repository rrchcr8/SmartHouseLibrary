
package example;

import base.Device;
import base.Message;

public class DeviceTwo implements Device {
    /**
     * This is the state of the device that will be changed
     * according to the sensor device.
     */
    private String deviceTwoState;
    /**
     * Update method for device number 2.
     * @param message would be any kind of data type.
     * (String, integer, boolean, etc).
     * Design to be implemented
     */
    @Override
    public void update(final Message message) {
        if (message instanceof StringMessage) {
            deviceTwoState = ((StringMessage) message).getString();
        }
    }
    /**
     * Its a common getter.
     * @return device 2 State field.
     */
    public String getDeviceTwoState() {
        return deviceTwoState;
    }
}
