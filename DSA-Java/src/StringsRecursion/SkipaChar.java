package StringsRecursion;

public class SkipaChar {
    public static void main(String[] args) {
        skipChar("", "baccaad");
    }
    static void skipChar(String updStr, String ogstring) {
        if (ogstring.isEmpty()) {
            System.out.println(updStr);
            return; // Base case: if the string is empty, print the result
        }
        char firstChar = ogstring.charAt(0);

        if (firstChar == 'a') {
            skipChar(updStr, ogstring.substring(1)); // Skip the character
        } else {
            skipChar(updStr+firstChar, ogstring.substring(1)); // Include the character
        }
    }
}
