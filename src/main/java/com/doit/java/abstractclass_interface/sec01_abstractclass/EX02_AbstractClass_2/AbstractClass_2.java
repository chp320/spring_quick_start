package com.doit.java.abstractclass_interface.sec01_abstractclass.EX02_AbstractClass_2;

/**
 * 추상 클래스의 객체 생성 방법 - 익명 이너 클래스 활용
 */

abstract class A {
    abstract void abc();
}

public class AbstractClass_2 {
    public static void main(String[] args) {
        // 객체 생성
        A a1 = new A() {
            @Override
            void abc() {
                System.out.println("방법 2. 익명 이너 클래스 방법으로 객체 생성");
            }
        } ;
        A a2 = new A() {
            @Override
            void abc() {
                System.out.println("방법 2. 익명 이너 클래스 방법으로 객체 생성");   // 객체를 생성할 때마다 오버라이딩 필요 -> 즉,
            }
        } ;

        // 메서드 호출
        a1.abc();
        a2.abc();
    }
}
