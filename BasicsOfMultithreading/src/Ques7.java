import java.util.concurrent.*;

class MyThread implements Runnable{
    private static int count=0;

    @Override
    public void run() {
        System.out.println("Thread :  "+ ++count);
    }
}

public class Ques7 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread();

        ExecutorService executors = Executors.newSingleThreadExecutor();
        executors.submit(t1);
        executors.submit(t2);
        executors.submit(t3);
        executors.submit(t4);

        executors.shutdown();

        executors.awaitTermination(1,TimeUnit.HOURS);

        System.out.println("complete");
    }
}