package observer;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Sensor {
  private List<Device> devices = new ArrayList<Device>();
  private String state;

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
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
