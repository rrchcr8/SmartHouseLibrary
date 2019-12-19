package observer;

public abstract class Device {
  protected Sensor sensor;
  public abstract void update();
}