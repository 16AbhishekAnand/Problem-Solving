import java.lang.Math;

public class Potd {
    /* Given a number and its reverse. Find that number raised to the power of its own reverse.
    Note: As answers can be very large, print the result modulo 109 + 7. */
    
    public static double pow(int n,int r) {
        return (double) Math.pow(n,r);
    }
    
    public static long modulofactor(int x,int y)  {
        double temp = pow(x,y);
        return (long) (temp%(1000000007));
    }

    public static void main(String args[]) {
        double res = (modulofactor(12,21));
        System.out.printf("%.0f",res);
        int test = 2147483647;
        System.out.println("");

        System.out.println(test);
        test++;
        

    }
}
