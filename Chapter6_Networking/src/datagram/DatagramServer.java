package datagram;

import java.io.*;
import java.net.*;

public class DatagramServer {
    public static void main(String[] args) {
        final int PORT = 12345;

        try (DatagramSocket serverSocket = new DatagramSocket(PORT)) {
            System.out.println("Server started. Waiting for client...");

            byte[] receiveData = new byte[1024];
            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);

                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Client: " + message);

                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();
                String response = "Server received: " + message;
                byte[] sendData = response.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
                serverSocket.send(sendPacket);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

