package Array;

import java.util.Arrays;

class Main {
    public static void main (String[] args) {     
       
        int n = 4;
        Triplet arr[] = new Triplet[n];
 
        arr[0] = new Triplet(10, 20, -2);
        arr[1] = new Triplet(40, -1, 2);
        arr[2] = new Triplet(30, 18, -1);
        arr[3] = new Triplet(50, 10, 50);
  
          // Sorting the array by passing
          // Compare object
        
        
        Arrays.sort(arr, new Compare());    
       
        // printing the Triplet array
          print(arr);            
    }
   
      public static void print(Triplet[] arr){
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
