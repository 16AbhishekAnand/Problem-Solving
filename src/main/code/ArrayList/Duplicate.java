import java.util.*;

public class Duplicate {
    /* Find the Duplicate element form the given list. */
    
    public static ArrayList<Integer> duplicacy(int arr[],int n) {
    
        int temp[]=new int[n];
        
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        
        for(int i=0;i<n;i++) {
            temp[arr[i]]++; // not understood this line.
            System.out.print(temp[arr[i]]+" ");
        }
        System.out.println("duplicate element \t ");
        for(int j=0;j<temp.length;j++) {
            if(temp[j]>1) {
                arrlist.add(j);
            }
        }
        if(arrlist.isEmpty()) {
            arrlist.add(-1);  
        }
      return arrlist;
    }

    public static void main(String args[]) {
        int a[] = {2,2,3,3,4,4,4,4,7};
        int n = a.length;
        System.out.println(duplicacy(a, n));
    }



}