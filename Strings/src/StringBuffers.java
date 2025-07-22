import java.util.Random;

public class StringBuffers {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        System.out.println("Original StringBuffer: " + sb);
        sb.replace(0, 5, "world");
        System.out.println("After appending 'world': " + sb);

        String str="Jai";
        System.out.println(str.replaceAll( "Jai", "Leo"));

        String str1=" ";
        String str2="p";
        String stradd= str1 + str2;
        System.out.println(stradd);

        Random random= new Random();
        System.out.println("Random Integer: " + random.nextInt(100)); // Generates a random integer between 0 and 99

    }
}
