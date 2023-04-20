package me.whiteship.java8to11;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api development ", false));


        System.out.println("spring으로 시작하는 수업");

        springClasses.stream().filter(oc -> {
                    return oc.getTitle().startsWith("spring");
                })
                .forEach(oc -> System.out.println(oc.getId()));


        System.out.println("close 되지 않은 수업");
        springClasses.stream().filter(Predicate.not(OnlineClass::isClosed))
                        .forEach(oc -> System.out.println(oc.getId()));

        System.out.println("수업 이름만 모아서 스트림 만들기");
/*        springClasses.stream().map(oc -> oc.getTitle())
                .forEach(s -> System.out.println(s));*/
        springClasses.stream().map(OnlineClass::getTitle)
                .forEach(System.out::println);

        List<OnlineClass> javaClass = new ArrayList<>();
        javaClass.add(new OnlineClass(6, "The Java, Test", true));
        javaClass.add(new OnlineClass(7, "The Java, Code manipulation", true));
        javaClass.add(new OnlineClass(8, "The Java, 8 to 11", true));

        List<List<OnlineClass>> keesunEvents = new ArrayList<>();
        keesunEvents.add(springClasses);
        keesunEvents.add(javaClass);


        System.out.println("두 수업 목록에 들어있는 모든 수업 아이디 출력");
        keesunEvents.stream().flatMap(Collection::stream)// flat 시키기위해 list -> list.stream() 작성
                .forEach(onlineClass -> System.out.println(onlineClass.getId()));//여기서부터 OnlineClass 객체가 지나가는 상황.
                // 왜냐하면 flat하게 만들었기 때문이다.


        System.out.println("10부터 1씩 증가하는 무제한 스트림 중에서 앞에 10개 빼고 최대 10개 까지만");
        Stream.iterate(10, integer -> integer + 1)
                .skip(10)
                .limit(10)
                .forEach( integer -> System.out.println(integer));



        System.out.println("자바 수업 중에 Test가 들어있는 수업이 있는지 확인");
        boolean test = javaClass.stream().anyMatch(oc -> oc.getTitle().contains("Test"));
        System.out.println(test);



        System.out.println("스프링 수업 중에 제목에 spring이 들어간 제목만 모아서 List로 만들기");
        List<String> spring = springClasses.stream().filter(oc -> oc.getTitle().contains("spring"))//필터로 제목에 spring이 들어간 OnlineClass 객체를 필터링.
                .map(OnlineClass::getTitle)//필터링한 객체들의 제목만 모아서 map으로 형태변환
                .collect(Collectors.toList());//리스트로 변환

        spring.forEach(System.out::println);

    }
}