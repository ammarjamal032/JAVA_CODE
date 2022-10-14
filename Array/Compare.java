package Array;

import java.util.Comparator;

class Compare implements Comparator<Triplet>{
	 
    // Overriden compare method to
      // compare objects for sorting.
    public int compare(Triplet a,Triplet b){
        return a.z - b.z;
    }
}