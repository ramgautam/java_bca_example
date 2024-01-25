import java.io.FileInputStream;
import java.io.IOException;

public class SequentialAccessExample {
    public static void main(String[] args) {
        String filePath = "downloaded_file_2.txt";

        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            int data;
            while ((data = fileInputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
