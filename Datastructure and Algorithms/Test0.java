public class Test0{
    
    //Variables
    private static int[] a;
    private static int j, k;
	private static int nElements;
    //Constructor
    public Test0(int size ){
        a = new int [size];
		nElements = 0;
    }
    
    private void setElemet(int elm, int value){
        a[elm] = value;
    }
    
    private int getElement (int elm){
        return a[elm];
    }
    //Functions
		
	//MainFunction
    public static void main (String[] abdelrazek){
        //Storage some data in this array and make some operations on it like insert, search and delete
        Test0 t0 = new Test0(10);
        t0.setElemet(0, 11);
        t0.setElemet(1, 12);
        t0.setElemet(2, 13);
        t0.setElemet(3, 14);
        t0.setElemet(4, 15);
        t0.setElemet(5, 16);
        t0.setElemet(6, 17);
        t0.setElemet(7, 18);
        t0.setElemet(8, 19);
        t0.setElemet(9, 20);
		nElements = 10;
        
		//Delete 18
		for(j = 0; j < nElements; j++){
			if ( a[j] == 18){
				System.out.println("Found..");
				break;
			}	
		}
		if (j != nElements){
			nElements--;			
			for (k = j; k < nElements; k++){
				a[k] = a[k+1]; 
			}
			System.out.println("Deleted..");
		}
		
		//Display after delete
		for (j = 0; j < nElements; j++){
			System.out.print(" ");
			System.out.print(a[j]);
		}


    }
}