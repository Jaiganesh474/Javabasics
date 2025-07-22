//String Palindrome using String class

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "mada   m";
        boolean isPalindrome = checkPalindrome(str);
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    private static boolean checkPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true; // Check for null or empty string
        }

        str = str.toLowerCase(); // Convert to lowercase for case-insensitive comparison
        int start = 0;
        int end = str.length() - 1;

        //while loop method to check palindrome
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Characters do not match, not a palindrome
            }
            start++;
            end--;
        }
        return true;

        //for loop method to check palindrome
//        for (int i = 0; i < str.length() / 2; i++) {
//            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
//                return false; // Characters do not match, not a palindrome
//            }
//        }
//        return true; // All characters matched, it is a palindrome
    }
}
