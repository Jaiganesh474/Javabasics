public class StringBuilderPalindrome {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("maadam");
        boolean isPalindrome = checkPalindromeStringBuilder(str);
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    private static boolean checkPalindromeStringBuilder(StringBuilder str) {
        if (str == null || str.length() == 0) {
            return true; // Check for null or empty string
        }

        // Using StringBuilder's reverse method to check palindrome
        StringBuilder reversedStr = new StringBuilder(str).reverse();
        return str.toString().equalsIgnoreCase(reversedStr.toString());// Compare ignoring case

        //        str = new StringBuilder(str.toString().toLowerCase()); // Convert to lowercase for case-insensitive comparison
//        int start = 0;
//        int end = str.length() - 1;
//
//        //while loop method to check palindrome
//        while (start < end) {
//            if (str.charAt(start) != str.charAt(end)) {
//                return false; // Characters do not match, not a palindrome
//            }
//            start++;
//            end--;
//        }
//        return true;

//        //for loop method to check palindrome
//        for (int i = 0; i < str.length() / 2; i++) {
//            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
//                return false; // Characters do not match, not a palindrome
//            }
//        }
//        return true;
    }
}
