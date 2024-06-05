import java.net.*;
public class datagramsocket_receive {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(3000);
        byte[] buf = new byte[1024];
        DatagramPacket dp1 = new DatagramPacket(buf,1024);
        ds.receive(dp1);
        String str = new String(dp1.getData(),0,dp1.getLength());
        System.out.println(str);
        ds.close();
    }
    
}
