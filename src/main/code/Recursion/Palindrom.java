public class Palindrom {
    public static boolean palidrome(String word,int start,int end) {
        if(start==end) { // for single character in string.
            return true;
        }
        
        if(word.charAt(start)!=word.charAt(end)) {
            return false;
        }

        if(start<end+1) {
            return palidrome(word, start+1,end-1);
        }   
        return true;
    }

    public static boolean checkpalindrome(String word) {
        int n = word.length();
        if(n==0) {
            return true; // empty string is considered as palindrome.
        }
        return palidrome(word, 0, n-1);
    }

    public static void main(String args[]) {
        String s = "naman"; // palindrome is case sensitive.
        s.equalsIgnoreCase(s);
        if(checkpalindrome(s)) {
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("Stirng is not palindrome");
        }
    }
    
} 