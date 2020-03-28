package exemplu1.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Exemplu2Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(4444);
            Socket socket = ss.accept(); // waits for a client to connect

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);

            int x = Integer.parseInt(bufferedReader.readLine());
            int y = Integer.parseInt(bufferedReader.readLine());

            printWriter.println(x+y);

            ss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
