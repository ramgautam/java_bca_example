import java.net.InetAddress;
import java.util.Scanner;

public class InternetAddressDemo {
    public static void main(String args[]){
        try{
            Scanner scanner= new Scanner(System.in);
            String name=scanner.next();
            InetAddress inetAddress= InetAddress.getByName(name);

            System.out.println("IP address:"+ inetAddress);



        }catch (Exception e){

        }
    }
}
