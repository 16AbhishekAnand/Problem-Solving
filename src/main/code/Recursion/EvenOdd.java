public class EvenOdd {
    public static void checknum(int m,int n) {
        if(m>n) {
            return;
        }
        else {
            System.out.println(m);
            checknum(m+2, n);
        }   
    }

    public static void main(String args[]) {
        checknum(2, 9);
    }

     }
    

