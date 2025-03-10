import java.util.Arrays;

public class SecondLargest {
    public static int secondLargest(int arr[],int n) {
        Arrays.sort(arr);
        int lar=0;
        for(int i=n-1;i>=1;i--) { // when i=1 then i-1=0 i.e last one will a[1] will be compared with a[0].
            if(arr[i]!=arr[i-1]  ) {
                lar=arr[i-1];
                break;
            }
            if(i==1 && lar==0) { // case when all elements are same.
                return -1;
            }
        }
        return lar;
    }
    public static void main(String args[]) {
        int arr[] = {1,1,1,1};
        System.out.println(secondLargest(arr, arr.length));
    }

}


