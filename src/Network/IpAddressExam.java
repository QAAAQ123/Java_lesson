package Network;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAddressExam {
    public static void main(String args[]){
        try{
            InetAddress ia = InetAddress.getLocalHost();//내컴퓨터의IP정보를 구한다.
            System.out.println(ia.getHostAddress());
        }catch(UnknownHostException uhe){
            uhe.printStackTrace();
        }

         try{
            InetAddress[] iaArray = InetAddress.getAllByName("www.google.com");//내컴퓨터의IP정보를 구한다.
            for(InetAddress ia : iaArray){
                System.out.println(ia.getHostAddress());
            }
        }catch(UnknownHostException uhe){
            uhe.printStackTrace();
        }
    }
}
