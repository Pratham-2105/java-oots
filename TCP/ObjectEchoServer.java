package TCP;

import java.io.*;
import java.net.*;

public class ObjectEchoServer {
    public static void main(String[] args) {
        int port = 12345;
        System.out.println("Starting ObjectEchoServer on port " + port);

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Waiting for client...");
            try (Socket client = serverSocket.accept();
                 ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
                 ObjectInputStream in = new ObjectInputStream(client.getInputStream())) {

                System.out.println("Client connected: " + client.getRemoteSocketAddress());

                // Send a welcome Person object
                out.writeObject(new Person("Server", 99));
                out.flush();

                Object received;
                while ((received = in.readObject()) != null) {
                    System.out.println("Received: " + received);

                    if (received instanceof String) {
                        String msg = (String) received;
                        out.writeObject("Echo: " + msg);
                        out.flush();
                        if ("bye".equalsIgnoreCase(msg.trim())) {
                            System.out.println("Client requested disconnect.");
                            break;
                        }
                    } else if (received instanceof Person) {
                        Person p = (Person) received;
                        out.writeObject(new Person("Server-Reply", p.getAge() + 1));
                        out.flush();
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
