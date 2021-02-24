//Increase concurrency with Thread pools using newCachedThreadPool() and newFixedThreadPool().

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class ThreadClass1 extends Thread{

    private static int count=0;
    public void run() {
        System.out.println(this.getName()+" from ThreadClass1");
    }
}
class ThreadClass2 extends Thread{
    @Override
    public void run() {
        System.out.println(this.getName()+" from ThreadClass2");
    }
}

public class Ques9 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService1 = Executors.newFixedThreadPool(2);

        ThreadPoolExecutor cached= (ThreadPoolExecutor) executorService;
        ThreadPoolExecutor fixed=(ThreadPoolExecutor) executorService1;

        for (int i = 0; i <= 5; i++) {
            executorService.submit(new ThreadClass1());
        }
        executorService.shutdown();

        for (int i = 0; i <= 5; i++) {
            executorService1.submit(new ThreadClass2());
        }
        executorService1.shutdown();
        System.out.println("Total threads created in cached pool "+cached.getPoolSize());
        System.out.println("Total thread created in fixed pool "+fixed.getPoolSize());
    }
}
