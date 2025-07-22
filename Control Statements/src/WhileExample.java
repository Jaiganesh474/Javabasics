public class WhileExample {
    public static void main(String[] args) {
        // Example of a while loop
        // syntax - while (condition) {
        //             // code block to be executed
        //         }

        int count = 0;
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // Example of a do-while loop
        // Note: The do-while loop will execute at least once, even if the condition is false
        //syntax - do {
        //         // code block to be executed
        //     } while (condition);

        int number = 5;
        do {
            System.out.println("Number: " + number);
            number++;
        } while (number < 2);

        // Example of a nested while loop
        // syntax - while (condition1) {
        //              while (condition2) {
        //                  // code block to be executed
        //              }
        //          }

        int i = 1;
        while (i <= 3) {
            int j = 1;
            while (j <= 3) {
                System.out.println("i: " + i + ", j: " + j);
                j++;
            }
            i++;
        }
    }
}
