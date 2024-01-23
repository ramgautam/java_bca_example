import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    public static void main(String[] args) {
        String filePath = "output.txt";

        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {

            // Text to be written to the file
            String data = "Hello, BufferedOutputStream!\nThis is a sample text.";

            // Convert the string to bytes and write to the file
            byte[] bytes = data.getBytes();
            bufferedOutputStream.write(bytes);

            System.out.println("Data has been written to the file.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
