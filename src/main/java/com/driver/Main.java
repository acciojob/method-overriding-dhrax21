package com.driver;


public class Main {

    public static void main(String[] args) {
        A obj=new A();

        System.out.println(obj.meth());
        // calling again by overriding
        
        B obj1=new B();

        System.out.println(obj1.meth());
    }
}
