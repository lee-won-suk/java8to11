package me.whiteship.java8to11;

import java.util.function.*;

public class Foo {
    public static void main(String[] args) {



        //자바에서 제공해주는 api 사용
    /*    Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(1)); // -> 11
*/

      /*  Function<Integer, Integer> plus10 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer i) {
                return i + 10;
            }
        };*/



        //입력값을 가지고 파라미터로 들어온 함수를 먼저 적용한다, 그 결과값을 plus10의 파라미터로 사용해서 연산한다. 함수를 파라미터로 받을 수도 있는 고차함수의 성격.
       /*
        Function<Integer, Integer> plus10 = i -> i + 10;
        Function<Integer, Integer> multiply2 = i -> i * 2;
       Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
        System.out.println(multiply2AndPlus10.apply(2));
*/

    /*    Function<Integer, Integer> plus10 = i -> i + 10;
        Function<Integer, Integer> multiply2 = i -> i * 2;
        System.out.println(plus10.andThen(multiply2).apply(2));
*/

        /**
         * Consumer 사용하기
         */
/*
        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(10);
*/

        /*Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());*/

        /**
         * Predicate 사용
         */
/*
        Predicate<String> startWithKeesun = (s) -> s.startsWith("keesun");
        System.out.println(startWithKeesun.test("wonsuk"));
*/

        /**
         * 입력값과 결과값의 타입이 같으면 FUnction<> 대신 UnaryOperator를 사용할 수 있다.
         *//*
        UnaryOperator<Integer> plus10 = (i) -> i + 10;
        UnaryOperator<Integer> multiply2 = (i) -> i * 2;
        System.out.println(plus10.compose(multiply2).apply(2));*/

        /**
         * BinaryOperator :
         * biFunction의 파라미터가 모두 동일한 타입일 경우
         */



        BiFunction<Integer,Integer,Integer> biFunction = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return null;
            }
        };






        // java8 이전에는 이런 익명 내부클래스를 구현해서 인터페이스를 사용할 수 있었다. anonymous inner class
       /* RunSomething runSomething = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("Hello");
            }
        };*/


        // 한줄일 경우 이렇게 lamda로 변경해줄 수 있다. 익명내부클래스일 때 코드를 줄일 수 있음
        //RunSomething runSomething = () -> System.out.println("Hello");

        // 한줄이 아닐 경우 이렇게 lamda로 변경해줄 수 있다.
     /*   RunSomething runSomething = () -> {
            System.out.println("Hello");
            System.out.println("lambda");
        };*/

        //순수 함수
  /*      RunSomething runSomething = (number) -> {
            return number + 10;
        };
*/

      /*   RunSomething runSomething = new RunSomething() {

             int baseNumber = 10;
             @Override
             public int doIt(int number) {
                 return number + baseNumber;
             }
         };*/





    }
}
