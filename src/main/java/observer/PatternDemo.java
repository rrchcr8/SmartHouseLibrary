package observer;

public class PatternDemo {
  public static void main(String[] args) {
    Sensor sensor = new Sensor();

    Device d1 = new DeviceOne(sensor);
    Device d2 = new DeviceTwo(sensor);

    sensor.suscribe(d1);
    sensor.suscribe(d2);

    System.out.println("First state change: A");
    sensor.setState("A");
    System.out.println("Second state change: B");
    sensor.setState("B");

    sensor.removeDevice(d1);
    System.out.println("Second state change: c");
    sensor.setState("C");
  }
}
