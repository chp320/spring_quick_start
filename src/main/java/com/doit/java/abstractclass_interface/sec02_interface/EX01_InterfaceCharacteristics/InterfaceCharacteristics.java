package com.doit.java.abstractclass_interface.sec02_interface.EX01_InterfaceCharacteristics;

/**
 * 인터페이스 내 필드 및 메서드의 제어자
 */

interface A {
    public static final int a = 3;

    public abstract void abc();
}

interface B {
    int b = 3;      // 생략 시 자동으로 public static final 추가

    void bcd();     // 생략 시 자동으로 public abstract 추가
}
public class InterfaceCharacteristics {
    public static void main(String[] args) {
        // static 자동 추가 확인
        System.out.println(A.a);
        System.out.println(B.b);

        // final 자동 추가 확인
//        A.a = 5 ;   // 불가능
//        B.b = 5 ;   // 불가능
    }
}
