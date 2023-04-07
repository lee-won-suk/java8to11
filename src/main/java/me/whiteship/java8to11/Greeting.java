package me.whiteship.java8to11;

public class Greeting {

    private String name;

    public Greeting() {

    }


    public String getName() {
        return name;
    }

    /**
     * name을 받는 생성자.
     * @param name
     */
    public Greeting(String name) {
        this.name = name;
    }

    /**
     인스턴스 메서드
     */
    public String hello(String name) {
        return "hello " + name;
    }

    /**
     * 스태틱 메서드
     * @param name
     * @return
     */
    public static String hi(String name) {
        return "hi " + name;
    }


}
