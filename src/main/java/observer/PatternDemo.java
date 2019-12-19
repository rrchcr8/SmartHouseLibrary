package observer;

public class PatternDemo {
  public static void main(String[] args) {
    Sensor sensor = new Sensor();

    new DeviceOne(sensor);
   Device d= new DeviceTwo(sensor);

    System.out.println("First state change: A");
    sensor.setState("A");
    System.out.println("Second state change: B");
    sensor.setState("B");

    sensor.removeDevice(d);
    System.out.println("Second state change: c");
    sensor.setState("C");
  }
}
