public class Hailstone {
    
    /* If a number is odd then num*3+1 or even n/2 till n!=1 is HAILSTONE NUMBER. */
    
    public static int count = 0;
    static public int checknum(int n) {
        System.out.print(n+" ");
        if(n==1) {
            return 1;
        }
        if(n%2==0) {
            count++;
            checknum(n/2);
        }
        else {
            count++;
            checknum(n*3+1);
        }
        return count;
    }
    
    public static void main(String args[]) {
        int x = checknum(7);
        System.out.println();
        System.out.println(x); // returns count value.
    }
}
