
package example;

import base.Device;
import base.Message;

public class DeviceTwo extends Device {

  /**
   * Update method for device number 2.
   * @param message would be any kind of data type.
   * (String, integer, boolean, etc).
   * Design to be implemented
   */
  @Override
  public void update(final Message message) {
    if (message instanceof StringMessage) {
      System.out.println("notificacion recibida D2 "
              + ((StringMessage) message).getString());
    }
  }
}
