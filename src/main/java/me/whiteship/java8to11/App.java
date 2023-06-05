package me.whiteship.java8to11;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

/**
 * thenCompose
 */
  /*      //리턴값이 있을 때 supplyAsync 사용
        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() ->{
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        });

        CompletableFuture<String> future = hello.thenCompose(App::getWorld);
        System.out.println(future.get());

    }

    private static CompletableFuture<String> getWorld(String message) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("world" + Thread.currentThread().getName());
            return message + "world";

        });
    }*/

/**
 *
 * thenCombine
 */
    /*    //리턴값이 있을 때 supplyAsync 사용
        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        });


        //리턴값이 있을 때 supplyAsync 사용
        CompletableFuture<String> world = CompletableFuture.supplyAsync(() -> {
            System.out.println("world " + Thread.currentThread().getName());
            return "world";
        });

        //함수형 인터페이스 BiFunction 사용 2개의 인풋으로 1개의 결과를 리턴
        CompletableFuture<String> future = hello.thenCombine(world, new BiFunction<String, String, String>() {
            @Override
            public String apply(String h, String w) {
                return h + " " + w;
            }
        });
        //CompletableFuture<String> future = hello.thenCombine(world, (h, w) -> h + " " + w);
        System.out.println(future.get());
    */


/**
 * allOf
 */
      /*  CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        });


        //리턴값이 있을 때 supplyAsync 사용
        CompletableFuture<String> world = CompletableFuture.supplyAsync(() -> {
            System.out.println("world " + Thread.currentThread().getName());
            return "world";
        });

        //함수형 인터페이스 BiFunction 사용 2개의 인풋으로 1개의 결과를 리턴

        List<CompletableFuture<String>> futures = Arrays.asList(hello, world);

        CompletableFuture [] futuresArray = futures.toArray(new CompletableFuture[futures.size()]);

        CompletableFuture<List<String>> results = CompletableFuture.allOf(futuresArray)
                .thenApply(v -> futures.stream()// 이 시점에는 모든 task들이 끝나 있는 상황.
                            .map(CompletableFuture::join)// get 대신 사용.
                            .collect(Collectors.toList()));


results.get().forEach(System.out::println);*/

/**
 * anyOf
 */
 /*       CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        });


        //리턴값이 있을 때 supplyAsync 사용
        CompletableFuture<String> world = CompletableFuture.supplyAsync(() -> {
            System.out.println("world " + Thread.currentThread().getName());
            return "world";
        });

        CompletableFuture<Void> future = CompletableFuture.anyOf(hello, world).thenAccept(System.out::println);
        future.get();*/


        /**
         * 예외처리
         */
        boolean throwError =false;

        CompletableFuture<String> hello = CompletableFuture.supplyAsync(() -> {

           if (throwError) {
               throw new IllegalArgumentException();
           }
            System.out.println("Hello " + Thread.currentThread().getName());
            return "Hello";
        }).handle((result, ex) -> {

            if(ex !=null) {
                System.out.println(ex);
                return "ERROR!";
            }
            return result;
        });
        System.out.println(hello.get());




    }
}