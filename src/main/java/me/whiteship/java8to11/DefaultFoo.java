package me.whiteship.java8to11;

public class DefaultFoo implements Foo, Bar{

    String name;


  /*  @Override
    public void printNameUpperCase() {
        System.out.println(this.name.toUpperCase());
    }*/

    public DefaultFoo(String name) {
        this.name = name;
    }


    @Override
    public void printName() {
        System.out.println(this.name);
    }

    @Override
    public void printNameUpperCase() {
        Foo.super.printNameUpperCase();
    }

    @Override
    public String getName() {
        return this.name;
    }



}
