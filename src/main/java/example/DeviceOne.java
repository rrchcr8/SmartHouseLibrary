
package example;

import base.Device;
import base.Message;

public class DeviceOne extends Device {
  /**
   * WHAT DOES THE FOX SAY?
   * @param message would be any kind of data type.
   * (String, integer, boolean, etc).
   * Design to be implemented.
   * */
  @Override
  public void update(final Message message) {
    if (message instanceof StringMessage) {
      System.out.println("notificacion recibida D1 "
              + ((StringMessage) message).getString());
    }

  }
}
