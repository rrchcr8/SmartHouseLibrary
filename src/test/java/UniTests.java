import base.Sensor;
import example.DeviceOne;
import example.DeviceTwo;
import example.SensorA;
import example.StringMessage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UniTests {
    Sensor sensor = new SensorA();
    DeviceOne d1 = new DeviceOne();
    DeviceTwo d2 = new DeviceTwo();

    @Test
    public void testSubscribe() {
        sensor.subscribe(d1);
        sensor.subscribe(d2);
        sensor.setMessage(new StringMessage("A"));
        assertEquals("states doesn't match", "A", d1.getDeviceOneState());
        assertEquals("states doesn't match", "A", d2.getDeviceTwoState());
    }
    @Test
    public void secondMessage() {
        sensor.subscribe(d1);
        sensor.subscribe(d2);
        sensor.setMessage(new StringMessage("B"));
        assertEquals("states doesn't match", "B", d1.getDeviceOneState());
        assertEquals("states doesn't match", "B", d2.getDeviceTwoState());

    }

    @Test
    public void testRemove() {
        sensor.subscribe(d1);
        sensor.subscribe(d2);
        sensor.removeDevice(d1);
        sensor.setMessage(new StringMessage("C"));
        assertEquals("states doesn't match", null, d1.getDeviceOneState());
        assertEquals("states doesn't match", "C", d2.getDeviceTwoState());

    }
}
