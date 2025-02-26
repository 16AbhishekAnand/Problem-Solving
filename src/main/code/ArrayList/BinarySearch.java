public class BinarySearch {
    public static int search(int a[],int key) {
        int low=0;
        int high = a.length-1;
        while(low<=high) {
            int mid =(low+high)/2;
            if(a[mid]==key) {
                return mid;
            }
            if(a[mid]<key) {
                low = mid+1;
            }
            else {
                low = mid-1;
            }
        }
        return -1;

    }
    /* Binary search using Recursion */

        public static int recsearch(int a[],int key,int low,int high) {
            if(low>high) {
                return -1;
            }
            
            int mid = (high+low)/2;
            if(a[mid]==key) {
                return mid;
            }
            
            else if(a[mid]<key) {
                return recsearch(a, key, mid+1, high);
            }
            else {
                return recsearch(a, key, low,mid-1);
            }
            
        }

    
    public static void main(String args[]) {
        int a[] ={45,56,78,89,93};
        int key = 7;
        int low =0;
        int high = a.length-1;
        System.out.println(recsearch(a, key, low, high));        
    }
}
