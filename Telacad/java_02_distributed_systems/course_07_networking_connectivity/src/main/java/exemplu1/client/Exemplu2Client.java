package exemplu1.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Exemplu2Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 4444);
            // socket - socketul serverului
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader cons = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("X: ");
            String x = cons.readLine();
            System.out.println("Y: ");
            String y = cons.readLine();

            printWriter.println(x);
            printWriter.println(y);
            String line = bufferedReader.readLine();
            System.out.println("suma " + line);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
