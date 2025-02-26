// sum of n number using recursion. 

public class SumFact {
    static int sum=0;
    
    static public int sumnum(int a) {
        if(a<1) {
        return a;
        }
        else {
        return a + sumnum(a-1);
        }    
    }
    
    public static int factnum(int n)  {
        if(n<1) {
            throw new ArithmeticException("Enter only positive number");
        }
        
        if(n==1) {
            return 1;
        }
        else {
            return n*factnum(n-1);
        }
    }

    public static void main(String args[]) {
        System.out.println("factorial is "+factnum(5));
        System.out.println("sum of num "+sumnum(5));
    }
}
    

