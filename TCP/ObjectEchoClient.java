package TCP;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ObjectEchoClient {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 8001;

        try (Socket socket = new Socket(host, port);
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                Scanner scanner = new Scanner(System.in)) {

            System.out.println("Connected to server at " + host + ":" + port);

            // Interactive loop
            while (true) {
                System.out.print("Enter message: ");
                String input = scanner.nextLine();

                // Send message to server
                out.writeObject(input);
                out.flush();

                // Receive reply from server
                Object reply = in.readObject();
                System.out.println("Server replied with: " + reply);

                if ("bye".equalsIgnoreCase(input.trim())) {
                    System.out.println("Closing connection...");
                    break;
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
