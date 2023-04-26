package me.whiteship.java8to11;

import java.time.Duration;
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
   /*     springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));*/
        springClasses.add(new OnlineClass(5, "rest api development ", false));

        Optional<OnlineClass> optional = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();

        //OnlineClass onlineClass = optional.orElseGet(App::createNewJpaClassess);

        //OnlineClass onlineClass = optional.orElseThrow(IllegalStateException::new);

        /*Optional<OnlineClass> onlineClass = optional.filter(OnlineClass::isClosed);
        System.out.println(onlineClass.isEmpty());*/

        Optional<Integer> integer = optional.map(oc -> oc.getId());
        System.out.println(integer.isPresent());


        Optional<Progress> progress = optional.flatMap(OnlineClass::getProgress);

        Optional<Optional<Progress>> progress1 = optional.map(OnlineClass::getProgress);
        Optional<Progress> progress2 = progress1.orElseThrow();

    }
    private static OnlineClass createNewJpaClassess() {
        System.out.println("creating new online class");
    return new OnlineClass(10,"New class",false);
    }
}
