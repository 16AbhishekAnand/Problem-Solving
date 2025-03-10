public class MultiPlyWithoutOpr {
    public static int multiplyNum(int a, int b) {
        int result = 0;
        boolean check = false;
        if(a > 0) {
            a = -a;
            check = !check; // toggle
        }
        if( b > 0) {
            b = -b;
            check = !check;
        }
        for(int i = 0; i < b; i++) {
            result += a;
        }
        return check ? -result : result;
    }
    public static void main(String args[]) {
        System.out.println((multiplyNum(3,-4)));
    }

}
