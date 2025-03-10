import java.util.Arrays;

public class Subset {
    // Given 2 Array find whether one is subset of another.
    public static boolean arrSubset(int [] arr1, int [] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int res = arr1.length > arr2.length ? arr2.length : arr1.length;
        for(int i=0; i<res;i++) {
            if(arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        int [] arr1 = {3,4,1,6};
        int [] arr2 = {7,0,8,3,1,6,2,4};
        System.out.println(arrSubset(arr1,arr2));
    }

}
