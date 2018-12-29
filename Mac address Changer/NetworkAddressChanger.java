public class NetworkAddressChanger{
	public static void main(String args[]){
		String mac = "02E347EA5933";
        String commandChangeMac="netsh interface set interface \"Wireless Network Connection\" disable"
		+"reg add HKEY_LOCAL_MACHINE\\SYSTEM\\CurrentControlSet\\Control\\Class\\{4D36E972-E325-11CE-BFC1-08002BE10318}\\0013 /t REG_SZ /v NetworkAddress /d " + mac + " /f"
        +"netsh interface set interface \"Wireless Network Connection\" enable";		
		obj.executeCommand(commandChangeMac);
	}
}