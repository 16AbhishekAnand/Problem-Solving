public class Hailstone {
    /* If a number is odd then num*3+1 or even n/2 till n!=1 is HAILSTONE NUMBER. */
    public static int count = 0;
    public static int countHailstone(int num) {
        System.out.print(num+ " "); // to show value after every recursive call.
        if(num == 1) {
            return 1;
        }
        else if(num % 2 == 0) {
            count++;
            countHailstone(num/2);

        }
        else {
            count++;
            countHailstone((num*3) + 1);
        }
        return count;
    }

    public static  int fabnacii(int num) {
        if(num == 1 || num == 0) {
            return 1;
        }
        return fabnacii(num-1) + fabnacii(num-2);
    }

    public static void main(String args[]) {
        System.out.println("Final ");
        int res = countHailstone(7);
        System.out.println();
        System.out.println(res);
        int fabRes = fabnacii(5);
        System.out.println("Fab Result "+fabRes);
    }
}
