import java.time.Duration;

class ThreadType1 extends Thread {
    @Override
    public void run() {
        System.out.println("ThreadType1 is running");
    }
}
class ThreadType2 extends Thread {
    @Override
    public void run() {
        System.out.println("ThreadType2 is running");
    }
}

public class ThreadsTypes {
    public static void main(String[] args) {
        ThreadType1 thread1 = new ThreadType1();
        ThreadType2 thread2 = new ThreadType2();
        thread1.start();
        thread2.start();
        try {
            thread1.join(); // Wait for thread1 to finish
            thread2.join();

            Thread.sleep(Duration.ofMillis(10));
            Thread.sleep(Duration.ofMillis(10));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Both threads have finished execution");

    }
}
