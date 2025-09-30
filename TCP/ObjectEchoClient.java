package TCP;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ObjectEchoClient {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 12345;

        try (Socket socket = new Socket(host, port);
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                Scanner scanner = new Scanner(System.in)) {

            System.out.println("Connected to server at " + host + ":" + port);

            // Receive the initial Person from server
            Object welcome = in.readObject();
            System.out.println("Server sent: " + welcome);

            // Interactive loop
            while (true) {
                System.out.print("Enter message or 'person': ");
                String input = scanner.nextLine();

                if ("person".equalsIgnoreCase(input)) {
                    Person me = new Person("Client", 21);
                    out.writeObject(me);
                    out.flush();

                    Object reply = in.readObject();
                    System.out.println("Server replied with: " + reply);

                } else {
                    out.writeObject(input);
                    out.flush();

                    Object reply = in.readObject();
                    System.out.println("Server: " + reply);

                    if ("bye".equalsIgnoreCase(input.trim())) {
                        break;
                    }
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
