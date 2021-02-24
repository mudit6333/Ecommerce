/*
 * Coordinate 2 threads using wait() and notify().
 * */

class WaitAndNotify {

    public void method1() throws Exception {
        synchronized (this) {
            System.out.println("method 1 : ");
            wait();
            System.out.println("Ended Method 1");
        }
    }

    public void method2() {
        synchronized (this) {
            System.out.println("method 2 : ");
            System.out.println("Ended Method 2");
            notify();

        }
    }
}

public class Ques13 {
    public static void main(String[] args) {

        WaitAndNotify waitAndNotify = new WaitAndNotify();
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                try {
                    waitAndNotify.method1();
                } catch (Exception ex) {
                    System.out.println(ex);
                }

            }
        });
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                waitAndNotify.method2();
            }
        });
        thread2.start();
    }
}