package com.doit.java.abstractclass_interface.sec02_interface.EX05_CreateObjectOfInterface_2;

/**
 * 익명 이너클래스를 활용해 인터페이스 객체 생성
 */

interface A {
    int a = 3;      // 자동으로 public static final 추가

    void abc();     // 자동으로 public abstract 추가
}

public class CreateObjectOfInterface_2 {
    public static void main(String[] args) {
        // 객체 생성
        A a1 = new A() {
            @Override
            public void abc() {
                System.out.println("방법 2. 익명 이너 클래스를 이용한 객체 생성");
            }
        } ;
        A a2 = new A() {
            @Override
            public void abc() {
                System.out.println("방법 2. 익명 이너 클래스를 이용한 객체 생성");
            }
        } ;

        // 메서드 호출
        a1.abc();
        a2.abc();
    }
}
