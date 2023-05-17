package me.whiteship.java8to11;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.*;

public class Foo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        /*ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> hello = () -> {
            Thread.sleep(2000L);
            return "Hello";
        };

        Future<String> helloFuture = executorService.submit(hello);
        System.out.println(helloFuture.isDone());

        System.out.println("Started! ");

        helloFuture.cancel(true);

        //helloFuture.get();
        System.out.println(helloFuture.isDone());
        System.out.println("End!");
        executorService.shutdown();
        */

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        Callable<String> hello = () -> {
            Thread.sleep(2000L);
            return "Hello";
        };

        Callable<String> java = () -> {
            Thread.sleep(3000L);
            return "Java";
        };

        Callable<String> keesun = () -> {
            Thread.sleep(1000L);
            return "keesun";
        };

        /*List<Future<String>> futures = executorService.invokeAll(Arrays.asList(hello, java, keesun));

        for ( Future<String> f : futures) {
            System.out.println(f.get());
        }*/

        String s = executorService.invokeAny(Arrays.asList(hello, java, keesun));
        System.out.println(s);



        executorService.shutdown();


    }



}
