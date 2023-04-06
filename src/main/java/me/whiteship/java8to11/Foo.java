package me.whiteship.java8to11;

import java.util.function.*;

public class Foo {
    public static void main(String[] args) {


        Foo foo = new Foo();
        foo.run();

    }

    private void run() {

        int baseNumber = 10;


/*        Class LocalClass {

            void printBaseNumber() {
                System.out.println(baseNumber);
            }
        }*/


        /**
         *  익명 클래스 내부에서 로컬변수 참조하는 방법
         */
      /*   Consumer<Integer> integerConsumer = new Consumer<Integer>() {

           @Override
            public void accept(Integer Integer) {
                System.out.println(baseNumber);
            }


        };



        IntConsumer printInt = (i) -> {
            System.out.println(i + baseNumber);
        };

        printInt.accept(10);
        baseNumber++;

    */
    }
}
