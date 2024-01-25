import java.io.*;

public class FileIO {

    public static void main(String args[]) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("downloaded_file_1.txt");
            out = new FileWriter("file_writer_example");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("Reading and Writing in a file is done!!!");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}