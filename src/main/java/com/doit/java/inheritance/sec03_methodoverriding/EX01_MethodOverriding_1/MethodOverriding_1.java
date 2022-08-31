package com.doit.java.inheritance.sec03_methodoverriding.EX01_MethodOverriding_1;

class A {
    void print() {
        System.out.println("A 클래스");
    }
}

class B extends A {
    @Override
    void print() {
        System.out.println("B 클래스");
    }
}

public class MethodOverriding_1 {
    public static void main(String[] args) {
        // A타입 - A생성자
        A aa = new A();
        aa.print();

        // B타입 - B생성자
        B bb = new B();
        bb.print();

        // A타입 - B생성자
        A ab = new B();
        ab.print();
    }
}
