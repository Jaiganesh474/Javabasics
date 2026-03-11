
public class ReverseWord {
    public static void main(String[] args) {
        
        String str = "Hello World";

        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            String reverseWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }

            result = result + reverseWord + " ";
        }

        
        System.out.println("Reversed Output: " + result.trim());
        
       
    }
}