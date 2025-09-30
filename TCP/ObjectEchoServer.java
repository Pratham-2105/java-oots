package TCP;

import java.io.*;
import java.net.*;

public class ObjectEchoServer {
    public static void main(String[] args) {
        int port = 8001;
        System.out.println("Starting ObjectEchoServer on port " + port);

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Waiting for client...");
            try (Socket client = serverSocket.accept();
                    ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
                    ObjectInputStream in = new ObjectInputStream(client.getInputStream())) {

                System.out.println("Client connected: " + client.getRemoteSocketAddress());

                Object received;
                while ((received = in.readObject()) != null) {
                    System.out.println("Client sent: " + received);

                    if (received instanceof String) {
                        String msg = (String) received;
                        String reply = "Echo: " + msg;
                        out.writeObject(reply);
                        out.flush();
                        System.out.println("Server replied with: " + reply);

                        if ("bye".equalsIgnoreCase(msg.trim())) {
                            System.out.println("Client requested disconnect.");
                            break;
                        }
                    } else {
                        // If client sends something unexpected
                        String reply = "Unsupported object type: " + received.getClass().getName();
                        out.writeObject(reply);
                        out.flush();
                        System.out.println("Server replied with: " + reply);
                    }
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Server shutting down.");
    }
}
