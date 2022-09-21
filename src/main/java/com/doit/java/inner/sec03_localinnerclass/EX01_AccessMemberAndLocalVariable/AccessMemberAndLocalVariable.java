package com.doit.java.inner.sec03_localinnerclass.EX01_AccessMemberAndLocalVariable;

/** 지역 이너 클래스 내부에서 외부 멤버 및 메서드 지역변수 활용 */

class A {
    int a = 3;      // 필드
    void abc() {
        int b = 5;  // 지역 변수
        // 지역 이너 클래스 선언
        class B {
            void bcd() {
                System.out.println(a);
                System.out.println(b);
                a = 5;
            }
        }
        // 지역 이너 클래스 객체 생성
        B bb = new B();
        // 메서드 호출 -> 메모리에 로딩
        bb.bcd();
    }
}
public class AccessMemberAndLocalVariable {
}
