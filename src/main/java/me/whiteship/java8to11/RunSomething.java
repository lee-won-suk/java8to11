package me.whiteship.java8to11;


@FunctionalInterface // 이걸 사용하면 추상메서드가 1개가 아닐경우 에러를 내기 때문에 더 관리하기 좋다.
public interface RunSomething {

    //추상메서드가 1개만 있는 인터페이스가 함수형 인터페이스이다.
    //abstract void doIt();
    int doIt(int number);


    //인터페이스 내부에서 static, default 모두 정의 가능. 더 다양한 것을 인터페이스에서 정의할 수 있다.
    //이렇게 다른 형태 메서드가 여러개 존재해도 그대로 함수형 인터페이스이다. 중요한건 추상메서드가 1개인가이다.
    public static void printName() {
        System.out.println("Keesun");
    }

    default void printAge() {
        System.out.println("40");
    }


}

