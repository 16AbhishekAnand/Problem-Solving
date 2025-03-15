public class hcfLcm {
    // lcm of 2 number
    public static int lcm(int num1, int num2) {
        int res = (num1 > num2) ? num1 : num2;
        while(true) {
            if(res % num1 == 0 && res % num2 == 0) {
                break;
            }
            res++;
        }
        return res;
    }

    // Using GCD algorithm: (a * b) / gcd(a,b)

    public static int gcd(int num1, int num2) {
        return (num2 == 0) ? num1 : gcd(num2, num1 % num2); // returns hcf of 2 num.
    }

    public static int gcdLcm(int num1, int num2) {
        return (num1 * num2 ) / gcd(num1, num2);
    }


    public static void main(String args[]) {
        int res = lcm(42, 58);
        System.out.println(res);
        System.out.println("gcdLcm "+ gcdLcm(42,58));
    }
}
