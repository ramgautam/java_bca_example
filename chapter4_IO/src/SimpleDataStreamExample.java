import java.io.*;

public class SimpleDataStreamExample {
    public static void main(String[] args) {
        String filename = "simpledata.dat";

        // Write data
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename));
            dos.writeInt(10);                 // Write an integer
            dos.writeDouble(5.5);             // Write a double
            dos.writeUTF("Hello");            // Write a string
            dos.close();
            System.out.println("Data written.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read data
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(filename));
            int i = dis.readInt();            // Read the integer
            double d = dis.readDouble();      // Read the double
            String s = dis.readUTF();         // Read the string
            dis.close();

            System.out.println("Data read:");
            System.out.println("Int: " + i);
            System.out.println("Double: " + d);
            System.out.println("String: " + s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
