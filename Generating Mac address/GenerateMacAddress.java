import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class GenerateMacAddress{
    public static List<String> getMacSequences(final String macAddress, final long count)
    {
        List<String> macList = new ArrayList<String>();
        final List<Integer> macOctets = new ArrayList<Integer>();
        String [] macSplit = macAddress.split(":");

        int incPos = macAddress.split(":").length; // need to throw exception when the length is 0
        if  (incPos >= 1)
        {
            for (int bp=0; bp <6; bp++)
            {
                if (bp >= incPos)
                {
                    macOctets.add(0);
                }
                else 
                {
                    macOctets.add(Integer.parseInt(macSplit[bp], 16));
                }
            }

            for (int i = 0 ; i<count; i++)
            {
                int lastOctet = macOctets.get(5);
                macOctets.set(5, ++lastOctet);
                for (int j = 5; j >= 0; j--)
                {               
                    if (j == 0 && macOctets.get(j) > 255)
                    {
                        Collections.fill(macOctets, 0);
                    }

                    if (macOctets.get(j) > 255)
                    {
                        macOctets.set(j, 0);
                        Integer macValue = macOctets.get(j - 1);
                        macOctets.set(j - 1, ++macValue);
                    }
                    else{
                    break;
                    }
                }
                macList.add(String.format("%02X:%02X:%02X:%02X:%02X:%02X",  macOctets.toArray()));
            }
        }
        return macList;
    }
	
	public static void main(String args[]){
		System.out.println((getMacSequences("A0",999999)));
	}
	}