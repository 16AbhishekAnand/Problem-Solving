import java.util.ArrayList;

class SumCheck {
    
    /* To check the key element is equivalent to sum of element from which index to which index  */

    static ArrayList<Integer> subarrSum(int arr[],int n,int s) {
        int sum =0;
        boolean arrAvailability = true;
        
        ArrayList <Integer> arrlist = new ArrayList<>();
        
        for(int i=0;i<n;i++) {
            sum =0;
            for(int j=i;j<n;j++) {
                sum=sum+arr[j];
                if(sum==s) {
                  arrlist.add(i+1); // consider i index starts form 1.
                  arrlist.add(j+1); // goes till end i.e j+1.
                  arrAvailability =false; // for unsucessfull check  
                }
            }
           
            if(arrlist.size()==2) {
                break;
            }
        }     
            // if(arrAvailability) {
            //     arrlist.add(-1);
            // }
            if(arrlist.isEmpty()) {
                arrlist.add(-1);
            }
            System.out.println(arrlist);
            return arrlist;
            
        }
        
    public static void main(String args[]) {
        int [] array = {1,2,3,7,5};
        int n=array.length;
        int s = 56;
        subarrSum(array, n, s);
    }
}