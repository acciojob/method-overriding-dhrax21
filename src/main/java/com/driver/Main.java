package com.driver;


public class Main {

    public static void main(String[] args) {
        B b=new B();

        System.out.println(b.meth());
        // calling again by overriding

        System.out.println(b.meth());
    }
}
