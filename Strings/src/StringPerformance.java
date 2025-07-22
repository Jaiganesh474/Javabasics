public class StringPerformance {
    public static void main(String[] args) {
        String series="";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('A' + i);
            series+= ch; // Concatenating characters to the string
        }
        System.out.println("String series using concatenation: " + series.toLowerCase());
    }
}
