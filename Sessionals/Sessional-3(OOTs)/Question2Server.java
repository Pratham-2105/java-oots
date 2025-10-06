import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Question2Server {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(9876);
            byte[] receiveData = new byte[1024];
            byte[] sendData;

            System.out.println("Server is running... waiting for messages.");

            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivePacket);
            String msg = new String(receivePacket.getData()).trim();
            System.out.println("Client says: " + msg);

            String reply = "Message received: " + msg;
            sendData = reply.getBytes();

            InetAddress clientAddress = receivePacket.getAddress();
            int port = receivePacket.getPort();

            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, port);
            socket.send(sendPacket);

            System.out.println("Confirmation sent to client.");
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
