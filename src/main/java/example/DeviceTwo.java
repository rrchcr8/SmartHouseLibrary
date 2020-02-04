package example;

import base.Device;
import base.Message;

public class DeviceTwo extends Device {

//  public DeviceTwo(Sensor sensor) {
//    this.sensor = sensor;
//  }

  @Override
  public void update(Message message) {
//    Message message = sensor.getMessage();
    if (message instanceof StringMessage){
      System.out.println( "notificacion recibida D2 " + ((StringMessage) message).getString() );
    }
  }
}
