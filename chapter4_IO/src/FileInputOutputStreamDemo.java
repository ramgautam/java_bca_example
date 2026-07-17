import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {
    public static void main(String[] args) {

        //this is the file location
        String sourceFile = "/home/ram/source.txt";
        String destinationFile = "/home/ram/destination.txt";

        try{
            //opening the stream based on type
                FileInputStream inputStream = new FileInputStream(sourceFile);//
                FileOutputStream outputStream = new FileOutputStream(destinationFile);//

            int byteData;
            while ((byteData = inputStream.read()) != -1) {// reading the content from the source file
                outputStream.write(byteData);// writing the content into the destination file
            }

            System.out.println("File copied successfully!");
            //Closing the stream
            inputStream.close();
            outputStream.close();

        } catch (IOException e) {
            System.out.println("Error during file operation: " + e.getMessage());
        }
    }
}
