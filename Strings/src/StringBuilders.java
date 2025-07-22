public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder series = new StringBuilder(); // Using StringBuilder for better performance
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('A' + i);
            series.append(ch); // Appending characters to the StringBuilder
        }
        System.out.println("String series using StringBuilder: " + series.toString());
        System.out.println("String reversed series using StringBuilder: " + series.reverse().toString());
    }
}
