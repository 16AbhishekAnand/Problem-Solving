public class Binary {
    
    static int  check;
    
    public static void decimalBinary(int n) {
        if(n==0) {
            System.out.println("0");
        }
        else {
            decimalBinary(n/2);
            System.out.print(n%2); // print either 0 or 1.
        }
    }

    public static int  prime(int a) {
        if(a%check==0) {
            return 0;
        }
        else {
            check--;
            prime(a);
        }
        return 1 ;
        
    }
    
    public static void main(String args[]) {
        decimalBinary(103);
        int num = 72;
        check = num/2;
        int primeno = prime(num); 
        if(primeno==1) {
            System.out.println("prime");
        }
        else {
            System.out.println("Not prime");
        }
    }
    
}
