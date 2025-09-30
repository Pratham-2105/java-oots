package UDP;

import java.net.*;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 9876;

        try (DatagramSocket socket = new DatagramSocket();
             Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.print("Enter message: ");
                String msg = scanner.nextLine();
                byte[] data = msg.getBytes();

                InetAddress serverAddress = InetAddress.getByName(host);
                DatagramPacket packet = new DatagramPacket(data, data.length, serverAddress, port);
                socket.send(packet);

                // receive reply
                byte[] buffer = new byte[1024];
                DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
                socket.receive(reply);

                String replyMsg = new String(reply.getData(), 0, reply.getLength());
                System.out.println("Server replied: " + replyMsg);

                if ("bye".equalsIgnoreCase(msg.trim())) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
