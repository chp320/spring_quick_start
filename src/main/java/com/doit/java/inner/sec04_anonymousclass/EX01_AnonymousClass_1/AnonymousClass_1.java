package com.doit.java.inner.sec04_anonymousclass.EX01_AnonymousClass_1;

/**
 * 인터페이스를 상속한 이너 클래스를 생성해 인터페이스 객체 생성
 */

interface C {
    public abstract void bcd();
}

class A {
    C c = new B();
    void abc() {
        c.bcd();
    }
    class B implements C {
        @Override
        public void bcd() {
            System.out.println("인스턴스 이너 클래스");
        }
    }
}

public class AnonymousClass_1 {
    public static void main(String[] args) {
        // 객체 생성 및 메서드 호출
        A a = new A();
        a.abc();
    }
}
