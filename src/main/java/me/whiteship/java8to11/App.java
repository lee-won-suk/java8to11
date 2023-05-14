package me.whiteship.java8to11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {

        /*ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() ->{
            System.out.println("Thread " + Thread.currentThread().getName());
        });

        executorService.shutdown();
        */

        //ExecutorService executorService = Executors.newFixedThreadPool(2);
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        //executorService.schedule(getRunnable("Hello"),3, TimeUnit.SECONDS);
        executorService.scheduleAtFixedRate(getRunnable("Hello"),1,2, TimeUnit.SECONDS);



        /*executorService.submit(getRunnable("keesun"));
        executorService.submit(getRunnable("The"));
        executorService.submit(getRunnable("java"));
        executorService.submit(getRunnable("Thread"));
        */


        //executorService.shutdown();



    }
    private static Runnable getRunnable(String message) {

        return () -> System.out.println(message + Thread.currentThread().getName());
    }


}
