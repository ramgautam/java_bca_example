package datagram;

import java.io.*;
import java.net.*;

public class DatagramClient {
    public static void main(String[] args) {
        final String SERVER_IP = "127.0.0.1";
        final int SERVER_PORT = 12345;

        try (DatagramSocket clientSocket = new DatagramSocket();
             BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            InetAddress serverAddress = InetAddress.getByName(SERVER_IP);

            System.out.println("Connected to server. Type 'exit' to quit.");

            // Read user input and send to server
            String userInput;
            while ((userInput = reader.readLine()) != null) {
                byte[] sendData = userInput.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, SERVER_PORT);
                clientSocket.send(sendPacket);

                if (userInput.equalsIgnoreCase("exit")) {
                    break;
                }

                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                clientSocket.receive(receivePacket);

                String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Server: " + response);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

