

/* find the avg of k subject of best of n subject */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Avgmarks {
    static Scanner inp = new Scanner(System.in);
    
    public static void subjectmarks(int n) {
        int marks[] = new int[n];
        System.out.println("Enter the subject marks");
        for(int i: marks) {
           marks[i] = inp.nextInt();
        }
        for(int x = 0; x<marks.length;x++) {
            System.out.print(marks[x] + " ");
        }

        //Arrays.sort(marks);
        //Arrays.sort(marks,Collections.reverseOrder());
        //for(int x : marks) {
        //System.out.printf("%s",Arrays.toString(marks));
        //}

        
        // try {
        //     for(int i=0;i<marks.length;i++) {
        //     for(int j=i+1;j<marks.length;n++) {
        //         int temp;
        //         if(marks[i]>marks[j]) {
        //             temp = marks[i];
        //             marks[i] = marks[j];
        //             marks[j] = temp;
        //         }
        //     }
        //     }
        // }    
        // catch(Exception e) {
        //     System.out.println(e);
        // }
        // for(int x: marks) {
        //         System.out.println(marks[x]);
        // }
    }    
        

    
    
    public static void main(String args[]) {
        System.out.println("total subjecet");
        int n = inp.nextInt();
        subjectmarks(n);
        //int k = inp.nextInt();
        //int bstmarks[] = new int[k];         
    }

}