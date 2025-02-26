import java.util.ArrayList;

public class Sum {
    /* Find the pair of element from the given array whose sum is 
     * equal to key.
     */

     public static ArrayList<Integer> sumPair(int arr[],int key) {
        
        ArrayList <Integer> arrlist = new ArrayList<Integer>();
        ArrayList <Integer> pair = new ArrayList<Integer>();
        
        for(int i:arr) {
            int diff = key-i;
            if(arrlist.contains(diff)) {
                pair.add(i);pair.add(diff);
                return pair;
            }
            else {
                arrlist.add(i);
            }
        }
        if(pair.size()==0) {
            pair.add(-1);
        }
        return pair;
    }
     
     
     public static void main(String args[]) {
        int a[] = {3,1,6,2,7,4};
        int key = 11;
        System.out.println(sumPair(a, key));
     }
}
