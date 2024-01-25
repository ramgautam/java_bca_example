import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessExample {
    public static void main(String[] args) {
        String filePath = "downloaded_file_2.txt";

        try (RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "r")) {
            // Move the file pointer to the 10th byte
            randomAccessFile.seek(9);

            // Read and print 5 bytes from the current position
            for (int i = 0; i < 5; i++) {
                System.out.print((char) randomAccessFile.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
