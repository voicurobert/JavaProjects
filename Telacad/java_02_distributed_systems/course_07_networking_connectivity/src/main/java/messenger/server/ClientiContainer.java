package messenger.server;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ClientiContainer {
    private static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    private static List<ServerThread> clienti = new ArrayList<>();

    public static void addClient(ServerThread client) {
        try {
            lock.writeLock().lock();
            clienti.add(client);
        } finally {
            lock.writeLock().unlock();
        }

    }

    public static synchronized void sendMessageToAll(String message) {
        try {
            lock.readLock().lock();
            clienti.forEach(serverThread -> serverThread.sendMessage(message));
        } finally {
            lock.readLock().unlock();
        }

    }
}
