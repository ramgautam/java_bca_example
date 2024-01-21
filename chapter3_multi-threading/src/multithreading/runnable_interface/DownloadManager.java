package multithreading.runnable_interface;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class FileDownloader implements Runnable {
    private String url;
    private String outputFileName;

    public FileDownloader(String url, String outputFileName) {
        this.url = url;
        this.outputFileName = outputFileName;
    }

    @Override
    public void run() {
        try {
            System.out.println("Downloading from " + url);

            URL fileUrl = new URL(url);
            try (InputStream in = fileUrl.openStream();
                 FileOutputStream out = new FileOutputStream(outputFileName)) {

                byte[] buffer = new byte[1024];
                int bytesRead;

                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }

                System.out.println("Download complete for " + url);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class DownloadManager {
    public static void main(String[] args) {
        String[] fileUrls = {
                "https://filesamples.com/samples/code/json/sample1.json",
                "https://filesamples.com/samples/code/json/sample2.json",
                // Add more file URLs as needed
        };

        ExecutorService executorService = Executors.newFixedThreadPool(fileUrls.length);

        for (int i = 0; i < fileUrls.length; i++) {
            String outputFileName = "downloaded_file_" + (i + 1) + ".txt";
            Runnable fileDownloader = new FileDownloader(fileUrls[i], outputFileName);
            executorService.execute(fileDownloader);
        }

        executorService.shutdown();
    }
}

