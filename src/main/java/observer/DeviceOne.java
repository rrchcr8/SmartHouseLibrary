package observer;

public class DeviceOne extends Device {

  public DeviceOne(Sensor sensor) {
  this.sensor = sensor;
  }

  @Override
  public void update() {
    System.out.println( "notificacion recibida D1 " + sensor.getState() );
  }
}
