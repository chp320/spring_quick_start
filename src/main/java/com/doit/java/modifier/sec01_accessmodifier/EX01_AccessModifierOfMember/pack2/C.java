package com.doit.java.modifier.sec01_accessmodifier.EX01_AccessModifierOfMember.pack2;

import com.doit.java.modifier.sec01_accessmodifier.EX01_AccessModifierOfMember.pack1.A; // pack1의 클래스 A 임포트

public class C {
    public void print() {
        // 객체 생성
        A a = new A();

        // 멤버 활용
        System.out.print(a.a + " ");
//        System.out.print(a.b + " ");  // protect 필드 접근 불가
//        System.out.print(a.c + " ");  // default 필드 접근 불가
//        System.out.print(a.d + " ");  // private 필드 접근 불가
        System.out.println();
    }
}
