import java.net.InetAddress;
import java.net.NetworkInterface;
//  j a v a  2s .c o  m
public class Main {
  public static void main(String[] args) throws Exception {
	String Mac_address = "";
    InetAddress address = InetAddress.getLocalHost();

    NetworkInterface ni = NetworkInterface.getByInetAddress(address);
    byte[] mac = ni.getHardwareAddress();

    for (int i = 0; i < mac.length; i++) {
      Mac_address += Mac_address.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
    }
	System.out.println("Physical Address Network : " + Mac_address);
  }
}