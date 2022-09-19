package com.doit.java.abstractclass_interface.sec02_interface.EX04_CreateObjectOfInterface_1;

/**
 * 자식 클래스를 직접 정의해 인터페이스 객체 생성
 */

interface A {
    int a = 3;      // 자동으로 public static final 추가됨

    void abc();     // 자동으로 public abstract 추가됨
}

class B implements A {

    @Override
    public void abc() {
        System.out.println("방법 1. 자식 클래스 생성자로 객체 생성");
    }
}

public class CreateObjectOfInterface_1 {
    public static void main(String[] args) {
        // 객체 생성
        A b1 = new B();
        A b2 = new B();

        // 메서드 호출
        b1.abc();
        b2.abc();
    }
}
