
package example;

import base.Message;

public class StringMessage implements Message {
    /**
     * Data type of the message.
     */
    private String string;

    /**
     * create.
     * @param message data type
     */
    public StringMessage(final String message) {
        this.string = message;
    }

    /**
     * It's a classic getter.
     * @return the fieldof this message.
     */
    public String getString() {
        return string;
    }
}
