package com.doit.java.abstractclass_interface.sec01_abstractclass.EX01_AbstractClass_1;

/** 추상 클래스의 객체 생성 방법 - 자식 클래스 활용 */

abstract class A {
    abstract void abc();
}

class B extends A {
    @Override
    void abc() {
        System.out.println("방법 1. 자식 클래스 생성 및 추상 메서드 구현");
    }
}

public class AbstractClass_1 {
    public static void main(String[] args) {
        // 객체 생성
        A b1 = new B();
        A b2 = new B();

        // 메서드 호출 -> 자식 클래스 생성자 호출로 객체를 몇 개든 생성 가능
        b1.abc();
        b2.abc();
    }
}
