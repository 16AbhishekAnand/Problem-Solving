import java.util.Arrays;

class Secondlargest {
    public static int secondmax(int arr[],int n) {
        int temp=0;
        Arrays.sort(arr);
        for(int i=n-1;i>=0;i--) {
            for(int j=i-1;j>=0;j--) {
                if(arr[i]>arr[j]) {
                    temp = arr[j];
                    return temp;
                }
            }
        }
        return -1;
    }
    public static int test (int arr[],int n) { // refer from gfg.
        Arrays.sort(arr);
        int lar=0;
        for(int i=n-1;i>=1;i--) { // when i=1 then i-1=0 i.e last one will a[1] will be compared with a[0].
            if(arr[i]!=arr[i-1]  ){
                lar=arr[i-1];
                break;
            }
            if(i==1 && lar==0){
                return -1;
            }
        }
        return lar;
    }
    
    
    public static void main(String args[]) {
        int arr[] = {2,3};
        int n = arr.length;
        System.out.println(test(arr, n));
    }
}