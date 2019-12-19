package observer;

public class PatternDemo {
  public static void main(String[] args) {
    Sensor sensor = new Sensor();

    new DeviceOne(sensor);
    new DeviceTwo(sensor);

    System.out.println("First state change: A");
    sensor.setState("A");
    System.out.println("Second state change: B");
    sensor.setState("B");
  }
}
