//Use sleep and join methods with thread.
class sleepAndJoin extends Thread {
    public static int count = 0;
    private int num = 0;

    public sleepAndJoin() {
        num = ++count;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(" Thread " + num + " : running");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Ques2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new sleepAndJoin();
        Thread t2 = new sleepAndJoin();
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("main thread");
    }

}
