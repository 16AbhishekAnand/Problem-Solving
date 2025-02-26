/* fix exception handling and time measurment(double) */

public class Fabnacii {
    
    public static int fab(int n) throws Exception {
        if(n==0 ||n==1) {
            return 1;
        }
        else {
            return fab(n-1)+fab(n-2);
        }
    }
    
    
    public static void main(String args[]) throws Exception {
        // for(int i=0;i<=10;i++) {
        //     System.out.print(fab(i)+" ");
        // }
        
        System.out.println(fab(6));
        
    }
    
}
