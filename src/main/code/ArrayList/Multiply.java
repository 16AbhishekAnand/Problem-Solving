public class Multiply {
    /* Do the multiplication without * operator. */

    static int product(int a,int b) {
        if(a==0) {
            return 0;
        }
        if(a<0) {
            return product(a+1,b)-b; // To handle negative number.
        }
        
            return product(a-1,b)+b;
    }        
        

    public static void main(String args[]) {    
        System.out.println(product(-2,-8));
    }
}
