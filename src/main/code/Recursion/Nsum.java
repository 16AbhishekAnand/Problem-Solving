public class Nsum {
    
   // adding sum of all digits. 
    public static int sumNum(int n) {
        if(n<=10) {
            return n;
        }
        else {
            return sumNum(n/10)+(n%10);
        }
    }

    public static int hcfgcd(int m,int n) {
        if(n==0) {
            return m;
        }
        else {
            return hcfgcd(n,m%n);
        }
    }
    public static void main(String args[]) {
        System.out.println(sumNum(9));
        System.out.println(hcfgcd(10,45));
    }
}