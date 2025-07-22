import java.util.Random;

public class RandomCharString {
    public static void main(String[] args) {
        // Generate a random string of 10 characters
        String randomString = generateRandomString(100);
        System.out.println("Random String: " + randomString);
    }

    private static String generateRandomString(int size) {
        StringBuilder sb = new StringBuilder(size);

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int randomChar = 97+(int)(random.nextFloat()*26); // 97 is the ASCII value for 'a'
            sb.append((char) randomChar);
        }

        return sb.toString();
    }
}
