public class WaveNo {
    /* A numbaer which is greater than before but smaller than after
     * i.e arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....
     */

     public static void waveno(int arr[],int n) {
        for(int i=0;i<n;i+=2) {
            for(int j=i+1;j<n;) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                break;
            }
        }
        for(int x=0;x<n;x++) {
            System.out.print(arr[x]+" ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {2,4,7,8,9,10};
        int n = arr.length;
        waveno(arr, n);
    }


    
}
