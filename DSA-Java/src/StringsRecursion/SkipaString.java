package StringsRecursion;

public class SkipaString {
    public static void main(String[] args) {
        System.out.println(skipString( "baccaad"));

    }

    static String skipString( String ogstring) {
        if (ogstring.isEmpty()) {

            return ""; // Base case: if the string is empty, print the result
        }
        String wantToSkip="aa";


        if (ogstring.startsWith(wantToSkip)) {
            return  skipString(ogstring.substring(wantToSkip.length())); // Skip the string "aa"
        } else {
            return ogstring.charAt(0)+ skipString(ogstring.substring(1)); // Include the character
        }
    }
}
