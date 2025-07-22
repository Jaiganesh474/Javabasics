//syntax
//switch(expression) {
//        case value1:
//        // code block
//        break;
//        case value2:
//        // code block
//        break;
//// more cases...
//default:
//        // default block
//        }


public class Switch {
    public static void main(String[] args) {
        int day = 3; // Example day of the week (1-7)

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day.. Please enter a number between 1 and 7.");
        }
    }
}
