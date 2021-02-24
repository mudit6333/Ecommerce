//Schedule task using schedule(), scheduleAtFixedRate() and scheduleAtFixedDelay()

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class thread8 extends Thread {

    public void run() {
        try {
            this.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName());
    }

}

public class Ques8 extends Thread {


    public static void main(String[] args) {

        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.schedule(new Ques8(), 2, TimeUnit.MILLISECONDS);
        executor.scheduleAtFixedRate(new Ques8(), 1, 1, TimeUnit.MILLISECONDS);
        executor.scheduleWithFixedDelay(new Ques8(), 1, 1, TimeUnit.MILLISECONDS);
        executor.shutdown();
    }
}