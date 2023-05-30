package me.whiteship.java8to11;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.*;

public class Foo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

       /* CompletableFuture<String> future = CompletableFuture.completedFuture("keesun");
        System.out.println(future.get());
*/
        /*CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
        });
        future.get();
*/

        /**
         * thenApply
         */
/*
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        }).thenApply((s) -> {
            System.out.println(Thread.currentThread().getName());
            return s.toUpperCase();
        });
*/

        /**
         * thenAccept
         */
       /* CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        }).thenAccept((s) -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(s.toUpperCase());
        });
*/

        /**
         * thenRun
         */
     /*   CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        }).thenRun(() -> {
            System.out.println(Thread.currentThread().getName());
        });

        System.out.println(future.get());*/


/*        ExecutorService executorService = Executors.newFixedThreadPool(4);
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        }, executorService).thenRunAsync(() -> {
            System.out.println(Thread.currentThread().getName());
        }, executorService);

        System.out.println(future.get());*/




    }



}
