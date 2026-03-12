package Boardprobs;

public class Triangle {

    //Pyramid pattern
    public static void printStars(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    public static void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j > 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printStars(5);
        printTriangle(5);
    }
}
