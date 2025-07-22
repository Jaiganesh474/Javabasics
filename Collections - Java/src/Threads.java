
//class AN implements Runnable{
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("hi");
//            try {
//                Thread.sleep(10); // Sleep for 10 milliseconds
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}

//class BN implements Runnable{
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("hello");
//            try {
//                Thread.sleep(10); // Sleep for 10 milliseconds
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}

public class Threads {
    public static void main(String[] args) {
        Runnable a = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(10); // Sleep for 10 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable b = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(10); // Sleep for 10 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        // Start both threads
        t1.start();
        t2.start();
    }
}
