package messenger.client;

import java.util.ArrayList;
import java.util.List;

public class DisplayThread extends Thread {

    private List<ClientMessageListener> listeners;

    public DisplayThread() {
        listeners = new ArrayList<>();
    }

    @Override
    public void run() {
        new Thread(() -> {
            while (true) {
                String message = ConnectionController.getInstance().receiveMessage();
                notifyAllListeners(message);
            }
        }).start();
    }

    public void addClientMessageListener(ClientMessageListener listener) {
        listeners.add(listener);
    }

    private void notifyAllListeners(String message){
        listeners.forEach(listener -> listener.messageReceived(message));
    }
}
