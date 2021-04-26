// orderedArray.java
// demonstrates ordered array class
// to run this program: C>java OrderedApp
////////////////////////////////////////////////////////////////
class OrdArray
   {
   private long[] a;                 // ref to array a
   private int nElems;               // number of data items
   //-----------------------------------------------------------
   public OrdArray(int max)          // constructor
      {
      a = new long[max];             // create array
      nElems = 0;
      }
   //-----------------------------------------------------------
   public int size()
      { return nElems; }
   //-----------------------------------------------------------
   public int find(long searchKey)
      {
      int lowerBound = 0;
      int upperBound = nElems-1;
      int curIn;
	  long t0 = System.nanoTime();
      while(true)
         {
         curIn = (lowerBound + upperBound ) / 2;
         if(a[curIn]==searchKey){ 
			System.out.printf(" = Algorithm of Find Time in %.6f seconds%n",((System.nanoTime()-t0)/1000000000.0));
            return curIn;              // found it
		 }
         else if(lowerBound > upperBound){
		//	System.out.printf(" > Algorithm of Find Time in %.6f seconds%n",((System.nanoTime()-t0)/1000000000.0));
            return nElems;             // can't find it
		 }
         else                          // divide range
            {
            if(a[curIn] < searchKey)
               lowerBound = curIn + 1; // it's in upper half
            else
               upperBound = curIn - 1; // it's in lower half
            }  // end else divide range
         }  // end while
      }  // end find()
   //-----------------------------------------------------------
   public long getMax(){
		long max = 0;
	   for (int j = 0 ; j < a.length  ; j++){
			for ( int k = j ; k < a.length ; k++){
				if ( a[k] > a [j]){
					max = a [k];
				}
			}
	   }
	   
	return max;
   }
   public void insert(long value)    // put element into array
      {
      int j;
      for(j=0; j<nElems; j++)        // find where it goes
         if(a[j] > value)            // (linear search)
            break;
      for(int k=nElems; k>j; k--)    // move bigger ones up
         a[k] = a[k-1];
      a[j] = value;                  // insert it
      nElems++;                      // increment size
      }  // end insert()
   //-----------------------------------------------------------
   public boolean delete(long value)
      {
      int j = find(value);
      if(j==nElems)                  // can't find it
         return false;
      else                           // found it
         {
         for(int k=j; k<nElems; k++) // move bigger ones down
            a[k] = a[k+1];
         nElems--;                   // decrement size
         return true;
         }
      }  // end delete()
   //-----------------------------------------------------------
   public void display()             // displays array contents
      {
      for(int j=0; j<nElems; j++)       // for each element,
         System.out.print(a[j] + " ");  // display it
      System.out.println("");
      }
   //-----------------------------------------------------------
   }  // end class OrdArray
////////////////////////////////////////////////////////////////
class OrderedApp
   {
   public static void main(String[] args)
      {
      int maxSize = 100;             // array size
      OrdArray arr;                  // reference to array
      arr = new OrdArray(maxSize);   // create the array
	  arr.insert(11);
	  arr.insert(22);
	  arr.insert(100);
	  arr.insert(99);
	  arr.insert(55);
	  arr.insert(66);
	  arr.insert(77);
	  arr.insert(88);
        System.out.println(arr.getMax());
		
      }  // end main()
   }  // end class OrderedApp
