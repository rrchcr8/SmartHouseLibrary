package observer;

public class DeviceTwo extends Device {

  public DeviceTwo(Sensor sensor) {
    this.sensor = sensor;
//    this.sensor.suscribe(this);
  }

  @Override
  public void update() {
    System.out.println( "notificacion recibida D2 " + sensor.getState() );
  }
}
