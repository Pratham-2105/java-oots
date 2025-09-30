package UDP;

import java.net.*;

public class UDPServer {
    public static void main(String[] args) {
        int port = 9876;

        try (DatagramSocket socket = new DatagramSocket(port)) {
            System.out.println("UDP Server running on port " + port);

            byte[] buffer = new byte[1024];

            while (true) {
                DatagramPacket request = new DatagramPacket(buffer, buffer.length);
                socket.receive(request);  // blocking call

                String msg = new String(request.getData(), 0, request.getLength());
                System.out.println("Client (" + request.getAddress() + ":" + request.getPort() + ") sent: " + msg);

                // Prepare reply
                String replyMsg = "Echo: " + msg;
                byte[] replyData = replyMsg.getBytes();

                DatagramPacket reply = new DatagramPacket(
                        replyData, replyData.length,
                        request.getAddress(), request.getPort());

                socket.send(reply);
                System.out.println("Replied to client with: " + replyMsg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
