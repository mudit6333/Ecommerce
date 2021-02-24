//Return a Future from ExecutorService by using call able and use get(), isDone(), isCancelled() with the Future object to know the status of task submitted.

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ques6 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<String> str = executorService.submit(new Callable<String>() {
            public String call() throws Exception {
                return "done";
            }
        });

        executorService.shutdown();
     //   System.out.println(executorService.isTerminated());

    while(true)
        {   if (str.isDone()) {
            try {
                System.out.println(str.get());
                break;
            } catch (Exception e) {
                e.printStackTrace();
                //   System.out.println("inter");
            }
        }
    }
        if (str.isCancelled()) {
            System.out.println("Your task has been cancelled");
        }


    }
}