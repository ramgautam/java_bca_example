import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
    public static void main(String args[]){
        try {
            URL hp= new URL("https://www.google.com");
            System.out.println("Protocol::"+ hp.getProtocol());
            System.out.println("port::"+ hp.getPort());
            System.out.println("host::"+ hp.getHost());
            System.out.println("file:::"+ hp.getFile().getBytes().toString());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }
}
