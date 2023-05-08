package me.whiteship.java8to11;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) throws InterruptedException {
      /*  MyThread myThread = new MyThread();
        myThread.start();

        System.out.println("Hello!");*/


      Thread thread = new Thread(() -> {

              System.out.println("Thread: " + Thread.currentThread().getName());
              try {
                  Thread.sleep(3000L);
              } catch (InterruptedException e) {
                  throw new IllegalStateException(e);
              }
        });
      thread.start();

      System.out.println("Hello: " + Thread.currentThread().getName());
      thread.join();
        System.out.println(thread + " is finished");

    }

/*    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread: " + Thread.currentThread().getName());
        }
    }*/
}
