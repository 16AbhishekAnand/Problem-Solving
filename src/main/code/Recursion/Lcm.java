public class Lcm {
    // LCM Using loop
    public static void lcmcheck(int x,int y) {
        int i;  
        //find the largest between two numbers x and y and assigns the large number to the variable a  
        int a =(x > y)? x : y;  
  
        for(i = a ; i <= x*y ; i = i + a)  {  
            if(i % x == 0 && i % y == 0) {  
            break;
            }  
        }  
        System.out.println("LCM of "+x+" and "+y+" is: "+i);  
    }
    
    // LCM using Recursion

    public static int reclcm(int m,int n) {
        if(n==0) {
            return m;
        }
        else {
            return reclcm(n,m%n);
        }
    }

        
    public static void main(String args[]) {
        lcmcheck(12, 24);
        System.out.println(reclcm(12,24));
        int lcm = 8*9/reclcm(8,9);
        System.out.println(lcm);
    
    }
}
