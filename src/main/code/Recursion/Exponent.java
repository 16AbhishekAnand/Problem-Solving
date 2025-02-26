public class Exponent {
    static int res = 1;
    public static void expo(int num,int pow) {
       
        if(pow==0) {
            System.out.println(res);
            return;
        }
        else {
            res=res*num;
            expo(num, pow-1);
        }    
    }
    
    public static void main(String args[]) {
        expo(2,6);
    }
}
