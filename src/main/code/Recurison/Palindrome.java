public class Palindrome {
    public static boolean checkPalindrome(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return checkPalindrome(s, start + 1, end - 1);
    }

    public static boolean palindrome(String s) {
        return checkPalindrome(s, 0, s.length() - 1);
    }

    // Reverse String
    public static String reverseStr(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return  reverseStr(str.substring(1)) + str.charAt(0)  ; // str.substring(1) takes all character escaping 1st letter.
    }

    // Using String Builder ---> Most optimized.
    static void reverse(StringBuilder str, int start, int end) {
        if (start >= end) {
            return;
        }
        char temp = str.charAt(start);
        str.setCharAt(start, str.charAt(end));
        str.setCharAt(end, temp);
        reverse(str, start + 1, end - 1);
    }


    public static void main(String args[]) {
        String inp = "namansan";
        System.out.println(palindrome(inp)); // Output: false
        System.out.println("for reverse Str---> "+ reverseStr("hello"));
    }
}
