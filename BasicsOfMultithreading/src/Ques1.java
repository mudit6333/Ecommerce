//Create and Run a Thread using Runnable Interface and Thread class


class thread extends Thread {
    public void run() {
        System.out.println("thread from thread class");
    }
}


class runnable implements Runnable {
    public void run() {
        System.out.println("thread from runnable class");
    }
}

public class Ques1 {
    public static void main(String[] arsg) {
        thread t1 = new thread();
        t1.start();

        Thread t2 = new Thread(new runnable());
        t2.start();
    }
}
