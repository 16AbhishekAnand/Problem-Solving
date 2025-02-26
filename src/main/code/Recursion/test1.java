class test1 {

    static int i=1;
    static int recfunc(int x,int y) {
        if(x==0) {
            return y;
        }
        else {
             return recfunc(x-1,x+y); // here at the same time x is added to y and decremented by 1.
            // So here,intial value of x is added to y.
        }
    }

    /* print natural number using recursion */

    static void  recnum(int n) {
        if(i<n && i!=0) {
            System.out.println(i);
            i++;
            recnum(n-1);
        }
        else {
            if (n < 0) {
                System.out.println("invalid input");
            }
        }
    }


    public static void main(String args[]) {
    int res = recfunc(3,2);
    System.out.println(res);
    recnum(-8);
    }
}
