package server.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try {
            System.out.println("Se incearca deschiderea portului 4444");

            ServerSocket ss = new ServerSocket(4444);

            System.out.println("Portul 4444 a fost deschis ");
            System.out.println("Se asteapta un client...");

            Socket socket = ss.accept(); // waits for a client to connect
            // socket-ul clientului
            System.out.println("Clientul s-a conectat");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);

            System.out.println("Se asteapta un mesaj");
            String line = bufferedReader.readLine();
            printWriter.println(new StringBuilder(line).reverse().toString());

            System.out.println("Am primit " + line);

            System.out.println("Serverul se inchide");
            ss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
