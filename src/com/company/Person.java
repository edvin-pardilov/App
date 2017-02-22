package com.company;

/**
 * Created by edvin on 22.02.2017.
 */
public class Person {
    public int height =180;
    public String name="Dethault";
    public void say (String name) {
        System.out.println("Hello, " + name);
    }
    public Person(){}
    public Person(int h,String n){
        height=h;
        name=n;
    }
    public Person(String n){
        name=n;
    }

}
