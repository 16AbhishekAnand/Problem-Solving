public class ReverseString {
    public static String revstring(String word) {
        if(word.isEmpty()) {
            //System.out.println("String is empty.");
            return word;
        }
        else {
            return revstring(word.substring(1))+word.charAt(0);
        }
    }

    public static void main(String args[]) {
        System.out.println(revstring("Hi! I am John"));    
    }
    
}
