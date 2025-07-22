//if (condition) {
//        // executes if condition is true
//        } else {
//        // executes if condition is false
//        }

//if-else if-else Ladder
//if (condition1) {
//        // executes if condition1 is true
//        } else if (condition2) {
//        // executes if condition2 is true
//        } else {
//        // executes if none of the conditions are true
//        }


public class If_else {
    public static void main(String[] args) {
        int age = 16;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // Example with multiple conditions
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D or below");
        }
    }
}
