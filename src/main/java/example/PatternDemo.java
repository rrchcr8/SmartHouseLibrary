
package example;

import base.Device;
import base.Sensor;

final class PatternDemo {
  private PatternDemo() {
  }

  public static void main(final String[] args) {
    Sensor sensor = new Sensor();

    Device d1 = new DeviceOne();
    Device d2 = new DeviceTwo();

    sensor.subscribe(d1);
    sensor.subscribe(d2);

    System.out.println("First state change: A");
    sensor.setMessage(new StringMessage("A"));
    System.out.println("Second state change: B");
    sensor.setMessage(new StringMessage("B"));

    System.out.println("unsubscribe device one");
    sensor.removeDevice(d1);
    System.out.println("Third state change: c");
    sensor.setMessage(new StringMessage("C"));
  }
}
