public class PowRev {
    /* Given a number and its reverse. Find that number raised to the power of its own reverse.
    Note: As answers can be very large, print the result modulo 10^9 + 7. */

    public static double pow(int num, int rev) {
        double res = (double) Math.pow(num,rev);
        return res % 1000000007;
    }

    public static void main(String args[]) {
        double res = pow(21,12);
        System.out.println(res);
    }

}
