package com.driver;


public class Main {

    public static void main(String[] args) {
        B obj=new A();

        System.out.println(obj.meth());
        // calling again by overriding
        
        B obj=new B();

        System.out.println(obj.meth());
    }
}
