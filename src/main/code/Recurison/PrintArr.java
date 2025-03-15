public class PrintArr {
    // Print Array using recursion.
    public static void recnum(String a[],int index) {
        if(index<a.length) {
            System.out.println(a[index]);
            recnum(a, index+1);
        }
    }

    // Digit Count using loop.

    public static int digitCount(int num) {
        int count = 0;
        while(num != 0) {
            num/=10;
            count++;
        }
        return count;
    }

    // Digit using loop.

    public static int recCount(int num) {
        if(num /10 == 0) {
            return 1;
        }
        return 1 + recCount(num /10);
    }

    // Check for prime


        public static int prime(int num, int check) {
            if (check == 1) {
                return 1;
            }
            if (num % check == 0) {
                return 0;
            }
            return prime(num, check - 1); // Recursive call with decremented check
        }

        // Find Binary Num.
        public static void binaryNum(int n) {
            if(n == 0) {
                return;
            }
            else {
                binaryNum(n/2);
                System.out.print(n%2); // print either 0 or 1.
            }
        }

    public static void main(String args[]) {
        String arr[] = {"self", "test","girls"};
        recnum(arr, 0);
        System.out.println(digitCount(2345345));
        System.out.println(recCount(23422423));
        System.out.println("for prime "+ prime(345,345/2));
        binaryNum(10);
    }
}
