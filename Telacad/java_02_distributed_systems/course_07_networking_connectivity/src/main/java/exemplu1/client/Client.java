package exemplu1.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 4444);
            // socket - socketul serverului
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.println("Un mesaj de la client!!!");
            String line = bufferedReader.readLine();
            System.out.println("Am primit de la server mesajul: " + line);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
