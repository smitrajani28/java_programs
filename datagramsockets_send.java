import java.net.*;

public class datagramsockets_send{
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        String str = "hello world";
        InetAddress ip = InetAddress.getByName("127.0.01")  ;
        
        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);
        ds.send(dp);
        ds.close();
    }
}
