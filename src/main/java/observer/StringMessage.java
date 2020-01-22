package observer;

public class StringMessage implements Message {

  String string;
  public StringMessage(String string) {
    this.string = string;
  }

  public String getString() {
    return string;
  }
}
