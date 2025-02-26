import java.util.ArrayList;
import java.util.*;

public class sort {
    /* Sort the given arrray using collection sort */    

    public static void arrsort(int a[]) {
        ArrayList <Integer> arrlist = new ArrayList <Integer>();
        for(int i:a) {
            arrlist.add(i);
        }
        System.out.println("array befor sorting : "+arrlist);
        Collections.sort(arrlist);
        System.out.println("After sorting :"+ arrlist);
    }

    public static void sortnum(int a[]) {
        for(int i=0;i<a.length;i++) {
            for(int j=i+1;j<a.length;j++) {
                if(a[i]>a[j]) {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int x=0;x<a.length;x++) {
            System.out.println(a[x]);
        }

    }

    public static void main(String args[]) {
        int a[] = {45,23,54,67,8};
        //arrsort(a);
        sortnum(a);
    }

}
