import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        String filePath = "output_writer.txt";

        try (FileWriter fileWriter = new FileWriter(filePath);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            // Write data to the file
            bufferedWriter.write("Hello, BufferedWriter!\nThis is a sample text.");

            System.out.println("Data has been written to the file.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
