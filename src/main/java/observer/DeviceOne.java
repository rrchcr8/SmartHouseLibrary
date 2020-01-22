package observer;

public class DeviceOne extends Device {

  public DeviceOne(Sensor sensor) {
  this.sensor = sensor;
  }

  @Override
  public void update() {
    Message message = sensor.getMessage();
    if (message instanceof StringMessage){
      System.out.println( "notificacion recibida D1 " + ((StringMessage) message).getString() );
    }

  }
}
