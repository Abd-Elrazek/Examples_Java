public class Download {
	public static void main (String  []donwload ) {
		for (int yr = 21 ; yr < 43; yr++){
			for (int count = 1 ; count <= 12; count++){
				if ( count >= 10 ){
					System.out.println("https://worldradiohistory.com/Archive-Radio/20s/Radio-19"+yr+"-"+count+".pdf");
				}else{
					System.out.println("https://worldradiohistory.com/Archive-Radio/20s/Radio-19"+yr+"-0"+count+".pdf");
				}
			}
		}
	}
}