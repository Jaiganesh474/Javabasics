class Counter{
    int count ;
    public synchronized void increment() {
        count++;
    }
}

public class CounterThreads {
    public static void main(String[] args) {


        Runnable obj1 = () ->
        {
            Counter counter = new Counter();
            for (int i = 1; i <=1000; i++) {
                counter.increment();
            }
            System.out.println("Counter value: " + counter.count);
        };
        Runnable obj2 = () ->
        {
            Counter counter = new Counter();
            for (int i = 1; i <=1000; i++) {
                counter.increment();
            }
            System.out.println("Counter value: " + counter.count);
        };
        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);
        thread1.start();
        thread2.start();

    }
}
