package com.doit.java.inner.sec04_anonymousclass.EX02_AnonymousClass_2;

/**
 * 익명 이너 클래스를 활용해 인터페이스 객체 생성
 */

interface C {
    public abstract void bcd();
}

class A {
    // 익명 이너 클래스
    C c = new C() {
        public void bcd() {
            System.out.println("익명 이너 클래스");
        }
    } ;
    void abc() {
        c.bcd();
    }
}

public class AnonymousClass_2 {
    public static void main(String[] args) {
        // 객체 생성 및 메서드 호출
        A a = new A();
        a.abc();
    }
}
