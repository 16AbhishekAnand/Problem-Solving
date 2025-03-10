import java.util.ArrayList;

public class FindDuplicate {
        /* Find the Duplicate element form the given list. */

        public static ArrayList<Integer> duplicacy(int arr[], int n) {

            int temp[]=new int[n];

            ArrayList<Integer> arrayList = new ArrayList<Integer>();

            for(int i=0;i<n;i++) {
                temp[arr[i]]++;
                System.out.print(temp[arr[i]]+" ");
            }
            System.out.println();
            System.out.print("duplicate element \t ");
            for(int j=0;j<temp.length;j++) {
                if(temp[j]>1) {
                    arrayList.add(j);
                }
            }
            if(arrayList.isEmpty()) {
                arrayList.add(-1);
            }
            return arrayList;
        }

        public static void main(String args[]) {
            int a[] = {2,2,3,3,4,4,4,4,7};
            int n = a.length;
            System.out.print(duplicacy(a, n));
        }
}
