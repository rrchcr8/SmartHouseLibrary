package observer;
import java.util.ArrayList;
import java.util.List;

public class Sensor {
  private List<Device> devices;
  Message message;

  Sensor() {
    devices = new ArrayList<Device>();
  }

  public Message getMessage() {
    return message;
  }

  public void setMessage(Message message) {
    this.message = message;
    notifyAllDevices();
  }

    public void suscribe(Device device){
      devices.add(device);
    }
  public void removeDevice(Device device){
    devices.remove(device);
  }

    public void notifyAllDevices(){
      for (Device device : devices) {
        device.update();
      }
    }

}
