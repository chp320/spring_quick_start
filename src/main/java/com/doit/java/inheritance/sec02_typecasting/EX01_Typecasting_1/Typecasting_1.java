package com.doit.java.inheritance.sec02_typecasting.EX01_Typecasting_1;

// 클래스의 상속 관계
class A {}
class B extends A {}
class C extends B {}
class D extends B {}

public class Typecasting_1 {
    public static void main(String[] args) {
        // 업캐스팅(자동 변환): 캐스팅 구문을 생략했을 때 컴파일러가 자동으로 추가
        A ac = (A) new C(); // C -> A 업캐스팅
        B bc = (B) new C(); // C -> B 업캐스팅

        B bb = new B();
        A a = (A) bb;   // B -> A 업캐스팅

        // 다운캐스팅(수동 변환): 캐스팅할 수 없음(실행할 때 예외 발생)
        A aa = new A();
//        B b = (B) aa;   // A -> B 다운캐스팅 : 불가능
//        C c = (C) aa;   // C -> A 다운캐스팅 : 불가능

        // 다운캐스팅(수동 변환): 캐스팅 가능한 경우
        A ab = new B();
        B b = (B) ab;       // A -> B 다운캐스팅
//        C c = (C) ab;       // A -> C 다운캐스팅 : 불가능

        B bd = new D();
        D d = (D) bd;       // B -> D 다운캐스팅

        A ad = new D();
        B b1 = (B) ad;      // A -> B 다운캐스팅
        D d1 = (D) ad;      // A -> D 다운캐스팅
    }
}
